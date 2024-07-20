import java.util.*;
public class triangle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int row=sc.nextInt();
        int i,j,k;
        for(i=1;i<=row;i++){
            for(j=2;j>=1;j--){

                if(j<=row-1){
                    System.out.print(j);
                }else{
                    System.out.print("*");
                }
            }

            System.out.println(  );
        }
    }
}
