/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author arpitabhagat
 */
public class Person {
    
    private String personName;
    private String personGender;
    private int personAge;
    private long personPhoneNumber;
    private String personUserName;
    private String personPassword;
    private String role;
//
//   public Person(String personName, String personGender, int personAge, long personPhoneNumber, String personUserName, String personPassword, String personEmailId) {
//        this.personName = personName;
//      this.personGender = personGender;
//    this.personAge = personAge;
//  this.personPhoneNumber = personPhoneNumber;
//this.personUserName = personUserName;
//this.personPassword = personPassword;
// this.personEmailId = personEmailId;
// }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public void setPersonPhoneNumber(long personPhoneNumber) {
        this.personPhoneNumber = personPhoneNumber;
    }

    public void setPersonUserName(String personUserName) {
        this.personUserName = personUserName;
    }

    public void setPersonPassword(String personPassword) {
        this.personPassword = personPassword;
    }


     public String getPersonName() {
        return personName;
    }

    public String getPersonGender() {
        return personGender;
    }

    public int getPersonAge() {
        return personAge;
    }

    public long getPersonPhoneNumber() {
        return personPhoneNumber;
    }

    public String getPersonUserName() {
        return personUserName;
    }

    public String getPersonPassword() {
        return personPassword;
    }


}

   