package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Input string
        GetSetString objGetSet = new GetSetString();
        System.out.println("Enter First String:");
        objGetSet.setStrFirst(in.nextLine());
        System.out.println("Enter second String:");
        objGetSet.setStrSecond(in.nextLine());
        System.out.println("Enter third String:");
        objGetSet.setStrThird(in.nextLine());
        //Output string
        StringCharMix objectOfStringCharMix = new StringCharMix();
        System.out.println("String Merged :"
                +objectOfStringCharMix.stringMergeByChar(objGetSet.getStrFirst(),objGetSet.getStrSecond(),
                objGetSet.getStrThird()));


    }
}
