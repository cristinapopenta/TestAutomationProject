package Homework02;

public class Sum {
    public static void main(String[] args){

        System.out.println("-----------------------------------");
        int sumFor=0; //suma initala este 0
        for (int i=1;i<=100;i++){
            sumFor+=i;
        }
        System.out.println("Suma calculata cu for este: " + sumFor);

        System.out.println("-----------------------------------");
        int sumWhile=0; //suma initala este 0
        int j=1;
        while (j<=100){
            sumWhile+=j;
            j++;
        }
        System.out.println("Suma calculata cu while este: " + sumWhile);

        System.out.println("-----------------------------------");
        int sumDo=0; //suma initala este 0
        int k=1;
        do {
            sumDo+=k;
            k++;
        } while (k<=100);
        System.out.println("Suma calculata cu do while este: " + sumDo);
    }

}

