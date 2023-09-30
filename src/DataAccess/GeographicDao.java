/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import common.Library;
import java.util.ArrayList;
import java.util.Collections;
import model.Country;

/**
 *
 * @author DELL
 */
public class GeographicDao {
    private static GeographicDao instance = null;
    public static GeographicDao Instance() {
        if (instance == null) {
            synchronized (GeographicDao.class) {
                if (instance == null) {
                    instance = new GeographicDao();
                }
            }
        }
        return instance;
    }
    
    
    public void inputCountry(ArrayList<Country> countryList) {
        System.out.print("Enter code of country:      ");
        String countryCode = Library.checkInputString();
        
        if (!Library.checkCountryExist(countryList, countryCode)) {
            System.out.println("*Country already exist*");
            return ;
        }
        System.out.print("Enter name of country:      ");
        String countryName = Library.checkInputString();
        System.out.print("Enter total Area:         ");
        float totalArea = Library.checkInputFloat();
        System.out.print("Enter terrain of country:     ");
        String countryTerrain = Library.checkInputString();
        countryList.add(new Country(countryTerrain, countryCode, countryName, totalArea));
        System.out.println("* Add new Country successfully");
    }
    
    
    public  void printCountry(ArrayList<Country> countryList) {
        System.out.format("%-10s%-25s%-20s%-25s \n","ID", "Name", "Total Area","Terrain");
        for (Country country : countryList) {
            country.display();
        }
    }
    
    public void printCountrySorted(ArrayList<Country> countryList) {
        Collections.sort(countryList);
        System.out.format("%-10s%-25s%-20s%-25s \n","ID", "Name", "Total Area","Terrain");
        for (Country country : countryList) {
            country.display();
        }
    }
    
    
    public void searchCountryByName(ArrayList<Country> countryList) {
        System.out.print("Enter the country name you want to search for:      ");
        String countryName = Library.checkInputString();
        System.out.format("%-10s%-25s%-20s%-25s \n","ID", "Name", "Total Area","Terrain");
        for (Country country : countryList) {
            if (country.getCountryCode().equalsIgnoreCase(countryName)) {
                country.display();
            }
        }
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
