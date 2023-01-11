package com.travelmanagementsystem.controller;

import com.travelmanagementsystem.constant.UriConstant;
import com.travelmanagementsystem.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UriConstant.agent)
public class AgentController {

    @Autowired
    private AgentService agentService;

}

