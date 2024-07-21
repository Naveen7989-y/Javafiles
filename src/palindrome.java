import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int row= sc.nextInt();
        int i,j;
        for(i=1;i<=row;i++){
            for(j=1;j<=2*(row-i);j++){
               System.out.print(" ");
            }
            for(j=i;j>=1;j--) {
                System.out.print(j+" ");
            }
            for(j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}