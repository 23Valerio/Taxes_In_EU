package com.company;

import models.Country;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // open file for read data
        FileReader fr= new FileReader("vat-eu.txt");
        Scanner scan = new Scanner(fr);

        List<Country> countries = new ArrayList<>();

        // read the line from the text-file
        // and make array that matches for the  one country
        // then write data in to the fields of main class

        while (scan.hasNextLine()) {
            String[] bufArray = scan.nextLine().split("\\s");
            countries.add(  new Country(bufArray[0],
                            bufArray[1],
                            Double.parseDouble(bufArray[2]),
                            Double.parseDouble(bufArray[3]),
                            Boolean.valueOf(bufArray[4])));
        }
        fr.close();


        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        String input;

        double limit = 0;
        boolean isFirstOk;
        do {
            System.out.println("Please input value of basic rate: ");
            input = scanner.nextLine();
            try {
                limit = Double.parseDouble(input);
                isFirstOk = true;
            } catch (Exception e) {
                System.out.println("not a number ...");
                isFirstOk = false;
            }
        } while (!isFirstOk);

        // use method in main class which find basicRate more then inputs
        for (Country country : countries) {
            country.basicRateMoreThen(limit);
        }
    }
}
