package com.beyt.weatherapi.service;

import com.beyt.weatherapi.mapper.WeatherInfoMapper;
import com.beyt.weatherapi.client.WeatherClient;
import com.beyt.weatherapi.dto.WeatherDTO;
import com.beyt.weatherapi.entity.Range;
import com.beyt.weatherapi.entity.Weather;
import com.beyt.weatherapi.exception.WeatherInfoAccessException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService{

    private final WeatherClient weatherClient;
    private final WeatherInfoMapper weatherInfoMapper;
    @Override
    public Weather getWeatherInfo(String city, String country, Range range) {

        StringBuilder builder = new StringBuilder();

        try {
            LocalDate startDate = LocalDate.now();
            builder.append(startDate);
            if (range.equals(Range.WEEKLY)){
                builder.append("/").append(startDate.plusDays(6));
            }

            ResponseEntity<WeatherDTO> weather = weatherClient.getData(city, country, String.valueOf(builder));

            return weatherInfoMapper.convert(weather.getBody());

        } catch (Exception e) {
            throw new WeatherInfoAccessException("Unexpected error occurred while accessing weather info!");
        }
    }
}
