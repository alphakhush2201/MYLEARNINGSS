package DSA;

public class matrixadd {
    public static void main(String[] args) {
    int arr[][] = {{1,2,3,},
                   {4,5,6},
                   {7,8,9}},
        alp[][] = {{9,8,7},
                   {6,5,4},
                   {3,2,1}},
    res[][]= new int [3][3],res2[][]=new int [3][3];
    System.out.println("The addition of the matrix is :");
    for(int i = 0; i<3; i++){
        for(int j = 0 ; j<3; j++){
            res[i][j] = arr[i][j] +alp[i][j];
            System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    System.out.println("The substraction of the matrix is: ");
    for(int i = 0; i<3; i++){
        for(int j = 0 ; j<3; j++){
            res2[i][j] = arr[i][j] -alp[i][j];
            System.out.print(res2[i][j]+" ");
            }
            System.out.println();
        }
        
    }  
}
