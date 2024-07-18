import java.util.Scanner;

public class Kpattern {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number");
        int row=sc.nextInt();
        int i,j;
        for(i=row;i>=1;i--) {
            for (j = i; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
        for(i=2;i<=row;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }

