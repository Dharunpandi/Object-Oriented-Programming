
public class refinstvar{
    int age;
    String name;
    refinstvar(){
        this(12,"dharun");
    }
    refinstvar(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void display(){
        System.out.println(age);
        System.out.println(name);
    }
    public static void main(String args[]){
        refinstvar r=new refinstvar();
        r.display();
    }
}