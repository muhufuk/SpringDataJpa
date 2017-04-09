package com.ufuk.controller;

import com.ufuk.controller.Resource.ArtistResource;
import com.ufuk.controller.dto.ArtistDto;
import com.ufuk.model.Artist;
import com.ufuk.service.ArtistService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest api to do artist related operations
 */
import io.swagger.annotations.ApiOperation;

@RestController(value = "/v1/api/artist")
@Api(value = "artist", produces = "application/json")
public class ArtistController
{
    @Autowired
    private ConfigurableConversionService configurableConversionService;

    @Autowired
    private ArtistService artistService;

    @RequestMapping(method = RequestMethod.PUT)
    @ApiOperation(value = "getGreeting", nickname = "getGreeting")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "User's name", required = false, dataType = "string", paramType = "query", defaultValue="Niklas")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = ArtistController.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ArtistResource createOrUpdateArtist(ArtistDto artistDto)
    {
        Artist artist = configurableConversionService.convert(artistDto, Artist.class);
        Artist savedArtist = artistService.createOrUpdateArtist(artist);
        ArtistResource artistResource = configurableConversionService.convert(savedArtist, ArtistResource.class);

        return artistResource;
    }
}
