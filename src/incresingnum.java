import java.util.*;
public class incresingnum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int row=sc.nextInt();
        int i,j;
        int number=1;
        for(i=1;i<=row;i++){
            for(j=1;j<=i;j++){
               System.out.print(number+" ");
               number++;

            }
            System.out.println( );
        }
    }
}
