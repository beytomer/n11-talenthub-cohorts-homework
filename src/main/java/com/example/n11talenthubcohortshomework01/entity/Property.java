package com.example.n11talenthubcohortshomework01.entity;

import com.example.n11talenthubcohortshomework01.enums.PropertyType;

public abstract class Property {

    private int numberOfRooms;
    private int NumberOfLivingRooms;
    private int totalLivingAreaInSquareMeters;
    private double price;

    public Property() {

        this.numberOfRooms=0;
        this.NumberOfLivingRooms=0;
        this.totalLivingAreaInSquareMeters=0;
        this.price=0;

    }

    public Property(int numberOfRooms, int getNumberOfLivingRooms, int totalLivingAreaInSquareMeters, double price) {
        this.numberOfRooms = numberOfRooms;
        this.NumberOfLivingRooms = getNumberOfLivingRooms;
        this.totalLivingAreaInSquareMeters = totalLivingAreaInSquareMeters;
        this.price = price;
    }
    public abstract PropertyType getPropertyType();
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getGetNumberOfLivingRooms() {
        return NumberOfLivingRooms;
    }

    public void setGetNumberOfLivingRooms(int getNumberOfLivingRooms) {
        this.NumberOfLivingRooms = getNumberOfLivingRooms;
    }

    public int getTotalLivingAreaInSquareMeters() {
        return totalLivingAreaInSquareMeters;
    }

    public void setTotalLivingAreaInSquareMeters(int totalLivingAreaInSquareMeters) {
        this.totalLivingAreaInSquareMeters = totalLivingAreaInSquareMeters;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Property{" +
                "numberOfRooms=" + numberOfRooms +
                ", getNumberOfLivingRooms=" + NumberOfLivingRooms +
                ", totalLivingAreaInSquareMeters=" + totalLivingAreaInSquareMeters +
                ", price=" + price +
                '}';
    }
}
