/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author arpitabhagat
 */
public class EmpValidation {
    public boolean isnotNull(String nullVar){
        return (nullVar!=null && !nullVar.isEmpty());
    }
    
    public boolean isVarcharValid(String varChar){
       String regex = "^[a-zA-Z0-9]+$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(varChar);
        return m.matches();         
    }
    
    public boolean isnumberValid(String number){
       String regex = "^[0-9]+$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(number);
        return m.matches();         
    }
    
    public boolean isEmployeeUnique(EmpView employeeData, String id ){
       List<EmpCreate> employeeList = employeeData.getRegister();
       for(EmpCreate employeeObject : employeeList){
           if(String.valueOf(employeeObject.getEmployeeId())!=null && id.equalsIgnoreCase(String.valueOf(employeeObject.getEmployeeId())))
               return false;
       }
       return true;
    }
    
      public boolean ischarFieldValid (String charField){
       String regex = "^[a-zA-Z]+$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(charField);
        return m.matches();         
    }
    public boolean DateValidation(String date) {
        
       SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
       SimpleDateFormat formatter= new SimpleDateFormat("MM/dd/yyyy");
       Date date1 = new Date(System.currentTimeMillis());
        // Input to be parsed should strictly follow the defined date format
        // above.
        boolean test;
        format.setLenient(false);

        
        try {
            format.parse(date);
        } catch (ParseException e) {
            return false;
            
            } 
        int val = date.compareTo(formatter.format(date1));
        if(val <=  0) 
        { 
            test = true;
        } 
        else 
        { 
            test = false;
        }
        return test;

    }

       public boolean isEmailAddressValid (String email){
       String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        return m.matches();         
    }

}
