import java.util.*;
public class Pattern1 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int r = sc.nextInt();
    System.out.print("Enter number of columns: ");
    int c = sc.nextInt();
//solid rectangle
    for(int i=1; i<=r; i++){
        for(int j=1; j<=c; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    }
    
}