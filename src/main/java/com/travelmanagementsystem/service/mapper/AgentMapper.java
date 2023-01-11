package com.travelmanagementsystem.service.mapper;

import com.travelmanagementsystem.domain.User;
import com.travelmanagementsystem.service.dto.AgentDTO;
import org.springframework.stereotype.Component;

@Component
public class AgentMapper {


    public User mapToUser(AgentDTO agentDTO) {
        return new User(agentDTO);
    }
}
