package Homework02;

public class Prime {
    public static void main(String[] args){
        //aici am cautat numerele prime si afisat doar in main

        System.out.println("-----------------------------------");

        int number=2;
        boolean isPrim=true;
        System.out.println(number +" "+ isPrim);
        //il afisez pe 2 care e singurul numar prim si par, cele de la 3 in sus le tratez separat
        number=3;
        while (number<1000000) {

            isPrim = true; //presupun ca numarul este prim; daca gasesc un divizor, schimb valoarea lui boolean
            float rad = (float) Math.sqrt((float) number); //scot radicalul din nr meu
            int limit = Math.round(rad);
            //extrag partea intreaga si merg cu testele de divizibilitate doar pana acolo,
            //ca oricum numere mai mari care sa fie divizori nu voi gasi
            //pot merge in for pana la numar-1, dar vor fi doar verificari inutile
            //de ex ca sa il testez pe 17, incerc divizori doar pana la 4, ca sa il testez pe 39, pana la 6...

            //System.out.println(limit); //test suplimentar ca sa vad pana unde ma duc cu posibilii divizori

            for (int i = 2; i <=limit; i++) {
                if (number % i == 0) {
                    isPrim = false;
                }
            }
            if (isPrim) {
                    System.out.println(number + " " + isPrim);
                }

            number++;
        } //end while

    }
}
