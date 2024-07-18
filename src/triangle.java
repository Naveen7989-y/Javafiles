import java.util.*;
public class triangle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int row=sc.nextInt();
        int i,j,k;
        for(i=row;i>=1;i--){
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            for(k=1;k<=row;k++){
                System.out.print(k);
            }
            System.out.println(  );
        }
    }
}
