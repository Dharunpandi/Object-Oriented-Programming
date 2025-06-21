// Parent class
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayBasicInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Base Salary: " + salary);
    }

    double calculateAnnualSalary() {
        return salary * 12;
    }
}

// First Child Class
class Manager extends Employee {
    int teamSize;
    double bonus;

    Manager(String name, int id, double salary, int teamSize, double bonus) {
        super(name, id, salary);
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    void displayManagerDetails() {
        displayBasicInfo();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Annual Salary (with Bonus): " + (calculateAnnualSalary() + bonus));
    }
}

// Second Child Class
class Developer extends Employee {
    String techStack;
    int projects;

    Developer(String name, int id, double salary, String techStack, int projects) {
        super(name, id, salary);
        this.techStack = techStack;
        this.projects = projects;
    }

    void displayDeveloperDetails() {
        displayBasicInfo();
        System.out.println("Tech Stack: " + techStack);
        System.out.println("Projects Assigned: " + projects);
        System.out.println("Total Annual Salary: " + calculateAnnualSalary());
    }
}

// Third Child Class
class Designer extends Employee {
    String designTool;
    boolean isFreelancer;

    Designer(String name, int id, double salary, String designTool, boolean isFreelancer) {
        super(name, id, salary);
        this.designTool = designTool;
        this.isFreelancer = isFreelancer;
    }

    void displayDesignerDetails() {
        displayBasicInfo();
        System.out.println("Design Tool: " + designTool);
        System.out.println("Freelancer: " + (isFreelancer ? "Yes" : "No"));
        System.out.println("Total Annual Salary: " + calculateAnnualSalary());
    }
}

// Main class
public class heirachial {
    public static void main(String[] args) {
        Manager mgr = new Manager("Ravi", 101, 90000, 10, 50000);
        Developer dev = new Developer("Sneha", 102, 80000, "Java, Spring Boot", 3);
        Designer des = new Designer("Arun", 103, 70000, "Figma", true);

        System.out.println("---- Manager Details ----");
        mgr.displayManagerDetails();

        System.out.println("\n---- Developer Details ----");
        dev.displayDeveloperDetails();

        System.out.println("\n---- Designer Details ----");
        des.displayDesignerDetails();
    }
}
