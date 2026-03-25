package com.cg.socialmedia.service;

import com.cg.socialmedia.dto.NotificationDTO;
import java.util.List;

public interface INotificationService {

    List<NotificationDTO> getNotifications(int userId);
}