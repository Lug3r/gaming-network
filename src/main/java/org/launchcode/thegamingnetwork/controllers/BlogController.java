package org.launchcode.thegamingnetwork.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController extends AbstractController {

    @RequestMapping(value = "/")
    public String index(Model model) {

        return "index";
    }

    @RequestMapping(value = "/blog")
    public String blogIndex(Model model) {

        return "blog";
    }

}
