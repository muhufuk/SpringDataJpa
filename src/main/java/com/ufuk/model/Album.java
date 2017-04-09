package com.ufuk.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Model for Album
 */
public class Album
{
    private String name;
    private Date date;
    private int numberOfSongs;
    private Set<Song> songs = new HashSet<>();

    public Album(String name, Date date, int numberOfSongs, Set<Song> songs)
    {
        this.name = name;
        this.date = date;
        this.numberOfSongs = numberOfSongs;
        this.songs = songs;
    }

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

    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }
}
