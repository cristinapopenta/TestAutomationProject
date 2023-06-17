package course.course02;
public class Course02 {
    public static void main (String[] args)
    {
        System.out.println("----------------------------------------");
        System.out.println("BASIC MATHEMATICAL AND PRINT OPERATORS");
        System.out.println("----------------------------------------");

        System.out.println("Hello world!");
        int numberOfCircles, number; //naming convention for variables
        number = 5; //atribuire
        int secondNumber = 2; //declarare cu initializare
        System.out.println(number);
        System.out.println(secondNumber);
        final String FIRST_NAME="Darth Vader"; //constanta
        String name = "Sidius";
        System.out.println(number + name + secondNumber); //face concatenare
        int  suma = number + secondNumber;
        System.out.println(suma);
        //number = 10;
        suma = number + secondNumber;
        int produs = number * secondNumber;
        System.out.println("Suma este:" + suma);
        System.out.println("produsul este:" + produs);
        System.out.println(number + "+" + secondNumber + "=" + suma);
        System.out.println(number + "*" + secondNumber + "=" + produs);
        boolean isNegative = number < 0;
        System.out.println(isNegative);
        char caracter='a';
        System.out.println("Caracterul este: " + caracter);
        byte a=127;
        byte b=10;
        short suma2 = (short) (a+b);
        System.out.println(suma2);
        String numeComplet = FIRST_NAME + " " + name;
        System.out.println(numeComplet);
        int impartire = number / secondNumber;
        System.out.println(impartire);
        float impartire2 = (float) number / secondNumber;
        System.out.println("cat:"+impartire2);
        int modul = number % secondNumber;
        System.out.println("rest:"+ modul);
        modul=modul+5;
        modul+=5;
        modul-=3;
        modul *= 5;
        modul -=1;
        modul = modul +1;
        modul +=1;
        System.out.println("----------------------------------------");
        System.out.println("INCREMENT DECREMENT");
        System.out.println("----------------------------------------");

        System.out.println("inainte postincrementare: "+ modul);
        System.out.println("afisare si postincrementare: "+ modul++);
        System.out.println("dupa postincrementare: "+ modul++);
        System.out.println("inainte postdecrementare: "+ modul++);
        System.out.println("afisare si postdecrementare: "+ modul--);
        System.out.println("dupa postdecrementare: "+ modul++);
        System.out.println("inainte preincrementare: "+ modul++);
        System.out.println("afisare si preincrementare: "+ ++modul);
        System.out.println("dupa preincrementare: "+ modul++);
        System.out.println("inainte predecrementare: "+ modul++);
        System.out.println("afisare si predecrementare: "+ --modul);
        System.out.println("dupa predecrementare: "+ modul++);

        System.out.println("----------------------------------------");
        System.out.println("LOGICAL OPERATORS");
        System.out.println("----------------------------------------");

        //System.out.println("rest dupa modificare este: "+ modul);
        System.out.println("am doua numere: "+ number + "si" + secondNumber);
        boolean areEqual = number==secondNumber;
        boolean notEqual = number!=secondNumber;
        System.out.println("Are equal: " + areEqual);
        System.out.println("Are not equal: " + notEqual);
        boolean areBothPositive = number >=0 && secondNumber >=0;
        System.out.println("Both positive: " + areBothPositive);
        secondNumber=-2;
        System.out.println("cele doua numere: "+ number + " si " + secondNumber);
        areBothPositive = number >=0 && secondNumber >=0;
        System.out.println("Both positive: " + areBothPositive);
        boolean eitherIsPositive = number >=0 || secondNumber >=0;
        System.out.println("either number positive: " + eitherIsPositive);
        boolean reversedEitherIsPositive = !eitherIsPositive;
        System.out.println("reversed either number positive: " + reversedEitherIsPositive);
        //secondNumber=-3;
        secondNumber=2;
        System.out.println("cele doua numere: "+ number + " si " + secondNumber);
        boolean xorOperator = number >=0 ^ secondNumber >=0;
        System.out.println("xor: " + xorOperator);
        System.out.println("----------------------------------------");
        System.out.println("IF ELSE");
        System.out.println("----------------------------------------");

        System.out.println("First sequence");
        System.out.println("Second sequence");
        System.out.println("Third sequence");
        number=-5;
        boolean isNumberPositive = number>0;
        boolean isNumberNegative = number<0;
        if (isNumberPositive){
            System.out.println("nr este strict pozitiv");
        } else if (isNumberNegative){
            System.out.println("nr este strict negativ");
            } else {
                    System.out.println("nr este zero");
            }

        System.out.println("----------------------------------------");
        System.out.println("STILL IF ELSE");
        System.out.println("----------------------------------------");

        int a1=3;
        int b1=4;
        if (a1>b1){
            System.out.println("a1 este mai mare");
        } else if (a1<b1){
            System.out.println("b1 este mai mare");
        } else {
            System.out.println("nr egale");
        }
        System.out.println("----------------------------------------");
        System.out.println("SWITCH");
        System.out.println("----------------------------------------");

        String letter="B";
        switch (letter){
            case "A":
                System.out.println("Apple");
                break;
                case "B":
                System.out.println("Beer");
                break;
            case "C":
                System.out.println("Cider");
                break;
            default: System.out.println("bla bla");

        }
        //SWITCH CONVERTED INTO IF
       // String letter2="x";
       // if (letter2.equals("b")){System.out.println("Beer");}
       // else if (letter2.equals("a")){System.out.println("Apple");}
       // else if (letter2.equals("c")){System.out.println("Cider");}
       // else {System.out.println("bla bla bla");}
        ;
        System.out.println("----------------------------------------");
        System.out.println("WHILE");
        System.out.println("----------------------------------------");
        int x1=0;
        while (x1<25) {
            System.out.println(x1);
            x1++;
        }

      //  int y=0;
       // while (y<25) {
       //     y=y+1;
      //      System.out.println(y);
            //acesta este acelasi lucru cu System.out.println(++y);

      //  }
       // int z=0;
       // while (z<25) {
       //     System.out.println(z);
      //     z=z+1;
            //acesta este acelasi lucru cu System.out.println(z++);

      //  }

        System.out.println("----------------------------------------");
        System.out.println("DO WHILE");
        System.out.println("----------------------------------------");
        int x2=0;
        do{
            System.out.println(x2);
            x2++;
        }while (x2<25);

        System.out.println("----------------------------------------");
        System.out.println("FOR");
        System.out.println("----------------------------------------");
        for (int i=0;i<25;i++){
            System.out.println(i);
        }
        System.out.println("----------------------------------------");
        for (int j=25;j>0;j--){
            if (j==23){continue;} //nu-l afiseaza pe 23
            System.out.println(j);
        }


        System.out.println("----------------------------------------");
        System.out.println("BREAK CONTINUE");
        System.out.println("----------------------------------------");
        int numbers[]={10, 20, 30, 40, 50, 60, 70};
        int sum=0;
        for (int x3: numbers){
            if (x3==30){
                continue;
            }
            sum += x3;
            if (sum>100){
                break;
            }
            System.out.println(x3);
        }
        System.out.println("suma este:" + sum);


    }

}
