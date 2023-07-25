package ex2.application;
import ex2.entities.Employee;


import java.util.Locale;
import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee user;
        user = new Employee();
        System.out.print("Name: ");
        user.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        user.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        user.Tax = sc.nextDouble();

        user.employee();
        System.out.print("Which percentage to increase salary? ");

        double percentage = sc.nextDouble();

        user.update(percentage);

    }
}
