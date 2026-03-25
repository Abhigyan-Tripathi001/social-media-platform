package com.cg.socialmedia.mapper;

import com.cg.socialmedia.entity.*;
import com.cg.socialmedia.dto.*;

public class EntityMapper {

    // USER
    public static UserDTO toUserDTO(User u) {
        return new UserDTO(u.getUserId(), u.getUsername(), u.getEmail());
    }

    public static User toUserEntity(UserDTO dto) {
        return new User(dto.getUserId(), dto.getUsername(), dto.getEmail(), null, null);
    }

    // POST
    public static PostDTO toPostDTO(Post p) {
        return new PostDTO(p.getPostId(), p.getUserId(), p.getContent(), p.getTimestamp());
    }

    public static Post toPostEntity(PostDTO dto) {
        return new Post(dto.getPostId(), dto.getUserId(), dto.getContent(), dto.getTimestamp());
    }

    // COMMENT
    public static CommentDTO toCommentDTO(Comment c) {
        return new CommentDTO(c.getCommentId(), c.getPostId(), c.getUserId(), c.getCommentText(), c.getTimestamp());
    }

    // LIKE
    public static LikeDTO toLikeDTO(Like l) {
        return new LikeDTO(l.getLikeId(), l.getPostId(), l.getUserId(), l.getTimestamp());
    }

    // FRIEND
    public static FriendDTO toFriendDTO(Friend f) {
        return new FriendDTO(f.getFriendshipId(), f.getUserId1(), f.getUserId2(), f.getStatus());
    }

    // MESSAGE
    public static MessageDTO toMessageDTO(Message m) {
        return new MessageDTO(m.getMessageId(), m.getSenderId(), m.getReceiverId(), m.getMessageText(), m.getTimestamp());
    }

    // NOTIFICATION
    public static NotificationDTO toNotificationDTO(Notification n) {
        return new NotificationDTO(n.getNotificationId(), n.getUserId(), n.getContent(), n.getTimestamp());
    }

    // GROUP
    public static GroupDTO toGroupDTO(GroupEntity g) {
        return new GroupDTO(g.getGroupId(), g.getGroupName(), g.getAdminId());
    }
}