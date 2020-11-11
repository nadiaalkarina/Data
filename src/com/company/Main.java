package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        String name, address;
        Boolean genderr;
        phonenumber Phone;
        System.out.println("+-----------------------------------------+");
        System.out.println("|          PERSONAL DATA FORM             |");
        System.out.println("+-----------------------------------------+");
        System.out.println("How many people data?");
        int people = data.nextInt();
        System.out.println("-------------------------------------------");
        String abc[][] = new String[people][4];

        for(int i= 0; i<people; i++)
        {
            System.out.println("");
            System.out.println("Data "+(i+1));

            for(int j=0; j<people; j++)
            {
                if (j == 0) {
                    System.out.print("Name \t\t    :");
                }
                else if (j == 1){
                    System.out.print("Address \t\t   : ");
                }
                else if (j == 2) {
                    System.out.print("Phone Number \t\t : ");
                    Phone = new phonenumber();
                }
                else {
                    System.out.print("Gender \t \t: ");
                    genderr = new Boolean();
                }
            }
        }

    }
}
