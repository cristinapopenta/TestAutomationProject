package Homework.Homework05;

public class Dog {
    private String dogName;
    private String dogBreed;
    private String dogSex;
    private int dogAge;

    public Dog(String dogName, String dogBreed, String digSex, int dogAge) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.dogSex = digSex;
        this.dogAge = dogAge;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public String getDogSex() {
        return dogSex;
    }

    public int getDogAge() {
        return dogAge;
    }

    @Override
    public String toString() {
        return "The " + dogSex + " dog with name '" + dogName + '\'' + " and with breed '" + dogBreed + '\'' +
                " that is " + dogAge + " year(s) old ";
    }
}

