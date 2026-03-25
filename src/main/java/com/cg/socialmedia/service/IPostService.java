package com.cg.socialmedia.service;

import com.cg.socialmedia.dto.PostDTO;
import java.util.List;

public interface IPostService {

    List<PostDTO> getAllPosts();

    List<PostDTO> getPostsByUser(int userId);
}