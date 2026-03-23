import java.util.Scanner;
public class forloop 
{
    public static void main(String[]args)
    {
    int n = 1;
    for(int row = 4; row >= n; row--)
    {
        for(int col = 1; col <= row; col++)
        {
        System.out.print("*");
        }
        System.out.println("");
    }
    
    }
}