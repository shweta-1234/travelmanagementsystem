package com.travelmanagementsystem.service.impl;

import com.travelmanagementsystem.repository.AuthorityRepository;
import com.travelmanagementsystem.repository.UserRepository;
import com.travelmanagementsystem.service.AgentService;
import com.travelmanagementsystem.service.dto.AgentDTO;
import com.travelmanagementsystem.service.mapper.AgentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentServiceImpl implements AgentService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    @Autowired
    private AgentMapper agentMapper;

    @Override
    public String createAgent(AgentDTO agentDTO, String authority) {
        return null;
    }

    @Override
    public String updateAgent(String mobile) {
        return null;
    }

    @Override
    public AgentDTO getAgentById(Long agentId) {
        return null;
    }

    @Override
    public List<AgentDTO> getAllAgent() {
        return null;
    }

    @Override
    public String deleteAgent(Long agentId) {
        return null;
    }
}
