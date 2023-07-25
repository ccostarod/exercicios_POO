package ex3.application;

import ex3.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student;
        student = new Student();
        student.name = sc.nextLine();
        student.score1 = sc.nextDouble();
        student.score2 = sc.nextDouble();
        student.score3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + student.final_score());

        student.result();

    }
}