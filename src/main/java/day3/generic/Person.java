package day3.generic;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected Status status;
    protected String someA;


    public Person() {

    }

    public Person(Status status) {
        this.status = status;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Status getStatus() {
        return status;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", status=" + status +
                '}';
    }

    public void someMethod(String someA) {
        this.someA = someA;
        System.out.println(status.name() + " - " + someA);
    }
}
