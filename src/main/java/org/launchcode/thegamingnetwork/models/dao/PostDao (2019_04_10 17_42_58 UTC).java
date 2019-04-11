package org.launchcode.thegamingnetwork.models.dao;

import org.launchcode.thegamingnetwork.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface PostDao extends CrudRepository<Post, Integer> {

    List<Post> findByAuthor(int authorId);
}
