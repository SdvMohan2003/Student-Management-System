Student Management System
A comprehensive Java-based Student Management System demonstrating Object-Oriented Programming concepts including inheritance, encapsulation, polymorphism, and abstraction.
📋 Features

Student Information Management: Store and manage student details including name, roll number, and marks
Grade Calculation: Automatic calculation of total marks and averages
Pass/Fail Determination: Evaluate student performance based on average marks (≥35% to pass)
Class Statistics: Generate class-wide statistics including pass rates and averages
Object-Oriented Design: Implements inheritance, encapsulation, polymorphism, and abstraction

🏗️ Project Structure
StudentManagementSystem/
├── src/
│   └── SMS/
│       ├── Person.java              # Abstract base class
│       ├── Student.java             # Student class extending Person
│       ├── ResultCalculator.java    # Result processing class
│       └── StudentManagementSystem.java  # Main class
├── .gitignore
└── README.md
📚 Classes Overview
1. Person (Abstract Class)

Variables: name, rollNo
Methods: Abstract displayDetails()
Purpose: Base class for inheritance

2. Student Class

Extends: Person
Features:

Encapsulated marks array
Total and average calculation methods
Overridden display method


Key Methods:

calculateTotal(): Sum all subject marks
calculateAverage(): Calculate percentage
displayDetails(): Show complete student info



3. ResultCalculator Class

Purpose: Process multiple students
Features:

Pass/fail evaluation (35% threshold)
Class statistics generation
Polymorphic method calls


Key Methods:

checkPassFail(): Evaluate all students
displayAllStudents(): Show detailed reports
displayClassStatistics(): Class-wide metrics



4. StudentManagementSystem (Main Class)

Purpose: Demonstration and testing
Features: Creates sample students and showcases all functionality

🚀 How to Run

Compile the Java files:
bashjavac src/SMS/*.java

Run the main class:
bashjava src.SMS.StudentManagementSystem


💡 OOP Concepts Demonstrated

🔒 Encapsulation: Private marks array with controlled access
🏗️ Inheritance: Student extends Person class
🎭 Polymorphism: Overridden displayDetails() method
🎨 Abstraction: Abstract Person class with abstract methods

📊 Sample Output
STUDENT MANAGEMENT SYSTEM SIMULATION
=====================================

=== All Student Details ===
Name: Alice Johnson
Roll Number: 101
Marks: 85, 78, 92, 88, 76
Total Marks: 419
Average: 83.80

=== Pass/Fail Results ===
Roll No 101 (Alice Johnson): PASS (Average: 83.80)
Roll No 102 (Bob Smith): PASS (Average: 45.00)
Roll No 103 (Charlie Brown): FAIL (Average: 27.00)

=== Class Statistics ===
Class Average: 65.27
Students Passed: 3/4
Pass Percentage: 75.00%
🛠️ Technical Requirements

Java Version: Java 8 or higher
IDE: Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)
Compilation: Standard javac compiler

📝 Assignment Requirements Fulfilled
✅ Abstract class Person with name, rollNo, and abstract displayDetails()
✅ Student class with encapsulated marks array
✅ Methods using loops and operators for calculations
✅ Overridden displayDetails() method
✅ ResultCalculator class accepting Student array
✅ Pass/fail logic using conditional statements
✅ Polymorphism through inheritance
✅ Main method with multiple Student objects
👨‍💻 Author
SdvMohan2003
Computer Science Student
📄 License
This project is created for educational purposes as part of Object-Oriented Programming coursework.

⭐ Star this repository if you found it helpful!
