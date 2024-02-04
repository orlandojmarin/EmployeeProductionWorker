/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeeandproductionworkerdemo;

/**
 *
 * @author orlandomarin
 */
public class Employee 
{
    // fields
    private String name;
    private String number;
    private String hireDate;
    
    // constructor
    public Employee(String empName, String empNumber, String empHireDate)
    {
        name = empName;
        number = empNumber;
        hireDate = empHireDate;
    }
    
    // setters
    public void setName(String empName)
    {
        name = empName;
    }
    
    public void setNumber(String empNumber)
    {
        number = empNumber;
    }
    
    public void setHireDate(String empHireDate)
    {
        hireDate = empHireDate;
    }
    
    // getters
    public String getName()
    {
        return name;
    }
    
    public String getNumber()
    {
        return number;
    }
    
    public String getHireDate()
    {
        return hireDate;
    }
    
}
