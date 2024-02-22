package com.example.n11talenthubcohortshomework01.entity;

import com.example.n11talenthubcohortshomework01.enums.PropertyType;

public class SummerHouse extends Property{
    public SummerHouse() {
        super();
    }

    public SummerHouse(int numberOfRooms, int getNumberOfLivingRooms, int totalLivingAreaInSquareMeters, double price) {
        super(numberOfRooms, getNumberOfLivingRooms, totalLivingAreaInSquareMeters, price);
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.SUMMER_HOUSE;
    }
}
