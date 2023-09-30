/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Repository.GeographicRepository;
import Repository.InterfaceGeographicRepository;
import common.Library;
import java.util.ArrayList;
import model.Country;
import view.Menu;

/**
 *
 * @author DELL
 */
public class GeographicManager extends Menu<String> {
        
    static String[] mc = {"Input the information of 11 countries in East Asia",
                          "Display the information of country you have just input",
                          "Search the information of country by user-entered name",
                          "Display the information of countries sorted name in ascending",
                          "exit" };
    
    protected ArrayList<Country> countryList;
    protected InterfaceGeographicRepository countryRepository;
    protected Library validate;
    
    public GeographicManager(){
        super("\n\t\t\t MENU \t\t\t",mc);
        countryList = new ArrayList<>();
        countryRepository = new GeographicRepository();
        validate = new Library();
        // demo
        countryList.add(new Country("Nice, Amazingly, Fantastic", "VN", "Viet Nam", 331690));    
        countryList.add(new Country("Nice", "IDN", "Indonesia", 1905000));
        countryList.add(new Country("Good", "JP", "Nhat Ban", 377973));
        
    }

    
    
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1-> countryRepository.addCountry(countryList);
            case 2-> countryRepository.displayCountry(countryList);
            case 3-> countryRepository.searchCountry(countryList);
            case 4-> countryRepository.sortCountry(countryList);
            case 5-> System.exit(0);
        }
    }
    
  
    
     
    
}
