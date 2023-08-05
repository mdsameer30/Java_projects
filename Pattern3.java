import java.util.*;
public class Pattern3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to print:  ");
        int n = sc.nextInt();
        //half pyramid
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }   
}
