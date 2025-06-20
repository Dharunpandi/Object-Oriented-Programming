
public class getcurrins{
    public void greet(getcurrins value){
        System.out.println("hello "+value);
    }
    public void introduce(){
         greet(this);
    }
    @Override
    public String toString(){
        return "getcurrins Instance";
    }
    public static void main(String args[]){
        getcurrins g=new getcurrins();
        g.introduce();
    }
}