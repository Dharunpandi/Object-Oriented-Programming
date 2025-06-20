
public class defcons{
    int no;
    String name;
    public defcons(int no,String name){
        this.no=no;
        this.name=name;
    }
    public void show(){
        System.out.println(no);
        System.out.println(name);
    }

    public static void main(String args[]){
        defcons a =new defcons(12,"hanuman");
        a.show();
    }
}