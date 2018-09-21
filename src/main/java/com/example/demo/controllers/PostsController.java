package com.example.demo.controllers;

import com.example.demo.database.dto.PostDto;
import com.example.demo.services.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostsController {

    private PostsService postsService;

    @Autowired
    public PostsController(PostsService postsService) {
        this.postsService = postsService;
    }

    /**
     * Returns post with id = 1
     *
     * @param model data
     * @return post with id=1
     */
    @RequestMapping(value = "/")
    public String homePage(Model model) {

        PostDto postDto = postsService.findById(1);

        model.addAttribute("userId", postDto.getUserId());
        model.addAttribute("title", postDto.getTitle());
        model.addAttribute("body", postDto.getBody());

        return "index";
    }

    /**
     * Finds post object by given id
     *
     * @param id    post id
     * @param model data
     * @return post with given id
     */
    @RequestMapping(value = "/{id}")
    public String homePage(@PathVariable Integer id, Model model) {

        PostDto postDto = postsService.findById(id);

        model.addAttribute("userId", postDto.getUserId());
        model.addAttribute("title", postDto.getTitle());
        model.addAttribute("body", postDto.getBody());

        return "index";
    }
}
