package SMS;

public class ResultCalculator {

    private Student[] students;

    public ResultCalculator(Student[] students) {
        this.students = students;
    }

    public void checkPassFail() {
        System.out.println("\n=== Pass/Fail Results ===");
        for (int i = 0; i < students.length; i++) {
            double average = students[i].calculateAverage();
            System.out.print("Roll No " + students[i].getRollNo() + " (" + students[i].getName() + "): ");
            if (average >= 35) {
                System.out.println("PASS (Average: " + String.format("%.2f", average) + ")");
            } else {
                System.out.println("FAIL (Average: " + String.format("%.2f", average) + ")");
            }
        }
    }

    public void displayAllStudents() {
        System.out.println("\n=== All Student Details ===");
        for (int i = 0; i < students.length; i++) {
            students[i].displayDetails();
        }
    }

    public void displayClassStatistics() {
        if (students.length == 0) return;

        double classTotal = 0;
        int passCount = 0;

        for (int i = 0; i < students.length; i++) {
            classTotal += students[i].calculateAverage();
            if (students[i].calculateAverage() >= 35) {
                passCount++;
            }
        }

        double classAverage = classTotal / students.length;
        double passPercentage = ((double) passCount / students.length) * 100;

        System.out.println("\n=== Class Statistics ===");
        System.out.printf("Class Average: %.2f\n", classAverage);
        System.out.println("Students Passed: " + passCount + "/" + students.length);
        System.out.printf("Pass Percentage: %.2f%%\n", passPercentage);
    }
}
