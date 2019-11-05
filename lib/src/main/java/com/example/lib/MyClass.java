package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        int year=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("輸入西元年");

        year = scanner.nextInt();

        if(year%4!=0)
            System.out.print("不是閨年");

        else if(year%100!=0)

            System.out.print("是閨年");

        else if(year%400!=0)

            System.out.print("不是閨年");

        else

            System.out.print("是閨年");

    }

}
