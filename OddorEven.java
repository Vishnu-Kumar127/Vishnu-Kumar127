package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 21cse097
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int i;
    int a[]=new int[5];
    Scanner obj=new Scanner(System.in);
    System.out.println("enter elements");
    for(i=0;i<a.length;i++)
    {
        a[i]=obj.nextInt();
        if(a[i]%2==0)
        {
            System.out.println("even number");
        }
        else{
            System.out.println("odd numbers");
        }
           
    }
    
    

    }
}