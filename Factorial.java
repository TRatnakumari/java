import java.io.*;
import java.util.*;
public class Factorial{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive integers");
        int n=sc.nextInt();
        int Fact=1;
        for(int i=2;i<n;i++)
        {
            Fact=Fact*i;
        }
        System.out.println("Factorial of "+n+" is "+Fact);
    }
}
    
