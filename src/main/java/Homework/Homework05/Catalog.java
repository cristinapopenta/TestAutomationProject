package Homework.Homework05;
/*
*  Sa se implementeze o clasa Catalog care sa permita urmatoarele operatii:
1) Adaugarea unui student (nume, media)
2) Afisarea tuturor studentilor
3) Cautarea unui student dupa nume
4) Stergerea unui student dupa nume
5) Ordonarea studentilor alfabetic dupa nume
6) Ordonarea studentilor dupa medie
* */

import Homework.Homework05.Student;

import java.util.*;
import java.util.jar.JarEntry;
public class Catalog {
    private ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {
        //test to create a student using the class Student in package Homework
        //class is modified with 2 properties for student, name and grade

        Catalog catalog = new Catalog();

        System.out.println("-------------------------------");
        System.out.println("1. Adding students, name and grade ");
        catalog.addStudentsInCatalog(catalog);

        System.out.println("-------------------------------");
        System.out.println("2. List of students: ");
        catalog.displayStudents();

        System.out.println("-------------------------------");
        System.out.println("3. Search student by name: ");
        catalog.findStudentInCatalog(catalog);

        System.out.println("-------------------------------");
        String deleteStudentName="Daniela Georgescu";
        System.out.println("4. Deleting student with name " + deleteStudentName);
        catalog.removeStudentByName(deleteStudentName);

        System.out.println("List of students after removal: ");
        catalog.displayStudents();

        System.out.println("                 ------------------- ");
        String deleteOtherStudentName="Dana Georgescu";
        System.out.println("4. Deleting student with name " + deleteOtherStudentName);
        catalog.removeStudentByName(deleteOtherStudentName);
        System.out.println("List of students after removal: ");
        catalog.displayStudents();

        System.out.println("-------------------------------");
        System.out.println("Adding two more students:  ");

        catalog.addAdditionalStudents(catalog);
        catalog.displayStudents();

        System.out.println("-------------------------------");
        System.out.println("5. Sort by name: ");
        catalog.sortStudentsByName();
        catalog.displayStudents();

        System.out.println("-------------------------------");
        System.out.println("6. Sort by grade: ");
        catalog.sortStudentsByGrade();
        catalog.displayStudents();

    }

    public void addStudentsInCatalog(Catalog catalog){

        Student s1 = new Student("Andrei Popescu", 10);
        catalog.addStudent(s1);
        System.out.print("Added ");
        System.out.println(s1.getStudentName() + " grade " + s1.getStudentGrade());


        Student s2 = new Student("Dana Georgescu", 9);
        catalog.addStudent(s2);
        System.out.print("Added ");
        System.out.println(s2.getStudentName() + " grade " + s2.getStudentGrade());


        Student s3 = new Student("Mihai Dumitrescu", 8);
        catalog.addStudent(s3);
        System.out.print("Added ");
        System.out.println(s3.getStudentName() + " grade " + s3.getStudentGrade());

        Student s4 = new Student("Anca Ionescu", 9.75);
        catalog.addStudent(s4);
        System.out.print("Added ");
        System.out.println(s4.getStudentName() + "grade " + s4.getStudentGrade());
    }

    public void addAdditionalStudents(Catalog catalog){
        Student s5 = new Student("Marius Danielescu", 5.75);
        catalog.addStudent(s5);
        System.out.print("Added ");
        System.out.println(s5.getStudentName() + " grade " + s5.getStudentGrade());

        Student s6 = new Student("Gica Petrescu", 7.30);
        catalog.addStudent(s6);
        System.out.print("Added ");
        System.out.println(s6.getStudentName() + " grade " + s6.getStudentGrade());
    }

    public void findStudentInCatalog(Catalog catalog){
        Student student = new Student("Vasile Ionescu", 8.50);
        System.out.print("Is " + student.getStudentName() + " in the catalog? ");
        catalog.findStudentByName(student.getStudentName());

        System.out.print("Is Andrei Popescu in the catalog? ");
        catalog.findStudentByName("Andrei Popescu");

    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getStudentName().equals(name)) {
                System.out.println("yes");
                return student;
            }
        }
        System.out.println("no");
        return null;
    }

    public void removeStudentByName(String name) {
        Student deleteStudent = findStudentByName(name);
        if (deleteStudent != null) {
            students.remove(deleteStudent);
        }
        else{
            System.out.println("Student "+ name + " is not in catalog");
        }
    }

    public void sortStudentsByName() {
        Collections.sort(
                students,
                new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        return s1.getStudentName().compareTo(s2.getStudentName());
                    }
                }
                );
    }

    public void sortStudentsByGrade() {
        Collections.sort(
                students,
                new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        return Double.compare(s2.getStudentGrade(), s1.getStudentGrade());
                    }
                }
                );
    }
}
