 class animal{
    public void sound(){
        System.out.println("some generic animal sound");
    }
}
 class dog extends animal{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }

}
class cat extends animal{
    @Override
    public void sound(){
        System.out.println("Cat Meow");
    }
}

public class poly1{
    public static void main(String args[]){
        animal a;
        a=new dog();
        a.sound();
        a=new cat();
        a.sound();

    }
}