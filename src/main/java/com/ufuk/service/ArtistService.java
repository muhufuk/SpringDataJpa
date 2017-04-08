package com.ufuk.service;

import com.ufuk.Jpa.ArtistRepository;
import com.ufuk.Jpa.entitiy.ArtistEntity;
import com.ufuk.controller.dto.ArtistDto;
import com.ufuk.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.stereotype.Service;

/**
 * ArtistEntity related operation service.
 */
@Service
public class ArtistService
{

    @Autowired
    private ConfigurableConversionService configurableConversionService;

    @Autowired
    private ArtistRepository artistRepository;

    public Artist createOrUpdateArtist(Artist artist)
    {
        ArtistEntity artistEntity = configurableConversionService.convert(artist, ArtistEntity.class);
        artistRepository.save(artistEntity);

        return artist;
    }
}
