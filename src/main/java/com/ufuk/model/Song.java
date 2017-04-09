package com.ufuk.model;

/**
 * Model for Object
 */
public class Song
{
    private int order;
    private String songName;
    private int duration;

    public Song(int order, String songName, int duration)
    {
        this.order = order;
        this.songName = songName;
        this.duration = duration;
    }

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
