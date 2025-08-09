package SMS;

abstract class Person {

    protected String name;
    protected int rollNo;

    public Person(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public abstract void displayDetails();
}
