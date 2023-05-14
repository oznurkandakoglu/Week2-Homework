package org.example.service;

import org.example.Estate;
import org.example.estate.types.House;
import org.example.estate.types.SummerHouse;
import org.example.estate.types.Villa;

import java.util.ArrayList;
import java.util.List;

public class EstateService {
    private List<Estate> estateList;

    public EstateService(List<Estate> estateList) {
        this.estateList = estateList;
    }

    public double getTotalPriceByType(String type) {
        double totalPrice = 0;

        for(Estate estate : estateList){
            if(estate.getType().equals(type)){
                totalPrice += estate.getPrice();
            }
        }
        return totalPrice;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Estate estate : estateList) {
            totalPrice += estate.getPrice();
        }
        return totalPrice;
    }

    public double getAverageAreaByType(String type) {
        double totalArea = 0;
        int count = 0;
        for (Estate estate : estateList) {
            if (estate.getType().equals(type)) {
                totalArea += estate.getArea();
                count++;
            }
        }
        return totalArea / count;
    }

    public double getAverageArea() {
        double totalArea = 0;
        for (Estate estate : estateList) {
            totalArea += estate.getArea();
        }
        return totalArea / estateList.size() ;
    }

    public List<Estate> filterByRoomAndLivingRoom(int roomCount, int livingRoomCount) {
        List<Estate> filteredHouses = new ArrayList<>();
        for (Estate estate : estateList) {
            if (estate instanceof House) {
                House house = (House) estate;
                if (house.getRoomCount() == roomCount && house.getLivingRoomCount() == livingRoomCount) {
                    filteredHouses.add(house);
                }
            } else if (estate instanceof Villa) {
                Villa villa = (Villa) estate;
                if (villa.getRoomCount() == roomCount && villa.getLivingRoomCount() == livingRoomCount) {
                    filteredHouses.add(villa);
                }
            } else if (estate instanceof SummerHouse) {
                SummerHouse summerHouse = (SummerHouse) estate;
                if (summerHouse.getRoomCount() == roomCount && summerHouse.getLivingRoomCount() == livingRoomCount) {
                    filteredHouses.add(summerHouse);
                }
            }
        }
        return filteredHouses;
    }
}
