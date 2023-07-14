package Homework.Homework05;

//import course.course03_04.Person;

public class Student {

    private String studentName;
    private double studentGrade;


    public Student(String studentName, double studentGrade) {
        //super(name, age, sex, cnp);
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudentGrade() {
        return studentGrade;
    }


    @Override
    public String toString() {
        return "Student with name ='" + studentName + '\'' +
                " has grade = " + studentGrade;
    }

    public void setStudentName(String name) {
        this.studentName=name;
    }

    public void getStudentGrade(double otherNameGrade) {
        this.studentGrade=otherNameGrade;
    }
}