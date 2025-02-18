package DSA;

public class SpiralArray {
    public static int[] spiralarray(int arr[][]){
        
        int rows = arr.length;
        int columns = arr[0].length;
        int res[]= new int[rows*columns];
        int sr =0;
        int sc =0;
        int re =rows-1;
        int ce =columns-1;
        int index=0;
        while(sr<=re && sc<=ce){
          //From left to right
          for(int i = sc;i<=ce;i++){
            res[index]=arr[sr][i];
            index++;
          }
          sr++;
          //From Top to bottom
          for(int i = sr;i<=re;i++){
            res[index]=arr[i][ce];
            index++;
          }
          ce--;
          //From Right to left
          for (int i =ce;i>=sc;i--){
            res[index]=arr[re][i];
            index++;
          } 
          re--;
          //From Bottom to top
          for(int i =re;i>=sr;i--){
            res[index]=arr[i][sc];
            index++;
          }
          sc++;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12,},{13,14,15,16}};
        int res[]= spiralarray(arr);
       // for(int a:res){
         //   System.out.println(a+", ");
        //}
        for(int num:res){
          System.out.print(num+", ");
        }
    }
}
