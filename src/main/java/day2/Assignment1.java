package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;
public class Assignment1 {
    private static String x = "";
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an number");
        while(true) {
            x = keyboard.nextLine();
            if (x.equals("q")){
                System.out.println("Terminating...");
                break;
            }
            Integer num = 0;
            try{
                num = Integer.parseInt(x);
                if (num <= 0){
                    System.out.println("Number should larger than 0!");
                }
                int i = num;
                while (i > 0 ){
                    ++num;
                    --i;
                }
                System.out.println("The number is : " + num);
            }
            catch(NumberFormatException e){
                System.out.println("Please enter a number.");
            }
        }
    }
    public static int doSomething(int x){
        return ++x;
    }
}

