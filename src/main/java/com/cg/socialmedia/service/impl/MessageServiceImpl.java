package com.cg.socialmedia.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.socialmedia.dto.MessageDTO;
import com.cg.socialmedia.entity.Message;
import com.cg.socialmedia.mapper.EntityMapper;
import com.cg.socialmedia.repository.MessageRepository;
import com.cg.socialmedia.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService{
	
	private final MessageRepository repo;
	
	public MessageServiceImpl(MessageRepository repo) {
		this.repo = repo;
	}
	
//	@Override
//	public List<MessageDTO> getMessagesBySender(int senderId) {
//	    return repo.findBySenderId(senderId)
//	            .stream()
//	            .map(EntityMapper::toMessageDTO)
//	            .toList();
//	}
	@Override
	public List<MessageDTO> getMessagesBySender(int senderId) {

	    List<Message> messages = repo.findBySenderId(senderId);

	    if (messages.isEmpty()) {
	        throw new RuntimeException("No messages found");
	    }

	    return messages.stream()
	            .map(EntityMapper::toMessageDTO)
	            .toList();
	}

}
