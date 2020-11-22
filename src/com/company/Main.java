package com.company;

import models.Countries;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Countries countries = new Countries();
        countries.readDataFromFile("vat-eu.txt");

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

        countries.sortedByBasicRate(limit);

    }
}
