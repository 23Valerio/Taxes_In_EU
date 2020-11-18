package models;

public class Country {
    String shortName;
    String name;
    double basicRate;
    double reducedRate;
    boolean parkingRate;

    public Country(String shortName, String name, double basicRate, double reducedRate, boolean parkingRate) {
        this.shortName = shortName;
        this.name = name;
        this.basicRate = basicRate;
        this.reducedRate = reducedRate;
        this.parkingRate = parkingRate;
    }

    public void basicRateMoreThen (double basicRate) {
        if (this.basicRate >= basicRate)
             System.out.println(this.name + " (" + this.basicRate + " %)");
    }

}
