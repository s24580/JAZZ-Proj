package com.example.cflwebapi.webapi.mappers;

import com.example.cfldata.model.Weather;
import com.example.cflwebapi.webapi.contract.WeatherDto;
import org.springframework.stereotype.Component;

@Component
public class WeatherMapper implements IMap<Weather, WeatherDto>{
    @Override
    public WeatherDto map(Weather weather) {
        return map(weather,new WeatherDto());
    }

    @Override
    public WeatherDto map(Weather weather, WeatherDto weatherDto) {
        weatherDto.setSky(weather.getSky());
        weatherDto.setTemperature(weather.getTemperature());
        weatherDto.setFieldConditions(weather.getFieldConditions());
        weatherDto.setWindSpeed(weather.getWindSpeed());
        weatherDto.setWindDirection(weather.getWindDirection());

        return weatherDto;
    }
}
