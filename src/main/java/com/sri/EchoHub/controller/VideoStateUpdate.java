package com.sri.EchoHub.controller;



public class VideoStateUpdate {

    private String groupId;

    private String videoId;

    private long timestamp;
    private boolean isPlaying;

    public VideoStateUpdate() {
    }

    public VideoStateUpdate(String groupId, String videoId, long timestamp, boolean isPlaying) {
        this.groupId = groupId;
        this.videoId = videoId;
        this.timestamp = timestamp;
        this.isPlaying = isPlaying;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean getIsPlaying() {
        return isPlaying;
    }

    public void setIsPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    @Override
    public String toString() {
        return "VideoStateUpdate{" +
                "groupId='" + groupId + '\'' +
                ", videoId='" + videoId + '\'' +
                ", timestamp=" + timestamp +
                ", isPlaying='" + isPlaying + '\'' +
                '}';
    }
}
