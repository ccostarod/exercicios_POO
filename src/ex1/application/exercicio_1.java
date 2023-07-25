package ex1.application;


import ex1.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle;

        rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println("AREA = "+ rectangle.area());
        System.out.println("Perimeter = "+rectangle.perimeter());
        System.out.println("Diagonal = "+rectangle.diagonal());


    }

}
