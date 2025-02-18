public class staticclass{
    int a = 10;
    static int b= 20;
    public static void main(String[] args) {
        staticclass r = new staticclass();
        r.disp();
        staticclass.show();
    }
    static void show(){
        System.out.println("show():"+b);
    }
    void disp(){
        System.out.println("Disp():"+ a +" "+b);
    }
    }
