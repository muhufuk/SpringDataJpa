package com.ufuk.converter;

import com.ufuk.controller.dto.ArtistDto;
import com.ufuk.model.Album;
import com.ufuk.model.Artist;
import com.ufuk.model.Song;
import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.Set;

public class ArtistDtoToArtistConverter implements Converter<ArtistDto, Artist>
{
    @Override
    public Artist convert(ArtistDto source)
    {
        Artist artist = new Artist();
        artist.setAddress(source.getAddress());
        artist.setDate(source.getDate());
        artist.setGender(source.getGender());
        artist.setName(source.getName());
        artist.setSurname(source.getSurname());
        Set<Album> albums = new HashSet<>();
        Set<Song> songs = new HashSet<>();
        source.getAlbums().forEach(albumDto -> albumDto.getSongDtos().forEach(songDto -> songs.add(new Song(songDto.getOrder(),songDto.getSongName(),songDto.getDuration())) ));
        source.getAlbums().forEach(albumDto -> albums.add(new Album(albumDto.getName(),albumDto.getDate(),albumDto.getNumberOfSongs(),songs)));
        artist.setAlbums(albums);

        return artist;
    }
}
