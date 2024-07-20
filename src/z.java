import java.util.*;
public class z {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int row=sc.nextInt();
        int i,j;
        for(i=0;i<2;i++){
            for(j=0;j<row;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(i=row;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            int spaces=(row/2);
            for(j=1;j<=spaces;j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }

        for(i=0;i<2;i++){
            for(j=0;j<row;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
