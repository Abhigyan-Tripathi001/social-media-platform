package com.cg.socialmedia.service;

import com.cg.socialmedia.dto.MessageDTO;
import java.util.List;

public interface IMessageService {

    List<MessageDTO> getMessagesBySender(int senderId);
}