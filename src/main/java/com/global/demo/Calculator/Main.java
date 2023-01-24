package com.global.demo.Calculator;

public class Main {
    public static double Add(int a, int b ) {
        return a+b;
    }

    public static double Sub(int a, int b ) {
        return a-b;
    }

    public static double Multiple(int a, int b ) {
        return a*b;
    }

    public static double Divide(int a, int b ) {
        return a/b;
    }

    public static boolean checkEven(int num){
        if(num%2==0){
            return true;
        }else {
            return false;
        }
    }
    public static boolean checkOdd(int num){
        if(num%2!=0){
            return true;
        }else {
            return false;
        }
    }
}
