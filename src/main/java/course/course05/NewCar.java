package course.course05;

abstract public class NewCar implements Engine{
    //mostenete metodele abstracte din Engine
    //intr-o clasa abstracta tre cel putin o met abstracta si una implementata
    //interfata: totul public; clasa abstracta: pot pune modificatori de acces altii decat public
    //interfata nu implementeaza nik
    //intr-o clasa normala: clasa abstracta o mostenesc = extend; interfata o implementez
    //o proprietate adaugata intro interfata - nu se recomanda - by default devine const;
    // intr-o clasa absracta o proprietate poate fi schimbata in clasa respectiva

    protected void start()
    {
        System.out.println("Car start Engine");
    }
    public abstract void stop(String time);


}
