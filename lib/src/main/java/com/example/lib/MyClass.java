package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        int year=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("��J�褸�~");

        year = scanner.nextInt();

        if(year%4!=0)
            System.out.print("���O�Ӧ~");

        else if(year%100!=0)

            System.out.print("�O�Ӧ~");

        else if(year%400!=0)

            System.out.print("���O�Ӧ~");

        else

            System.out.print("�O�Ӧ~");

    }

}
