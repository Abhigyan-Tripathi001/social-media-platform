package com.cg.socialmedia.service;

import com.cg.socialmedia.dto.LikeDTO;
import java.util.List;

public interface ILikeService {

    List<LikeDTO> getLikesByPost(int postId);
}