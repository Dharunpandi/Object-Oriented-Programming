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

public class arraypoly{
    public static void main(String args[]){
       animal[] ani={new dog(),new cat()};
       for(animal a : ani){
        a.sound();

       }
    }
}