import java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[][];
        int arr2[][];
        int arr3[][];
        System.out.println("enter no of rows and cols");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        System.out.println("enter no of rows and cols");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        if(row1==row2&&col1==col2){
            System.out.println("Addition is possible");
        arr1 = new int[row1][col1];
        arr2 = new int[row2][col2];
        arr3 = new int[row1][col2];
        System.out.println("enter elements of matrix 1");

                  for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    System.out.print(arr1[i][j]+" ");

                }
                System.out.println();
            }
            System.out.println();
            System.out.println("enter the elements of the array 2");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(arr2[i][j]+" ");

                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                    System.out.print(arr3[i][j]+"  ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Additon is not possible");
        }
        System.out.println();

    }
}
