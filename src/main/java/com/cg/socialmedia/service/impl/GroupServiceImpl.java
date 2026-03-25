package com.cg.socialmedia.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.socialmedia.dto.GroupDTO;
import com.cg.socialmedia.entity.GroupEntity;
import com.cg.socialmedia.mapper.EntityMapper;
import com.cg.socialmedia.repository.GroupRepository;
import com.cg.socialmedia.service.IGroupService;

@Service
public class GroupServiceImpl implements IGroupService{
	
	private final GroupRepository repo;
	
	public GroupServiceImpl(GroupRepository repo) {
		this.repo = repo;
	}
	
//	@Override
//	public List<GroupDTO> getAllGroups() {
//	    return repo.findAll()
//	            .stream()
//	            .map(EntityMapper::toGroupDTO)
//	            .toList();
//	}
	@Override
	public List<GroupDTO> getAllGroups() {

	    List<GroupEntity> groups = repo.findAll();

	    if (groups.isEmpty()) {
	        throw new RuntimeException("No groups available");
	    }

	    return groups.stream()
	            .map(EntityMapper::toGroupDTO)
	            .toList();
	}

}
