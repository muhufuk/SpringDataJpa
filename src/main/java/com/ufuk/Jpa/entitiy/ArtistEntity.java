package com.ufuk.Jpa.entitiy;

import com.ufuk.enums.Gender;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Entity for Artist.
 */
@Entity
public class ArtistEntity extends AbstractEntity implements Serializable
{
    private String name;
    private String surname;
    private String address;
    private Date date;
    private Gender gender;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<AlbumEntity> albumEntities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Set<AlbumEntity> getAlbumEntities() {
        return albumEntities;
    }

    public void setAlbumEntities(Set<AlbumEntity> albumEntities) {
        this.albumEntities = albumEntities;
    }
}
