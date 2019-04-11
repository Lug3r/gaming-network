package org.launchcode.thegamingnetwork.controllers;


import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.boot.autoconfigure.web.AbstractErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AuthenticateUserController extends AbstractController {

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signupForm() {

        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signup(HttpServletRequest request, Model model){

        return "redirect: blog/newpost";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginForm() {

        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, Model model) {

        return "redirect:blog/newpost";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request) {
    request.getSession().invalidate();
        return "redirect:/";
    }
}