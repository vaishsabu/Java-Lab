/*
Author: 20BCE2230
Date: 19-Jan-2022
Description: IN pattern printing
*/
import java.util.Scanner;

public class Activity1
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         int row = sc.nextInt();
         if (row>2)
         {
        // printing pattern with *  
            char in = '*';
             for(int i=0;i<row;i++)
             {
                 System.out.print(in+" "+in);
                 if(i==0||i==row-1)
                  for(int j=0;j<row-2;j++)
                       System.out.print(" ");
                 else
                 {
                    for(int j=1;j<=row-2;j++)
                        if(i==j)
                          System.out.print(in);
                        else 
                          System.out.print(" ");
                 }
                System.out.print(in);
                System.out.println();
             }
           
        // printing pattern with flag Emoji
           System.out.println();
           String flagIn ="\uD83C\uDDEE \uD83C\uDDF3";
            for(int i=0;i<row;i++)
             {
                 System.out.print(flagIn+" "+flagIn);
                 if(i==0||i==row-1)
                  for(int j=0;j<=row-2;j++)
                       System.out.print(" ");
                 else
                 {
                    for(int j=0;j<=row-2;j++)
                        if(i==j)
                          System.out.print(flagIn);
                        else 
                          System.out.print(" ");
                 }
                System.out.print(flagIn);
                System.out.println();
             } 
         }
         else 
          System.out.println("Minimum 3 rows needed");
     }
}
