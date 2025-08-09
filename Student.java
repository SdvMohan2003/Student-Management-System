package SMS;

public class Student extends Person{

    private int[] marks;

    public Student(String name, int rollNo, int[] marks) {
        super(name, rollNo);
        this.marks = marks.clone(); // Create a copy for encapsulation
    }

    public int calculateTotal() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }

    public double calculateAverage() {
        int total = calculateTotal();
        return (double) total / marks.length;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n=== Student Details ===");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.print("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]);
            if (i < marks.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Total Marks: " + calculateTotal());
        System.out.printf("Average: %.2f\n", calculateAverage());
    }

    public int[] getMarks() {
        return marks.clone();
    }
}
