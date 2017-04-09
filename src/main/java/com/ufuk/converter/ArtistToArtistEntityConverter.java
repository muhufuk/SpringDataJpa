package com.ufuk.converter;

import com.ufuk.Jpa.entitiy.AlbumEntity;
import com.ufuk.Jpa.entitiy.ArtistEntity;
import com.ufuk.Jpa.entitiy.SongEntity;
import com.ufuk.model.Album;
import com.ufuk.model.Artist;
import com.ufuk.model.Song;
import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.Set;

public class ArtistToArtistEntityConverter implements Converter<Artist, ArtistEntity>
{
    @Override
    public ArtistEntity convert(Artist source)
    {
        ArtistEntity artistEntity = new ArtistEntity();
        artistEntity.setAddress(source.getAddress());
        artistEntity.setDate(source.getDate());
        artistEntity.setGender(source.getGender());
        artistEntity.setName(source.getName());
        artistEntity.setSurname(source.getSurname());
        Set<SongEntity> songEntities = new HashSet<>();
        Set<AlbumEntity> albumEntities = new HashSet<>();
        for (Album album : source.getAlbums())
        {
            AlbumEntity albumEntity = new AlbumEntity();
            albumEntity.setDate(album.getDate());
            albumEntity.setName(album.getName());
            albumEntity.setNumberOfSongs(album.getNumberOfSongs());
            for(Song song : album.getSongs())
            {
                SongEntity songEntity = new SongEntity();
                songEntity.setDuration(song.getDuration());
                songEntity.setTrackOrder(song.getOrder());
                songEntity.setSongName(song.getSongName());
                songEntities.add(songEntity);
            }
            albumEntities.add(albumEntity);
        }
        artistEntity.setAlbumEntities(albumEntities);

        return null;
    }
}
