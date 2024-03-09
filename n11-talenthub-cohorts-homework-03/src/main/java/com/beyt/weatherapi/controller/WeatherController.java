package com.beyt.weatherapi.controller;

import com.beyt.weatherapi.entity.Range;
import com.beyt.weatherapi.entity.Weather;
import com.beyt.weatherapi.service.WeatherService;
import com.beyt.weatherapi.util.ValidCountryCode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/weather")
@RequiredArgsConstructor
@Validated
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping
    public ResponseEntity<Weather> getWeatherInfo(@RequestParam String city, @RequestParam @ValidCountryCode String country, @RequestParam Range range
    ) {
        Weather weatherInfo = weatherService.getWeatherInfo(city, country, range);
        return new ResponseEntity<>(weatherInfo, HttpStatus.OK);
    }

}
