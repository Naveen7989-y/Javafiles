import java.util.*;
public class butterfly {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number for rows");
        int row=sc.nextInt();
        int i,j;
        for(i=0;i<=row;i++){
            for(j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            int spaces=2*(row-i);
            for(j=0;j<=spaces;j++){
                System.out.print(" "+" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(i=row;i>=0;i--){
            for(j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            int spaces=2*(row-i);
            for(j=0;j<=spaces;j++){
                System.out.print(" "+" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

}
