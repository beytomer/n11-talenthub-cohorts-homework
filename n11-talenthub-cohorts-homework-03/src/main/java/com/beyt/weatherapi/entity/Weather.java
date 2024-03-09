package com.beyt.weatherapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Weather {
    private double latitude;
    private double longitude;
    private String resolvedAddress;
    private String address;
    private String timezone;
    private String description;
    private ArrayList<Day> days;
}
