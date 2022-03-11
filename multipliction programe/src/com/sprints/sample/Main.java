package com.sprints.sample;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number;
        Scanner se = new Scanner (System.in);
        System.out.println("please enter the number : "); // hello from test branch
        number=se.nextInt() ; // done

        for (int i=0 ; i<10; i++) //first comment
        {
            System.out.println(number + "*" + i + "=" + number *i); //5*0 =0

        }
    }
}
