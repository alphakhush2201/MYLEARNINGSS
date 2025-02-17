abstract class animal{
    public abstract void sound();
}
class dog extends animal{
    public void sound(){
        System.out.println("the dog barks");
    }
}
class lion extends animal{
    public void sound(){
        System.out.println("the Lion roars");
    }
}
public class abstractclass {
    public static void main(String[] args) {
        dog d = new dog();
        lion l = new lion();
        d.sound();
        l.sound();
    }
    
}
