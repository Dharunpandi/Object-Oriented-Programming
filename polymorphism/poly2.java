
class generalint {
    public double intrestrate() {
        return 0.0;
    }

}

class HDFC extends generalint{
    @Override
    public double intrestrate(){
        return 8.9;
    }
}
 
class SBI extends generalint{
    @Override
    public double intrestrate(){
        return 6.7;
    }
}

public class poly2{
    public static void main(String args[]){
        generalint g;
        g=new HDFC();
        System.out.println("Intrest Rate of HDFC: "+g.intrestrate());
        g=new SBI();
        System.out.println("Interest Rate of SBI: "+g.intrestrate());
    }
}
