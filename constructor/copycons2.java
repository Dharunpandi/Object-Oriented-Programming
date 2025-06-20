import java.util.*;

public class copycons2{

    int age;
    String name;
    public copycons2(int age,String name){
        this.age=age;
        this.name=name;
    }
    public copycons2(copycons2 value){
        this.age=value.age;
        this.name=value.name;
    }
    public void display(){
        System.out.println("Age: "+age+" Name: "+name);
    }
    public void modify(int age,String name){
        this.age=age;
        this.name=name;
    }
    public static void main(String args[]){
        copycons2 c=new copycons2(20,"Dharun");
        copycons2 c1=new copycons2(c);
        System.out.println("Value of Real and Copy Constructor Before Modification: ");
        c.display();
        c1.display();
        System.out.println("Values After Modifiying Copy Constructor: ");
        c1.modify(20,"Ram");
        c.display();
        c1.display();

    }
}