/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.Scanner;
import model.Country;


/**
 *
 * @author DELL
 */
public class Library {

    public static String checkInputString() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty() ) {
                System.out.print("Can not be empty. Let's try enter again:        ");     
            } else {
                return result;
            }
        }
    }
    
    
    public static boolean checkCountryExist( ArrayList<Country> countryList, String countryCode) {
        for ( Country country : countryList) {
            if (country.getCountryCode().equalsIgnoreCase(countryCode)) {
                return false;
            }
        }
        return true;
    }
    
    
    public static float checkInputFloat() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                float choice = Float.parseFloat(sc.nextLine().trim());
                return choice;
            } catch (NumberFormatException e) {
                System.out.print("*Invalid value(only type number). Try enter again:      ");
            }
        }
    }
    
    
   
    
    
    
    
}
