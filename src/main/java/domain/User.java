package domain;

/**
 * Created by Jean-Paul D on 2017-03-19.

 */


public class User {

    private String name;
    private int age;
    private float salary;
    private boolean married;

    public User(){}

    public User(String name, int age, float salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public float getSalary() {
        return salary;
    }

    public boolean isMarried() {
        return married;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
