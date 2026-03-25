package com.cg.socialmedia.service;

import com.cg.socialmedia.dto.CommentDTO;
import java.util.List;

public interface ICommentService {

    List<CommentDTO> getCommentsByPost(int postId);
}