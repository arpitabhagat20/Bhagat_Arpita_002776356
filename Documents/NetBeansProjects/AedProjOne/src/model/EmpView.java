/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author arpitabhagat
 */
public class EmpView {
    private ArrayList<EmpCreate> register;
    public EmpView(){
    this.register= new ArrayList<EmpCreate>();
}

    public ArrayList<EmpCreate> getRegister() {
        return register;
    }

    public void setRegister(ArrayList<EmpCreate> register) {
        this.register = register;
    }
    
    public EmpCreate addnewEmployee(){
        EmpCreate newEmployee = new EmpCreate();
        register.add(newEmployee);
        return newEmployee;
    }
    
    public void deleteRegister(EmpCreate employee){
        register.remove(employee);
    }
}
