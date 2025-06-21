// Base Class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// First level of inheritance
class Student extends Person {
    String collegeName;
    String studentId;

    Student(String name, int age, String collegeName, String studentId) {
        super(name, age); // calling Person constructor
        this.collegeName = collegeName;
        this.studentId = studentId;
    }

    void displayStudentDetails() {
        displayInfo();
        System.out.println("College: " + collegeName);
        System.out.println("Student ID: " + studentId);
    }
}

// Second level of inheritance (Multilevel Inheritance)
class EngineeringStudent extends Student {
    String department;
    int year;
    double cgpa;

    EngineeringStudent(String name, int age, String collegeName, String studentId,
                       String department, int year, double cgpa) {
        super(name, age, collegeName, studentId); // calling Student constructor
        this.department = department;
        this.year = year;
        this.cgpa = cgpa;
    }

    void displayEngineeringDetails() {
        displayStudentDetails();
        System.out.println("Department: " + department);
        System.out.println("Year: " + year);
        System.out.println("CGPA: " + cgpa);
    }
}

// Main Class to run
public class multiple {
    public static void main(String[] args) {
        EngineeringStudent engStudent = new EngineeringStudent(
            "Dharun", 21, "NIT Trichy", "STU123", "Computer Science", 3, 8.9
        );

        engStudent.displayEngineeringDetails();
        engStudent.displayInfo();
        
    }
}
