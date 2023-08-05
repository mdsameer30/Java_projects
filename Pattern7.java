import java.util.*;
public class Pattern7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to print:  ");
        int n = sc.nextInt();
        
        for(int i=n; i>=1; i--){
            for(int j=i; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

    
}

