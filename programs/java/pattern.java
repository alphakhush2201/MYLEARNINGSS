/*pattern printing 
 * 
   *
     *
   *
* 
   *
      *
   *
*
 */

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        boolean temp= true;
        for(int i =0;i<=num;i++){
          if(i%3==0){
            if(temp==false){
              temp = true;
            }
            else{
              temp =true;
            }

          }
          if(temp==true){
          System.out.print(*);
            
          }
          else{
          
          }

        }
        
    }
}