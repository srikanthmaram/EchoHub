package com.sri.EchoHub.model;

public class GroupState {
    private String videoId;
    private long lastTimestamp;
    private boolean isPlaying;
    private long lastUpdateTime;

    public GroupState() {
    }

    public GroupState(String videoId, long lastTimestamp, boolean isPlaying, long lastUpdateTime) {
        this.videoId = videoId;
        this.lastTimestamp = lastTimestamp;
        this.isPlaying = isPlaying;
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getVideoId() {
        return videoId;
    }

    public long getLastTimestamp() {
        return lastTimestamp;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public void setLastTimestamp(long lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public void setLastUpdateTime(long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        return "GroupState{" +
                "videoId='" + videoId + '\'' +
                ", lastTimestamp=" + lastTimestamp +
                ", isPlaying=" + isPlaying +
                ", lastUpdateTime=" + lastUpdateTime +
                '}';
    }
}
