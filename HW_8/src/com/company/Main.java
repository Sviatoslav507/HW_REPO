package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        Employee[] employee = new Employee[4];
        employee[0] = new Employee.SalairedEmployee("Peter", 500, "079-05-1120");
        employee[1] = new Employee.ContractEmpoyee("Bob", 20000, "353-7564-756");
        employee[2] = new Employee.ContractEmpoyee("John",30000, "657-9754-940");
        employee[3] = new Employee.SalairedEmployee("Stephen", 700,"364-66-2494");
        for(int i = 0; i< employee.length; i++){
            employee[i].employeeInfo();
        }
    }
}
 abstract class Employee {
    private static AtomicInteger employeeId = new AtomicInteger(1);
    private int salary;
    private String name;
    public void employeeInfo(){}
     public int getSalary() {
         return salary;
     }

     interface calculation{
        int calculatePay();
    }
    static class ContractEmpoyee extends Employee implements calculation {
        private String federalTaxId;
        private int monthPayment;
        private String name;
        private int salary;
        private int id;
        public ContractEmpoyee(String name, int monthPayment, String federalTaxId){
            this.name = name;
            this.monthPayment = monthPayment;
            this.federalTaxId = federalTaxId;
            id = employeeId.getAndIncrement();
            getSalary();
        }
        @Override
        public int calculatePay() {
            salary = monthPayment;
            return salary;
        }
        @Override
        public void employeeInfo() {
            System.out.println("===========Employee info=========\n| NAME: "+name+"\n| ID: "+id+"\n| SALARY: "+calculatePay()+"\n| FTI: "+federalTaxId);
            System.out.println("=================================");
        }
        public int getSalary() {
            return salary;
        }
    }
    static class SalairedEmployee extends Employee implements calculation {
        private String socialSecurityNumber;
        private String name;
        private int hoursWorked;
        private int salary;
        private final int payPerHour = 200;
        private int id;
        public SalairedEmployee(String name, int hoursWorked, String socialSecurityNumber){
            this.name = name;
            this.hoursWorked = hoursWorked;
            this.socialSecurityNumber = socialSecurityNumber;
            id=employeeId.getAndIncrement();
            getSalary();
        }
        @Override
        public void employeeInfo() {
            System.out.println("===========Employee info=========\n| NAME: "+name+"\n| ID: "+id+"\n| SALARY: "+calculatePay()+" for "+hoursWorked+" hours"+"\n| SSN: "+socialSecurityNumber);
            System.out.println("=================================");
        }
        @Override
        public int calculatePay(){
            salary = hoursWorked * payPerHour;
            return salary;
        }
        public int getSalary() {
            return salary;
        }
    }
}
