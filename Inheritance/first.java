
class Animal{
    public void eat(){
        System.out.println("This animal eats food.. ");
    }

}
class dog extends Animal{
    public void bark(){
        System.out.println("The dog barks");
    }
}

public class first{
    public static void main(String args[]){
        dog d=new dog();
        d.eat();
        d.bark();
        }

}