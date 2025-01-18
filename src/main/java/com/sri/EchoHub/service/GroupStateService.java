package com.sri.EchoHub.service;

import com.sri.EchoHub.model.GroupState;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class GroupStateService {
    private final Map<String, GroupState> groupStateMap = new ConcurrentHashMap<>();

    public GroupState updateGroupState(String groupId, String videoId, boolean isPlaying, long timestamp) {
        GroupState groupState = groupStateMap.getOrDefault(groupId, new GroupState());
        groupState.setVideoId(videoId);
        groupState.setPlaying(isPlaying);
        groupState.setLastTimestamp(timestamp);
        groupState.setLastUpdateTime(System.currentTimeMillis());

        groupStateMap.put(groupId, groupState);
        return groupState;
    }
    public GroupState getGroupState(String groupId){
        GroupState groupState=groupStateMap.get(groupId);
        if(groupState==null)
        {
            throw new RuntimeException("Group not found");
        }
        if(Objects.equals(groupState.isPlaying(), "true"))
        {
            long currentTime=System.currentTimeMillis();
            long elapsedSeconds=(currentTime-groupState.getLastTimestamp())/1000;
            groupState.setLastTimestamp(groupState.getLastTimestamp()+elapsedSeconds);
            groupState.setLastUpdateTime(currentTime);

                    }
        return groupState;
    }

}
