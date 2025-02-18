class A extends Thread{
    public void run(){
        for(int i = 1; i<=5;i++){
            System.out.println("Khush");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }
}
public class multithreading {
 public static void main(String[] args) {
    A t = new A();
    t.start();
    for (int i =1;i<=5;i++){
        System.out.println("Dush");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
 }
}
