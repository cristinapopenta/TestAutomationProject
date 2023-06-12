package Homework02;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int number;
        System.out.print("Enter a year: ");
        number = input.nextInt();

        while (number<1600 || number>2016) {
            System.out.print("Repeat with value between 1900 and 2016: ");
            number = input.nextInt();
        }; //repet citirea pana cand anul citit e in intervalul corect

        if ((number%4==0) && (number%100!=0)) {
            System.out.println ("For year: " + number + " February has 29 days");
        } else if ((number%100==0) && (number%400!=0)){
            System.out.println ("For year: " + number + " February has 29 days");
        } else{
            System.out.println ("For year: " + number + " February has 28 days");
        }

        //alt test pentru acelasi lucru
        if ( ((number%4==0) && (number%100!=0)) || ((number%100==0) && (number%400!=0)) ) {
            System.out.println ("In anul: " + number + " Februarie are 29 zile");
        } else{
            System.out.println ("In anul: " + number + " Februarie are 28 zile");
        }

    }
}
