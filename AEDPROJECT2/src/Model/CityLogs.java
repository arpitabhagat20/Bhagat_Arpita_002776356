/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author arpitabhagat
 */
public class CityLogs {
    private ArrayList<City> cityLogs;
    public CityLogs() {
    this.cityLogs = new ArrayList<City>();
    
    }

    public ArrayList<City> getCityLogs() {
        return cityLogs;
    }

    public void setCityLogs(ArrayList<City> cityLogs) {
        this.cityLogs = cityLogs;
    }
    
    public City addNewCity(){
        City city = new City();
        cityLogs.add(city);
        return city;
    }
    
    public void deleteCity(City city)
    {   
        cityLogs.remove(city);
    }
    
}
