//package- a package is a collection of same type of classes and interfaces  used to organize classes,void naming conflict,provide access protection. 
// examples built int - java.lang ,java.util,  java.io

import java.util.Scanner;

public class test{
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");

        int x= sc.nextInt();

        System.out.println("Number is:"+x);
        
    }
}