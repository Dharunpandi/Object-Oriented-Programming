public class getcurrins {

    // Method that greets another object
    public void greet(getcurrins values) {
        System.out.println("hello " + values);
    }

    // Method that calls greet on itself
    public void introduce() {
        this.greet(this); // call greet method with current object
    }

    // Optional: override toString() so it prints something meaningful
    @Override
    public String toString() {
        return "I am getcurrins object";
    }

    public static void main(String[] args) {
        getcurrins obj = new getcurrins();
        obj.introduce(); // this will greet itself
    }
}
