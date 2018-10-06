import java.util.Scanner;
public class Evenodd
{ 
    public static void main(String[] args) 
    { 
    int x; 
     Scanner v = new Scanner(System.in);   
        x = v.nextInt();
        if (x % 2 == 0)
            System.out.print("Even"); 
        else
            System.out.print("Odd"); 
    } 
} 
