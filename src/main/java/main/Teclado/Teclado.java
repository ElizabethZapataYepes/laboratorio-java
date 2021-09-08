package main.Teclado;

import java.util.Scanner;

public class Teclado {

    public static String input(){
        Scanner scanner=new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Double inputDouble(){
        Scanner scanner=new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static Integer inputInteger(){
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
}
