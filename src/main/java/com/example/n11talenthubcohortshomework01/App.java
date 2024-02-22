package com.example.n11talenthubcohortshomework01;

import com.example.n11talenthubcohortshomework01.entity.House;
import com.example.n11talenthubcohortshomework01.entity.Property;
import com.example.n11talenthubcohortshomework01.entity.SummerHouse;
import com.example.n11talenthubcohortshomework01.entity.Villa;
import com.example.n11talenthubcohortshomework01.enums.PropertyType;
import com.example.n11talenthubcohortshomework01.service.PropertyService;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List <Property> propertyList=new ArrayList<>();
        PropertyService propertyService=new PropertyService(propertyList);

        propertyList.add(new House(1, 0, 111, 1850));
        propertyList.add(new House(1, 1, 107, 2000));
        propertyList.add(new House(2, 1, 195, 7000));
        propertyList.add(new House(3, 1, 200, 18000));
        propertyList.add(new House(4, 1, 200, 18000));
        propertyList.add(new Villa(5, 2, 150, 79800));
        propertyList.add(new Villa(3, 1, 150, 79800));
        propertyList.add(new Villa(4, 1, 245, 1800));
        propertyList.add(new Villa(5, 1, 120, 18560));
        propertyList.add(new Villa(3, 2, 170, 234567));
        propertyList.add(new SummerHouse(1, 1, 145, 21000));
        propertyList.add(new SummerHouse(2, 1, 102, 12000));
        propertyList.add(new SummerHouse(3, 1, 99, 8000));
        propertyList.add(new SummerHouse(3, 2, 158, 15000));

        for (Property property: propertyList){
            System.out.println(property.getPropertyType()+" " + property.toString());
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Total price of all houses              ---->  "+propertyService.getTotalPriceOfHome());
        System.out.println("Total price of all villas              ---->  "+propertyService.getTotalPriceOfVilla());
        System.out.println("Total price of all summer houses       ---->  "+propertyService.getTotalPriceOfSummerHouse());
        System.out.println("Total price of all types of proporties ---->  "+propertyService.getTotalPriceOfAllTypeHouse());

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Avarage living area in square meters of all houses              ---->  "+propertyService.getTotalPriceOfHome());
        System.out.println("Avarage living area in square meters of all villas              ---->  "+propertyService.getTotalPriceOfVilla());
        System.out.println("Avarage living area in square meters all summer houses          ---->  "+propertyService.getTotalPriceOfSummerHouse());
        System.out.println("Avarage living area in square meters of all types of proporties ---->  "+propertyService.getTotalPriceOfAllTypeHouse());

        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i=1; i<6; i++){
            for (int j=0; j<3; j++){
                List<Property>propertyListFilter=propertyService.filterPropertiesByLivingRoomAndRoom(i,j);
                 if (!propertyListFilter.isEmpty()){
                     propertyListFilter.forEach(property -> System.out.println(property.getNumberOfRooms()+"+"+property.getGetNumberOfLivingRooms()+" "+property.getPropertyType() +" "+property));
                 }
                if (!propertyListFilter.isEmpty()){
                    System.out.println("-------------------------------------------------------------------------");
                }
            }

        }



    }
}
