package course.course03_04;

public class Person {
    private String name;
    private int age;
    //private byte age;
    //initial fusese byte am modificat in 3 locuri pt course05

    private String sex;

    private String cnp;
    private boolean hungry;

    //public Person(String name, byte age, String sex, String cnp)
    public Person(String name, int age, String sex, String cnp) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.cnp = cnp;
    }

    public void eat() {
        hungry = false;
    }

    public String getName() {
        return name;
    }
   //public byte getAge()
    public int getAge() {
        return age;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public String getSex() {
        return sex;
    }

    public String getCnp() {
        return cnp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", cnp='" + cnp + '\'' +
                ", hungry=" + hungry +
                '}';
    }
}
