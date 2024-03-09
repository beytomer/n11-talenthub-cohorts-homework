package com.beyt.weatherapi.mapper;

import com.beyt.weatherapi.dto.DayDTO;
import com.beyt.weatherapi.dto.WeatherDTO;
import com.beyt.weatherapi.entity.Day;
import com.beyt.weatherapi.entity.Weather;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface WeatherInfoMapper {


    Weather convert(WeatherDTO weatherDTO);
    List<Day> convertToDayInfos(List<DayDTO> dayDTOS);


}
