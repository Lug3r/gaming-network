package org.launchcode.thegamingnetwork;


import org.launchcode.thegamingnetwork.controllers.AbstractController;
import org.launchcode.thegamingnetwork.models.User;
import org.launchcode.thegamingnetwork.models.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class AuthenticationInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    UserDao userDao;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

        List<String> authPages = Arrays.asList("/blog/newpost");

        if (authPages.contains(request.getRequestURI())) {

            boolean isLoggedIn = false;
            User user;
            Integer userId = (Integer) request.getSession().getAttribute(AbstractController.userSessionKey);

            if (userId != null) {
                user = userDao.findByUid(userId);

                if (user != null) {
                    isLoggedIn = true;
                }
            }

            if (!isLoggedIn) {
                response.sendRedirect("/login");
                return false;
            }
        }

        return true;


    }



}
