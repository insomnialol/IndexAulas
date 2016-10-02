import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/30-recursion
// FACTORIAL
public class Recursividade2 {

    private static int fatorial(int num) {
         if (num > 1) { return num + fatorial(num-1); }
         else { return num; }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int resultado = fatorial(num);
        System.out.println(resultado);   
    }
}