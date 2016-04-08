package com.company;

import java.util.Scanner;
import static com.company.Class2.*;
import static com.company.Class3.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите ваше имя и нажмите клавишу <Enter>");
        Scanner name = new Scanner(System.in);

        String x = name.nextLine();
        System.out.println(x + ", привет!" + '\n' + '\n');
        InvertArgs (args);
        SluchChisla (args);
        Password(args);
        SumProizv(args);
        Console(args);
    }
}
