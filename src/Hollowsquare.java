import java.util.*;
public class Hollowsquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int row=sc.nextInt();
        int i,j;
        for(i=0;i<=row;i++){
            for(j=0;j<=row;j++){
                if(i==0 || j==0 || i==row || j==row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
