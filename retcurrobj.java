
public class  retcurrobj{
    String name;
    public retcurrobj setname(String name){
        this.name=name;
        return this;
    }
    public  void display(){
        System.out.println("hello "+name);
    }
    public static void main(String args[]){
        retcurrobj r=new retcurrobj();
        r.setname("Dharun").display();//Chaining the Methods
        }
}