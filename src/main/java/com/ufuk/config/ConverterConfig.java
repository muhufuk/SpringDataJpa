package com.ufuk.config;

import com.ufuk.converter.ArtistDtoToArtistConverter;
import com.ufuk.converter.ArtistToArtistEntityConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.convert.support.ConfigurableConversionService;

import javax.annotation.PostConstruct;

@Configuration
public class ConverterConfig
{
    private static final Logger LOG = LoggerFactory.getLogger(ConverterConfig.class);

    @Autowired
    @Qualifier("mvcConversionService")
    private ConfigurableConversionService conversionService;

    @Bean
    @Primary
    public ConfigurableConversionService getConversionService()
    {
        return conversionService;
    }

    @PostConstruct
    public void postConstruct()
    {
        conversionService.addConverter(new ArtistDtoToArtistConverter());
        conversionService.addConverter(new ArtistToArtistEntityConverter());
    }
}
