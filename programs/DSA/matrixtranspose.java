package DSA;

public class matrixtranspose {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}}, 
        res[][]= new int [3][3];
        for (int i = 0 ; i<3;i++){
            for (int j = 0 ; j<3;j++){
                res[i][j]= arr[j][i];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
