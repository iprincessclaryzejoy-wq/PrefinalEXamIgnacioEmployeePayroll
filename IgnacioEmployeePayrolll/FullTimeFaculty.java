
package IgnacioEmployeePayrolll;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
 public class FullTimeFaculty extends Employee {

    private double monthlySalary;
    private double allowance;

    public FullTimeFaculty(String employeeId,String name,String department,double monthlySalary, double allowance) {

        super(employeeId, name, department);

        this.monthlySalary = monthlySalary;
        this.allowance = allowance;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    // Method overriding
    @Override
    public double calculateSalary() {
        return monthlySalary + allowance;
    }

    public void displayFacultyType() {
        System.out.println("Employee Type\t: Full-Time Faculty");
    }
}

