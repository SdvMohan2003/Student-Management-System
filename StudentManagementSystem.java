package SMS;

public class StudentManagementSystem {

    public static void main(String[] args) {

        int[] marks1 = {85, 78, 92, 88, 76};
        Student student1 = new Student("Alice Johnson", 101, marks1);

        int[] marks2 = {45, 52, 48, 38, 42};
        Student student2 = new Student("Bob Smith", 102, marks2);

        int[] marks3 = {25, 30, 28, 32, 20};
        Student student3 = new Student("Charlie Brown", 103, marks3);

        int[] marks4 = {95, 88, 92, 85, 90};
        Student student4 = new Student("Diana Prince", 104, marks4);

        Student[] students = {student1, student2, student3, student4};

        ResultCalculator calculator = new ResultCalculator(students);

        System.out.println("STUDENT MANAGEMENT SYSTEM SIMULATION");
        System.out.println("=====================================");

        calculator.displayAllStudents();

        calculator.checkPassFail();

        calculator.displayClassStatistics();

        System.out.println("\n=== Individual Student Information ===");

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Name: " + s.getName());
            System.out.println("Roll No: " + s.getRollNo());
            System.out.println("Total: " + s.calculateTotal());
            System.out.printf("Average: %.2f\n", s.calculateAverage());
            System.out.println("Result: " + (s.calculateAverage() >= 35 ? "PASS" : "FAIL"));
        }

        System.out.println("\n=== Program Completed Successfully ===");
    }
}
