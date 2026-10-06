package IgnacioEmployeePayrolll;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
    public class PartTimeFaculty extends Employee {

    private double hoursWorked;
    private double hourlyRate;

    public PartTimeFaculty(
            String employeeId,
            String name,
            String department,
            double hoursWorked,
            double hourlyRate) {

        super(employeeId, name, department);

        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void displayFacultyType() {
        System.out.println("Employee Type\t: Part-Time Faculty");
    }
}



