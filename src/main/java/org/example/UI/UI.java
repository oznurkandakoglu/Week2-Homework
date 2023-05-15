package org.example.UI;

import org.example.Estate;
import org.example.service.EstateService;

import java.util.List;

public class UI {

    public void printOutput(List<Estate> estateList){
        // Crated estate service use to functions
        EstateService estateService = new EstateService(estateList);

        System.out.println("Total price of houses: $" + estateService.getTotalPriceByType("House"));
        System.out.println("Total price of villas: $" + estateService.getTotalPriceByType("Villa"));
        System.out.println("Total price of summer houses: $" + estateService.getTotalPriceByType("SummerHouse"));
        System.out.println("Total price of all houses: $" + estateService.getTotalPrice());
        System.out.println("----------------------------------------------");
        System.out.println("Average square meters of houses: " + estateService.getAverageAreaByType("House"));
        System.out.println("Average square meters of villas: " + estateService.getAverageAreaByType("Villa"));
        System.out.println("Average square meters of summer houses: " + estateService.getAverageAreaByType("SummerHouse"));
        System.out.println("Average square meters of all houses: " + estateService.getAverageArea());
        System.out.println("----------------------------------------------");

        List<Estate> filteredHouses = estateService.filterByRoomAndLivingRoom(estateList,4, 2);
        System.out.println("Houses with 4 rooms and 2 living rooms:");
        for (Estate estate : filteredHouses) {
            System.out.println(estate.getType() + " : $" + estate.getPrice() + " - " + estate.getArea() + " square meters");
        }
    }
}
