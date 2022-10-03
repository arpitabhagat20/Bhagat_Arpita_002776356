/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;

/**
 *
 * @author arpitabhagat
 */
public class EmpCreate {
    private int employeeId;
    private String employeeName;
    private int age;
    private String gender;
    private String startDate;
    private String level;
    private String teamInformation;
    private String positionTitle;
    private Long employeePhoneNo;
    private String employeeemailAddress;
    private String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }



    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeamInformation() {
        return teamInformation;
    }

    public void setTeamInformation(String teamInformation) {
        this.teamInformation = teamInformation;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public Long getEmployeePhoneNo() {
        return employeePhoneNo;
    }

    public void setEmployeePhoneNo(Long employeePhoneNo) {
        this.employeePhoneNo = employeePhoneNo;
    }

    public String getEmployeeemailAddress() {
        return employeeemailAddress;
    }

    public void setEmployeeemailAddress(String employeeemailAddress) {
        this.employeeemailAddress = employeeemailAddress;
    }


    @Override
    public String toString(){
        return employeeName;
    }

}