import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int row= sc.nextInt();
        int i,j;
        for(i=0;i<=row;i++){
            for(j=i;j>=i;j--){
               System.out.print(j+"*");

            }
            System.out.println();
        }
    }
}