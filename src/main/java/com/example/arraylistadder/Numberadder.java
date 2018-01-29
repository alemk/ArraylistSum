package com.example.arraylistadder;

import java.util.ArrayList;
import java.util.Scanner;

public class Numberadder {

    public String adder()

    {
        int average;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Integer sum = 0;
        Scanner keyboad = new Scanner(System.in);
        System.out.println("please enter how many numbers you want to enter");
        int loopcount = keyboad.nextInt();

        for(int i=0;i< loopcount;i++)
        {
           numbers.add(keyboad.nextInt());

            sum += numbers.get(i);
        }
        average=sum/loopcount;

        return "Sum " + sum +" <br/> Average: "+ average;
    }
}





