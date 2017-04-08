package com.ufuk.controller;

import com.ufuk.controller.Resource.ArtistResource;
import com.ufuk.controller.dto.ArtistDto;
import com.ufuk.model.Artist;
import com.ufuk.service.ArtistService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest api to do artist related operations
 */
@RestController(value = "/v1/api/artist")
public class ArtistController
{
    @Autowired
    private ConfigurableConversionService configurableConversionService;

    @Autowired
    private ArtistService artistService;

    @RequestMapping(method = RequestMethod.PUT)
    @ApiOperation(value = "getGreeting", nickname = "getGreeting")
    public ArtistResource createOrUpdateArtist(ArtistDto artistDto)
    {
        Artist artist = configurableConversionService.convert(artistDto, Artist.class);
        artistService.createOrUpdateArtist(artist);
        ArtistResource artistResource = configurableConversionService.convert(artistDto, ArtistResource.class);

        return artistResource;
    }
}
