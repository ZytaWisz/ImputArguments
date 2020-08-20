package com.company;

public class Main {


    public static void main(String [] args){
        if(args.length==0) {
            System.out.println("Please specify a location");
        }
        else {
            System.out.println("Ilosc argumentow "+args.length);
            String location = args[0];
            int temperature = 60 + (int)(Math.random()*10);
            System.out.println("The weather in "+location+" is "+ temperature);
        }
    }
}
