
public class retcurrobj2{
    String name;
    retcurrobj2(String name){
        this.name=name;
            }
    public void display(){
        System.out.println("Name: "+this.name);
    }

    public static void main(String args[]){
        retcurrobj2 r= new retcurrobj2("dharunpandi");
        r.display();
    }
}