package com.example.demo.services;

import com.example.demo.database.dto.PostDto;
import org.springframework.stereotype.Service;

import static com.example.demo.database.repository.PostRepository.getPostMap;

@Service
public class PostsService {

    /**
     * Finds post by given id
     * @param id post id
     * @return post with given id
     */
    public PostDto findById(int id) {
        return getPostMap().get(id);
    }
}
