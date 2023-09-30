/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.util.ArrayList;
import model.Country;

/**
 *
 * @author DELL
 */
public interface InterfaceGeographicRepository {
    void addCountry(ArrayList<Country> countryList);
    void displayCountry(ArrayList<Country> countryList);
    void searchCountry(ArrayList<Country> countryList);
    void sortCountry(ArrayList<Country> countryList);
}
