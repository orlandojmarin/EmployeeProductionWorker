/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeeandproductionworkerdemo;

/**
 *
 * @author orlandomarin
 */
public class ProductionWorker extends Employee
{
    // fields
    private int shift;
    private double hourlyPayRate;
    
    // constructor
    public ProductionWorker(String empName, String empNumber, String empHireDate, int workerShift, double workerHourlyPay)
    {
        super(empName, empNumber, empHireDate);
        shift = workerShift;
        hourlyPayRate = workerHourlyPay;
    }
    
    public void setShift(int workerShift)
    {
        shift = workerShift;
    }
    
    public void setHourlyPayRate(double workerHourlyPay)
    {
        hourlyPayRate = workerHourlyPay;
    }
    
    public int getShift()
    {
        return shift;
    }
    
    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }
}
