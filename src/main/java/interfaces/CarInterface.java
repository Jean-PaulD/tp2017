package interfaces;

/**
 * Created by Jean-Paul D on 2017-03-26.
 */
public interface CarInterface {

    String brand = "BMW";
    String model = "M3";
    String power = "309kw";
    int year = 2007;

     void setCarBrandAndModel(String brand, String model);


    public String carBrandAndModel(String brand, String model);
    public String power(String power);
    public int year(int year);

}
