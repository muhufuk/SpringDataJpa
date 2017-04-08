package com.ufuk.model;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by Ufuk on 8.04.2017.
 */
@Entity
public class Album extends AbstractEntity
{
    private String name;
    private Date date;
    private int numberOfSongs;

    public String getName()
    {
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
}
