interface printable{
    void print();
}
class a1 implements printable{
    public void print(){
        System.out.print("Nice ");
    }
}
class a2 implements printable{
    public void print(){
        System.out.println("person");
    }
}
public class interfce {
    public static void main(String[] args) {
        printable a1 = new a1();
        printable a2 = new a2();
        a1.print();
        a2.print();
    }

}
