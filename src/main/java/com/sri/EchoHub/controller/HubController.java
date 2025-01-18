package com.sri.EchoHub.controller;


import com.sri.EchoHub.model.GroupState;
import com.sri.EchoHub.service.GroupStateService;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HubController {
    private SimpMessagingTemplate simpMessagingTemplate;
private GroupStateService groupStateService;

    public HubController(SimpMessagingTemplate simpMessagingTemplate, GroupStateService groupStateService) {
        this.simpMessagingTemplate = simpMessagingTemplate;
        this.groupStateService = groupStateService;
    }
    @MessageMapping("/group/update")
    public void updateGroup(VideoStateUpdate update) {
        System.out.println("front end obj : "+update);

       GroupState groupState= groupStateService.updateGroupState(
                update.getGroupId(),
                update.getVideoId(),
                update.getIsPlaying(),
                update.getTimestamp()
        );
        String destination = "/topic/group-state";

        simpMessagingTemplate.convertAndSend(destination, groupState);
    }
    @MessageMapping("/group/state")
    public void getGroupState(String groupId, SimpMessageHeaderAccessor headerAccessor) {
        GroupState groupState = groupStateService.getGroupState(groupId);
        String destination = "/topic/group-state/" + groupId;

        simpMessagingTemplate.convertAndSend(destination, groupState);
    }

}
