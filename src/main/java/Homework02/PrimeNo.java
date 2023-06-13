package Homework02;

public class PrimeNo {
    //voi folosi o functie booleana care sa-mi intoarca true sau false,
    // unde fac testul pentru a verifica daca un nr oarecare x e prim
    // acea functie o voi folosi in main ca sa testez intr-o bucla toate nr pana la 1000000
    // fct booleana o pun private ca o folosesc doar in clasa
    private static boolean isPrimeNo(int x){
        if (x==2) {
            return true;
        }

        float rad = (float) Math.sqrt((float) x);
        int limit = Math.round(rad);

        for (int i = 2; i <=limit; i++) {
            if (x % i == 0) {
                return false;//cu return iese deja din functie, nu mai e nevoie de break
            }
        }
        return true;
    }

    public static void main(String[] args){
        int i=2;
        while (i<=1000000){
            if (isPrimeNo(i)) {
                System.out.println(i + " is prime number");
            }
            i++;
        }

    }

}
