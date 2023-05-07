package com.fl;

public class Car {
    public String brand = "无名";
    public int price = 0;
    public String color = "灰色";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
