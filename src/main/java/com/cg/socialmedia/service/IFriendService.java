package com.cg.socialmedia.service;

import com.cg.socialmedia.dto.FriendDTO;
import java.util.List;

public interface IFriendService {

    List<FriendDTO> getFriends(int userId);
}