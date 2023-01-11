package com.travelmanagementsystem.service;

import com.travelmanagementsystem.service.dto.AgentDTO;

import java.util.List;

public interface AgentService {


    public String createAgent(AgentDTO agentDTO, String authority);

    public String updateAgent(String mobile);

    public AgentDTO getAgentById(Long agentId);

    public List<AgentDTO> getAllAgent();

    public String deleteAgent(Long agentId);

}
