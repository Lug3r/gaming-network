package org.launchcode.thegamingnetwork.models;


import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "post")
public class Post extends AbstractEntity {

        private String title;
        private String body;
        private User author;
        private Date created;
        private Date modified;

        public Post() {}

        public Post(String title, String body, User author) {

            super();

            this.title = title;
            this.body = body;
            this.author = author;
            this.created = new Date();
            this.updated();

            author.addPost(this);
        }

        @NotNull
        @Column(name = "title")
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
            this.updated();
        }

        @NotNull
        @Column(name = "body")
        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
            this.updated();

        }

        @ManyToMany
        public User getAuthor() {
            return author;
        }

        @SuppressWarnings("unused")
        private void setAuthor(User author) {
            this.author = author;
        }

        @NotNull
        @OrderColumn
        @Column(name = "created")
        public Date getCreated() {
            return created;
        }

        @SuppressWarnings("unused")
        private void setCreated(Date created) {
            this.created = created;
        }

        @NotNull
        @Column(name = "modified")
        public Date getModified() {
            return modified;
        }

        @SuppressWarnings("unused")
        private void setModified(Date modified) {
            this.modified = modified;
        }

        private void updated() {
            this.modified = new Date();
        }
}



