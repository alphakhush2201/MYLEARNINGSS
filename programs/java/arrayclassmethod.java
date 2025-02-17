import java.util.Arrays;
 class t{
   void f(){
    String a[]= {"chemistry","maths","Java","bio"};
    System.out.println("to string:"+ Arrays.toString(a));
    int arr[][]= {{10,20},{30,40}};
    System.out.println("Deep to string:"+ Arrays.deepToString(arr));
   } 
}

class arrayclassmethod extends t {
public static void main(String[] args) {
    arrayclassmethod r = new arrayclassmethod();
    r.f();
}
}
