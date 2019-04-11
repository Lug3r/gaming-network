package org.launchcode.thegamingnetwork.controllers;



import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostController extends AbstractController {

    @RequestMapping(value = "/blog/newpost", method = RequestMethod.GET)
    public String newPostForm() {
        return "newpost";

    }

    @RequestMapping(value = "/blog/newpost", method = RequestMethod.POST)
    public String newPost(HttpServletRequest request, Model model) {
        return "redirect:index";
    }

    @RequestMapping(value = "/blog/{username}/{uid}", method = RequestMethod.GET)
    public String singlePost(@PathVariable String username, @PathVariable int uid, Model model) {
        return "post";
    }

    @RequestMapping(value = "/blog/{username}", method = RequestMethod.GET)
    public String userPosts(@PathVariable String username, Model model) {
        return "blog";
    }
}
