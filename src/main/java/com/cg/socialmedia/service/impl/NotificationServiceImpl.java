package com.cg.socialmedia.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.socialmedia.dto.NotificationDTO;
import com.cg.socialmedia.entity.Notification;
import com.cg.socialmedia.mapper.EntityMapper;
import com.cg.socialmedia.repository.NotificationRepository;
import com.cg.socialmedia.service.INotificationService;

@Service
public class NotificationServiceImpl implements INotificationService {	
	
	private final NotificationRepository repo;
	
	public NotificationServiceImpl(NotificationRepository repo) {
		this.repo = repo;
	}
	
//	@Override
//	public List<NotificationDTO> getNotifications(int userId) {
//	    return repo.findByUserId(userId)
//	            .stream()
//	            .map(EntityMapper::toNotificationDTO)
//	            .toList();
//	}
	@Override
	public List<NotificationDTO> getNotifications(int userId) {

	    List<Notification> list = repo.findByUserId(userId);

	    if (list.isEmpty()) {
	        throw new RuntimeException("No notifications found");
	    }

	    return list.stream()
	            .map(EntityMapper::toNotificationDTO)
	            .toList();
	}
}
