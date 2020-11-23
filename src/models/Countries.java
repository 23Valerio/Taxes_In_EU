package models;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Countries {
    ArrayList <Country> countries;


    public void readDataFromFile (String filePath) throws Exception {
        this.countries = new ArrayList<>();
        // open file for read data
        FileReader fr = new FileReader(filePath);
        Scanner scan = new Scanner(fr);

        // read the line from the text-file
        // and make array that matches for the  one country
        // then write data in to the fields of main class

        while (scan.hasNextLine()) {
            String[] bufArray = scan.nextLine().split("\\s");
            this.countries.add(  new Country(bufArray[0],
                    bufArray[1],
                    Integer.parseInt(bufArray[2]),
                    Double.parseDouble(bufArray[3]),
                    Boolean.parseBoolean(bufArray[4])));
        }
        fr.close();

    }

    public void  sortedByBasicRate (double input) {

        ArrayList <Country> sortedCountries = new ArrayList<>();
        for (Country countries : countries) {
            if (countries.getBasicRate() >= input ) sortedCountries.add(countries);
        }
        Collections.sort(sortedCountries);
        for(Country str: sortedCountries){
            System.out.println(str.getName() + " (" + str.getBasicRate() + " %)");
        }

    }
}
