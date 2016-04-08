package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Minenko on 08.04.2016.
 */
public class Class2 {
    public static void InvertArgs(String[] args) {
        int i = args.length;
        while (i > 0) {
            i--;
            System.out.println("Аргумент = " + args[i]);
        }
    }


    public static void SluchChisla(String[] args) {
        System.out.println('\n' + "Введите количество случайных чисел");
        Scanner chisla = new Scanner(System.in);
        String k = chisla.nextLine();
        int z = Integer.parseInt(k);

        Random rand = new Random();

        System.out.println("Случайные числа в столбик:" + '\n');
        for (int i = 0; i < z; i++) {

            System.out.println(rand.nextInt());
        }
        System.out.println('\n' + "Случайные числа в строку:" + '\n');
        for (int i = 0; i < z; i++) {
            //  int n = rand.nextInt();
            System.out.print(rand.nextInt() + " ");
        }
        //System.out.println('\n');
    }
    public static void Password (String [] args)
    {
        System.out.println('\n' + "Введите пароль и нажмите клавишу <Enter>");
        Scanner password = new Scanner(System.in);

        String password1 = password.nextLine();
        String password2 = "qwerty";

        System.out.println("сравнение паролей " + (password1 == password2)); //
        System.out.println("сравнение паролей " + password1.equals(password2));
    }

    public static void SumProizv (String [] args)
    {
        int sum = 0;
        int proizv = 1;
        for (int i = 0; i < args.length; i++)
        {
            sum += Integer.parseInt(args[i]);
            proizv *= Integer.parseInt(args[i]);
        }
        System.out.println('\n' + "Сумма чисел: " + sum);
        System.out.println("Произведение чисел: " + proizv);
    }

}