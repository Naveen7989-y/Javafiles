import java.util.*;
public class trianglenum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int row=sc.nextInt();
        int i,j;
        for(i=row;i>=1;i--){
            for(j=i;j>=1;j--){
                for(j=i;j>=1;j--){
                    for(;j==i;){
                        System.out.print(j);
                    }
                        System.out.print(" ");

                }

            }
            System.out.println( );
        }
    }
}
