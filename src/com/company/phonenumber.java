package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class phonenumber {
    public void phonenum(){
        boolean valid = true;
        Scanner data = new Scanner(System.in);
        System.out.println("Phone Number \t\t : ");
        int nbr = data.nextInt();
        if (nbr >= 10 || nbr = 12) {
            valid = false;
            break;
        } else {
            System.out.println("Input Correct Phone Number \t\t : ");
            nbr = data.nextInt();
        }

    }
}

