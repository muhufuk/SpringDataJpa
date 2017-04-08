package com.ufuk.Jpa.entitiy;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

/**
 * Entity for Album.
 */
@Entity
public class AlbumEntity extends AbstractEntity
{
    private String name;
    private Date date;
    private int numberOfSongs;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<SongEntity> songEntities;

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

    public Set<SongEntity> getSongEntities() {
        return songEntities;
    }

    public void setSongEntities(Set<SongEntity> songEntities) {
        this.songEntities = songEntities;
    }
}
