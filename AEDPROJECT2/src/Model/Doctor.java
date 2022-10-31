/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author arpitabhagat
 */
public class Doctor extends Person{
    City city;
    Community community;
    
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public Doctor() {
        city = new City();
        community = new Community();
    }
    @Override
    public String toString()
    {
           
           return this.getName();
    }
}
    