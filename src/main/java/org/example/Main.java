package org.example;

import org.example.estate.types.House;
import org.example.estate.types.SummerHouse;
import org.example.estate.types.Villa;
import org.example.service.EstateService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Estate> estateList = new ArrayList<>();

        estateList.add(new House(140000, 100, 1, 1));
        estateList.add(new House(160000, 120, 2, 1));
        estateList.add(new House(180000, 140, 3, 2));
        estateList.add(new Villa(300000, 200, 4, 2));
        estateList.add(new Villa(320000, 300, 6, 3));
        estateList.add(new Villa(340000, 400, 7, 4));
        estateList.add(new SummerHouse(200000, 160, 2, 1));
        estateList.add(new SummerHouse(260000, 180, 4, 2));
        estateList.add(new SummerHouse(280000, 200, 4, 3));

        EstateService estateService = new EstateService(estateList);

        System.out.println("----------------------------------------------");
        System.out.println("Total price of house: $" + estateService.getTotalPriceByType("House"));
        System.out.println("Total price of villas: $" + estateService.getTotalPriceByType("Villa"));
        System.out.println("Total price of summer houses: $" + estateService.getTotalPriceByType("SummerHouse"));
        System.out.println("Total price of all houses: $" + estateService.getTotalPrice());
        System.out.println("----------------------------------------------");
        System.out.println("Average square meters of house: " + estateService.getAverageAreaByType("House"));
        System.out.println("Average square meters of villas: " + estateService.getAverageAreaByType("Villa"));
        System.out.println("Average square meters of summer houses: " + estateService.getAverageAreaByType("SummerHouse"));
        System.out.println("Average square meters of all houses: " + estateService.getAverageArea());
        System.out.println("----------------------------------------------");
        List<Estate> filteredHouses = estateService.filterByRoomAndLivingRoom(4, 2);
        System.out.println("Houses with 4 rooms and 2 living rooms:");
        for (Estate estate : filteredHouses) {
            System.out.println(estate.getType() + " - $" + estate.getPrice() + " - " + estate.getArea() + " square meters");
        }

    }
}