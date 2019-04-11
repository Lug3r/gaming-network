package org.launchcode.thegamingnetwork.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.launchcode.thegamingnetwork.models.User;
import org.launchcode.thegamingnetwork.models.dao.PostDao;
import org.launchcode.thegamingnetwork.models.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

public abstract class AbstractController {

        @Autowired
        protected UserDao userDao;

        @Autowired
        protected PostDao postDao;

    public static final String userSessionKey = "user_id";

    protected User getUserFormSession(HttpSession session) {
            Integer userId = (Integer) session.getAttribute(userSessionKey);

            return userId == null ? null : userDao.findByUid(userId);
    }

    protected void setUserInSession(HttpSession session, User user) {

            session.setAttribute(userSessionKey, user.getUid());
    }


}
