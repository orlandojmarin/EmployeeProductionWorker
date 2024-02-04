/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeeeandproductionworkerdemo;
import java.util.Scanner;

/**
 *
 * @author orlandomarin
 */
public class EmployeeeAndProductionWorkerDemo {

    public static void main(String[] args) 
    {
        // create a Production Worker object 
        ProductionWorker worker1 = makeProductionWorker();
        
        // display the object
        displayProductionWorker(worker1);
        System.out.println();
        
        // change at least one field
        worker1.setName("Sandy Squirrel");
        worker1.setHourlyPayRate(worker1.getHourlyPayRate()*1.05);
        
        // display the object
        displayProductionWorker(worker1);
        System.out.println();
        
        // create a second Production Worker
        ProductionWorker worker2 = makeProductionWorker();
                
        // displayProductionWorker
        displayProductionWorker(worker2);
    }
    
    // create a method that shows info about objects
    
    public static void displayProductionWorker(ProductionWorker object)
    {
        String name, number, hireDate;
        int shift;
        double hourlyPayRate;
        
        name = object.getName();
        number = object.getNumber();
        hireDate = object.getHireDate();
        shift = object.getShift();       
        hourlyPayRate = object.getHourlyPayRate();
        
        System.out.printf("Name: %s\nID number: %s\nHire date: %s\nShift: %d\nHourly Pay Rate: $%,.2f",
                name, number, hireDate, shift, hourlyPayRate);
    }
    
    public static ProductionWorker makeProductionWorker()
    {
        String name, number, hireDate;
        int shift;
        double hourlyPayRate;
        
        Scanner keyboard = new Scanner(System.in);
        
        // ask for name, id, hire date, shift, hourly rate
        System.out.println("What is the employee name?");
        name = keyboard.nextLine();
        
        System.out.println("What is the employee ID number?");
        number = keyboard.nextLine();
        
        System.out.println("What is the employee hire date?");
        hireDate = keyboard.nextLine();
        
        System.out.println("What is the employee shift?");
        shift = keyboard.nextInt();
        
        System.out.println("What is the employee hourly pay rate?");
        hourlyPayRate = keyboard.nextDouble();
        
        // we're not reading strings after Ints or doubles, so there shouldn't be issues
        
        ProductionWorker newWorker = new ProductionWorker(name, number, hireDate, shift, hourlyPayRate);
        
        return newWorker;
    }
}
