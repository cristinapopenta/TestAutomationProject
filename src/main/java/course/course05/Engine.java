package course.course05;

public interface Engine {
    //in interfata doar imi definesc metodele; interfata nu implementeaza body
    //interfetele le folosesc pt a compensa imposibilitatea folosirii multiple
    //prin interfata se denumeste definitia metodei - fara body
    //metodele, interfata trebuie sa fie publice;
    //declararea unei variabile in interfara are by default final, pt ca nu pot modifica nimic
    //interfata = blue print a ceea ce vreau sa implementez;; te asiguri ca anumite metode sunt 100% implemntate; pot fi si alte met
    /*final*/double MAX_CAPACITY =3000; //n-o voi putea mosteni;
    /*public*/ void engineOn(); //e public oricum
    /*public*/ void engineOff();

}
