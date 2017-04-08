package com.ufuk.controller.dto;

import com.ufuk.enums.Gender;

import java.util.Date;
import java.util.Set;

/**
 * Data Transfer Object for Artist.
 */
public class ArtistDto
{
    private String name;
    private String surname;
    private String address;
    private Date date;
    private Gender gender;
    private Set<AlbumDto> albumDtos;

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

    public Set<AlbumDto> getAlbums() {
        return albumDtos;
    }

    public void setAlbums(Set<AlbumDto> albumDtos) {
        this.albumDtos = albumDtos;
    }
}
