package IgnacioEmployeePayrolll;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
 public class Test {

    public static void main(String[] args) {

        FullTimeFaculty fullTime = new FullTimeFaculty("FT001", "Juan Dela Cruz", "Information Technology", 30000, 5000);

        PartTimeFaculty partTime = new PartTimeFaculty("PT001", "Maria Santos", "Business Administration", 120, 150);

        AdminStaff admin = new AdminStaff("AS001", "Pedro Garcia", "Finance", 25000, 2500);
        
        Employee[] employees = {fullTime,partTime,admin};
        displayHeader();

        for (Employee employee : employees) {
            displayEmployee(employee);
        }

        displaySummary();
    }
    
    public static void displayHeader() {
        System.out.println("==================================================");
        System.out.println("      DON JOSE ECLEO MEMORIAL COLLEGE");
        System.out.println("          EMPLOYEE PAYROLL SYSTEM");
        System.out.println("==================================================");
        System.out.println();
    }

    public static void displayEmployee(Employee employee) {

        employee.displayEmployeeInfo();

        if (employee instanceof FullTimeFaculty fullTimeFaculty) {
            fullTimeFaculty.displayFacultyType();

        } else if (employee instanceof PartTimeFaculty partTimeFaculty) {
            partTimeFaculty.displayFacultyType();

        } else if (employee instanceof AdminStaff adminStaff) {
            adminStaff.displayStaffType();
        }
        
        System.out.printf(
                "Salary\t\t: PHP %,.2f%n",
                employee.calculateSalary()
        );

        System.out.println("--------------------------------------------------");
        System.out.println();
    }

    public static void displaySummary() {
        System.out.println("==================================================");
        System.out.println(
                "Total Employees: " + Employee.getEmployeeCount()
        );
        System.out.println("==================================================");
    }
}
