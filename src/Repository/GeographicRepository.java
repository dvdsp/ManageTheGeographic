/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.GeographicDao;
import java.util.ArrayList;
import java.util.List;
import model.Country;

/**
 *
 * @author DELL
 */
public class GeographicRepository implements InterfaceGeographicRepository{
    private List<Country> countryList;
    public GeographicRepository() {
        this.countryList = new ArrayList<>();
    }

    @Override
    public void addCountry(ArrayList<Country> countryList) {
        GeographicDao.Instance().inputCountry(countryList);
    }

    @Override
    public void displayCountry(ArrayList<Country> countryList) {
        GeographicDao.Instance().printCountry(countryList);
    }

    @Override
    public void searchCountry(ArrayList<Country> countryList) {
        GeographicDao.Instance().searchCountryByName(countryList);
    }

    @Override
    public void sortCountry(ArrayList<Country> countryList) {
        GeographicDao.Instance().printCountrySorted(countryList);
    }
    
    
    
    
    
    
    
}
