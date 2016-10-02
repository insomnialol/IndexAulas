import java.io.*;
import java.util.*;

public class Tabuada {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        int i;
        for(i=1; i<=10; i++) {
            System.out.println(n+" x "+i+" = "+n*i); // OU TAMBEM System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
            
    }
}