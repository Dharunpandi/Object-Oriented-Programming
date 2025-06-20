public class poly {
    int age;
    String name;
    Integer salary;  // now nullable

    poly(int age, String name) {
        this.age = age;
        this.name = name;
        this.salary = null;
    }

    poly(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        if (this.salary != null) {
            System.out.println("name: " + name + " age: " + age + " Salary: " + salary);
        } else {
            System.out.println("name: " + name + " age: " + age);
        }
    }

    public static void main(String[] args) {
        poly p = new poly(12, "dharun");
        poly p2 = new poly(12, "dharun", 2000000);
        p.display();
        p2.display();
    }
}
