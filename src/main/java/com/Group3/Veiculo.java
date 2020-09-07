package com.Group3;

public class Veiculo {
    private String licensePlate;
    private String brand;
    private String color;

    public Veiculo(String plate, String brand, String color){
        this.licensePlate = plate;
        this.brand = brand;
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
}
