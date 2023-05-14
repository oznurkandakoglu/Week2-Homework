package org.example.estate.types;

import org.example.Estate;

public class House extends Estate {

    public House(double price, double area, int roomCount, int livingRoomCount) {
        super(price, area, roomCount, livingRoomCount);
    }

    @Override
    public String getType() {
        return "House";
    }
}