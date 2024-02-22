package com.example.n11talenthubcohortshomework01.service;

import com.example.n11talenthubcohortshomework01.entity.Property;
import com.example.n11talenthubcohortshomework01.enums.PropertyType;

import java.util.ArrayList;
import java.util.List;

public class PropertyService {
    private final List<Property>propertyList;

    public PropertyService(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    public double getTotalPriceOfHome(){
        double totalPrice=0;
        for(Property property : propertyList){
            if (property.getPropertyType() == PropertyType.HOUSE ){
                totalPrice+=property.getPrice();
            }
        }
        return totalPrice;
    }
    public double getTotalPriceOfVilla(){
        double totalPrice=0;
        for(Property property : propertyList){
            if (property.getPropertyType() == PropertyType.VILLA ){
                totalPrice+=property.getPrice();
            }
        }
        return totalPrice;
    }
    public double getTotalPriceOfSummerHouse(){
        double totalPrice=0;
        for(Property property : propertyList){
            if (property.getPropertyType() == PropertyType.SUMMER_HOUSE ){
                totalPrice+=property.getPrice();
            }
        }
        return totalPrice;
    }

    public double getTotalPriceOfAllTypeHouse(){
        double totalPrice=0;
        for (Property property1 : propertyList){
            totalPrice+=property1.getPrice();
        }
        return totalPrice;
    }

    public double getAvgSquareMetersOfHome(){
        double totalSquareMeters=0;
        int propertyCount=0;
        for(Property property : propertyList){
            if (property.getPropertyType() ==PropertyType.HOUSE){
                propertyCount++;
                totalSquareMeters+=property.getTotalLivingAreaInSquareMeters();
            }
        }
        return totalSquareMeters/propertyCount;
    }
    public double getAvgSquareMetersOfVilla(){
        double totalSquareMeters=0;
        int propertyCount=0;
        for(Property property : propertyList){
            if (property.getPropertyType()==PropertyType.VILLA){
                propertyCount++;
                totalSquareMeters+=property.getTotalLivingAreaInSquareMeters();
            }
        }
        return totalSquareMeters/propertyCount;
    }
    public double getAvgSquareMetersOfSummerHouse(){
        double totalSquareMeters=0;
        int propertyCount=0;
        for(Property property : propertyList){
            if (property.getPropertyType() ==PropertyType.SUMMER_HOUSE){
                propertyCount++;
                totalSquareMeters+=property.getTotalLivingAreaInSquareMeters();
            }
        }
        return totalSquareMeters/propertyCount;
    }

    public double getAvgSquareMetersAllHouseType(){
        double totalSquareMeters=0;
        for (Property property :propertyList){
            totalSquareMeters+=property.getTotalLivingAreaInSquareMeters();
        }
        return totalSquareMeters/propertyList.size();
    }

    public List<Property> filterPropertiesByLivingRoomAndRoom(int room ,int livingroom ){

        List<Property>filtredHouse=new ArrayList<>();
        for (Property property :propertyList){
            if (property.getNumberOfRooms()==room && property.getGetNumberOfLivingRooms()==livingroom){
                filtredHouse.add(property);
            }
        }
        return  filtredHouse;
    }

}
