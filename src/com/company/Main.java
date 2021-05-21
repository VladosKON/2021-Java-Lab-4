package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Java 8. Полное руководство", "Г.Шилдт");
        Book book2 = new Book("Кейцерова соната","Л. Толстой");
        Reader reader1 = new Reader("Петров", book1, 01, 04);
        Reader reader2 = new Reader("Васечкин", book2, 25, 03);

        System.out.println("Введите день");
        Scanner sc1 = new Scanner(System.in);
        int day = sc1.nextInt();

        System.out.println("Введите месяц");
        Scanner sc2 = new Scanner(System.in);
        int month = sc2.nextInt();

        System.out.println(reader1);
        System.out.println(reader1.inTime(month, day));

        System.out.println(reader2);
        System.out.println(reader2.inTime(month, day));
    }
}
