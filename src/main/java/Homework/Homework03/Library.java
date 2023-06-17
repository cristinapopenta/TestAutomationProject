package Homework.Homework03;

public class Library {
    public static void main(String[] args){
        Author myAuthor = new Author("Mircea Cartarescu", "mircea.cartarescu@library.ro");
        Book myBook = new Book("O seara la opera",2009, myAuthor, 35.00);

        System.out.println();
        System.out.println("Autorul " + myAuthor.getName() + " are emailul " + myAuthor.getEmail());
        System.out.println();

        System.out.println("Cartea cu numele: <<"+ myBook.getName() + ">> scrisa in anul " + myBook.getYear()
                + " de " + myBook.getAuthor().getName() + " costa " + myBook.getPrice() +" RON" );
        System.out.println("----------------------------");
        myBookDetails(args[0],Integer.parseInt(args[1]),args[2],Integer.parseInt(args[3]));
    }
    private static void myBookDetails(String name, int year, String authorName, double price){

        //aici am intampinat 2 probleme:
        //1. nu am putut da in linia de argumente un obiect de tip Author
        //asa ca am pus la parametrii metodei un string pentru numele autorului
        //2. numele l-am scris legat tot din motiv de parametri in linia de comanda
        System.out.println();
        System.out.println("Metoda care preia parametri din linia de argumente:");
        System.out.println();

        System.out.println("Cartea cu numele: <<"+ name + ">> scrisa in anul " + year
                + " de " + authorName + " costa " + price +" RON" );
        //va prelua parametri din linia de argumente;
    }
}
