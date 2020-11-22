package models;

public class Country  implements Comparable <Country> {
    String shortName;
    String name;
    int basicRate;
    double reducedRate;
    boolean parkingRate;

    public Country(String shortName, String name, int basicRate, double reducedRate, boolean parkingRate) {
        this.shortName = shortName;
        this.name = name;
        this.basicRate = basicRate;
        this.reducedRate = reducedRate;
        this.parkingRate = parkingRate;
    }

    public int getBasicRate() {
        return basicRate;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Country country) {
        return this.basicRate - country.getBasicRate();

    }
}
