package com.example.n11talenthubcohortshomework01.entity;

import com.example.n11talenthubcohortshomework01.enums.PropertyType;

public class Villa extends Property{

    public Villa() {
        super();
    }

    public Villa(int numberOfRooms, int getNumberOfLivingRooms, int totalLivingAreaInSquareMeters, double price) {
        super(numberOfRooms, getNumberOfLivingRooms, totalLivingAreaInSquareMeters, price);
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.VILLA;
    }
}
