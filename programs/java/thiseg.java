public class thiseg {
thiseg(){
    System.out.println("Learn Java");
}
thiseg(int a){
    this();
    System.out.println(a);
}
public static void main(String[] args) {
    thiseg r = new thiseg(100);

}}