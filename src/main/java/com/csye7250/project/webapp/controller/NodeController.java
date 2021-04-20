package com.csye7250.project.webapp.controller;

import com.csye7250.project.webapp.entity.Node;
import com.csye7250.project.webapp.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class NodeController {

    @Autowired
    private NodeService nodeService;

    @GetMapping("/getAllNodes")
    public List<Node> getAll(){
        return nodeService.getAllNodes();
    }
}
