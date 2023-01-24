package com.example.cflupdater.mappers;

import com.example.cflclient.cflclient.contract.WeatherDto;
import com.example.cfldata.model.Weather;
import org.springframework.stereotype.Component;

@Component
public class WeatherMapper implements IMapEntities<WeatherDto, Weather>{
    @Override
    public Weather map(WeatherDto weatherDto) {
        return map(weatherDto,new Weather());
    }

    @Override
    public Weather map(WeatherDto weatherDto, Weather weather) {
        weather.setTemperature(weatherDto.getTemperature());
        weather.setSky(weatherDto.getSky());
        weather.setWindSpeed(weatherDto.getWindSpeed());
        weather.setWindDirection(weatherDto.getWindDirection());
        weather.setFieldConditions(weather.getFieldConditions());

        return weather;
    }
}
