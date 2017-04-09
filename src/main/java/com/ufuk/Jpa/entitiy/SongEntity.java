package com.ufuk.Jpa.entitiy;

import javax.persistence.Entity;

/**
 * Entity for Song.
 */
@Entity
public class SongEntity extends AbstractEntity
{
    private int trackOrder;
    private String songName;
    private int duration;

    public int getTrackOrder() {
        return trackOrder;
    }

    public void setTrackOrder(int trackOrder) {
        this.trackOrder = trackOrder;
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