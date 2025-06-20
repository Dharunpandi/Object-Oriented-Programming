
public class copycons{
    int age;
    String name;
    public copycons(int age,String name){
        System.out.println("Original Constructor Called");
        this.age=age;
        this.name=name;
    }
    public copycons(copycons data){
        System.out.println("Copy Constructor Called");
        this.age=data.age;
        this.name=data.name;
    }

    public static void main(String args[]){
        copycons c=new copycons(12,"hanuman");
        copycons c1=new copycons(c);


    }
}