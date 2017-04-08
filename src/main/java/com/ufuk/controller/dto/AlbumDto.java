package com.ufuk.controller.dto;

import java.util.Date;
import java.util.Set;

/**
 * Data transfer object for Album.
 */
public class AlbumDto
{
    private String name;
    private Date date;
    private int numberOfSongs;
    private Set<SongDto> songDtos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public Set<SongDto> getSongDtos() {
        return songDtos;
    }

    public void setSongDtos(Set<SongDto> songDtos) {
        this.songDtos = songDtos;
    }
}
