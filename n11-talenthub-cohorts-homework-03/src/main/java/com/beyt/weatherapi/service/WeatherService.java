package com.beyt.weatherapi.service;

import com.beyt.weatherapi.entity.Range;
import com.beyt.weatherapi.entity.Weather;

public interface WeatherService {
    Weather getWeatherInfo(String city, String country, Range range);
}
