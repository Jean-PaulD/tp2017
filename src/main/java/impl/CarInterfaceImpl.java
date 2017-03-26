package impl;

import interfaces.CarInterface;

/**
 * Created by Jean-Paul D on 2017-03-26.
 */
public class CarInterfaceImpl implements CarInterface{

    String brand;
    String model;

    public void setCarBrandAndModel(String brand, String  model) {
        this.brand = brand;
        this.model = model;

    }

    public String returnCarBrandandAndModel(){
        return brand + " " + model;
    }


    public String carBrandAndModel(String brand, String model) {
        return brand+model;
    }

    public String power(String power) {
        return power;
    }

    public int year(int year) {
        return year;
    }

}
