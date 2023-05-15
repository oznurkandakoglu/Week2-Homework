package org.example.UI;

import org.example.Estate;
import org.example.service.EstateService;

import java.util.List;
import java.util.Scanner;

public class UI {

    public void printOutput(List<Estate> estateList){
        // Crated estate service use to functions
        EstateService estateService = new EstateService(estateList);
        System.out.println("Please select the estate type:" +
                "\n1- House List" +
                "\n2- Summerhouse List" +
                "\n3- Villa List" +
                "\n4- All Houses Details" +
                "\n5- Filter House ");
        Scanner input = new Scanner(System.in);
        int selected;
        selected = input.nextInt();

            switch (selected){

                case 1:
                    System.out.println("-HOUSE LIST-");
                    for (Estate estate : estateService.getListByType(estateList, "House")) {

                        System.out.println("-----------------------------------------------------");
                        System.out.println("Price : $" + estate.getPrice());
                        System.out.println("Square Meter : " + estate.getArea());
                        System.out.println("Room Count : " + estate.getRoomCount());
                        System.out.println("Living Room Count : " + estate.getLivingRoomCount());
                    }
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Total price of houses: $" + estateService.getTotalPriceByType("House"));
                    System.out.println("Average square meters of houses: " + estateService.getAverageAreaByType("House"));
                    System.out.println("-----------------------------------------------------");

                break;
                case 2:
                    System.out.println("-SUMMERHOUSE LIST-");
                    for (Estate estate : estateService.getListByType(estateList, "SummerHouse")) {

                        System.out.println("-----------------------------------------------------");
                        System.out.println("Price : $" + estate.getPrice());
                        System.out.println("Square Meter : " + estate.getArea());
                        System.out.println("Room Count : " + estate.getRoomCount());
                        System.out.println("Living Room Count : " + estate.getLivingRoomCount());
                    }
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Total price of summerhouses: $" + estateService.getTotalPriceByType("SummerHouse"));
                    System.out.println("Average square meters of summerhouses: " + estateService.getAverageAreaByType("SummerHouse"));
                    System.out.println("-----------------------------------------------------");

                    break;
                case 3:
                    System.out.println("-VILLA LIST-");
                    for (Estate estate : estateService.getListByType(estateList, "Villa")) {

                        System.out.println("-----------------------------------------------------");
                        System.out.println("Price : $" + estate.getPrice());
                        System.out.println("Square Meter : " + estate.getArea());
                        System.out.println("Room Count : " + estate.getRoomCount());
                        System.out.println("Living Room Count : " + estate.getLivingRoomCount());
                    }
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Total price of villas: $" + estateService.getTotalPriceByType("Villa"));
                    System.out.println("Average square meters of villas: " + estateService.getAverageAreaByType("Villa"));
                    System.out.println("-----------------------------------------------------");

                    break;
                case 4:

                    System.out.println("-----------------------------------------------------");
                    System.out.println("Total price of all houses: $" + estateService.getTotalPrice());
                    System.out.println("Average square meters of all houses: " + estateService.getAverageArea());
                    System.out.println("-----------------------------------------------------");

                    break;
                case 5:

                    System.out.println("-----------------------------------------------------");
                    List<Estate> filteredHouses = estateService.filterByRoomAndLivingRoom(estateList,4, 2);
                    System.out.println("Houses with 4 rooms and 2 living rooms:");
                    for (Estate estate : filteredHouses) {
                        System.out.println(estate.getType() + " : $" + estate.getPrice() + " - " + estate.getArea() + " square meters");
                    }
                    System.out.println("-----------------------------------------------------");

                    break;
                default :
                    System.out.println("Please select the estate type:" +
                            "\n1- House List" +
                            "\n2- Summerhouse List" +
                            "\n3- Villa List" +
                            "\n4- All Houses Details" +
                            "\n5- Filter House ");

                    break;
            }



    }
}
