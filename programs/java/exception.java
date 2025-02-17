public class exception{
    public static void main(String[] args) {
        System.out.println("main fxn started");
        int a = 10 ,b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e ){
            System.out.println("cant be divided by zero");
        }
        
        System.out.println("main fxn ended");
    }
}