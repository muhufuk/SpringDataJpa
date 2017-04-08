package com.ufuk.controller.dto;

/**
 * Data Transfer Object for Song.
 */
public class SongDto
{
    private int order;
    private String songName;
    private int duration;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
