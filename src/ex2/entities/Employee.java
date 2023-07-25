package ex2.entities;

public class Employee {
    public String name;
    public double GrossSalary;
    public double Tax;

    public void employee(){
        System.out.printf("Employee: %s, $ %.2f\n", name, GrossSalary - Tax);
    }

    public void update(double porcentage){
        double salary_update = (GrossSalary - Tax) + GrossSalary * porcentage/100;
        System.out.printf("Update Data: %s, $ %.2f", name, salary_update);
    }
}
