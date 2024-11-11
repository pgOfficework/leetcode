package string;

import java.io.*;
import java.util.*;

public class StringProblem1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        //sum of length
        int lengthSum;
        
        if(A.equals(null))
            lengthSum= B.length();
        else if(B.equals(null))
            lengthSum=A.length();
        else 
            lengthSum=A.length()+B.length();
            
        System.out.println(lengthSum);
        
        //Determine if  is lexicographically larger than  (i.e.: does B come before A in the dictionary?)

        
        int i=0;
        boolean flag=true;
        
        while (i<A.length() && i<B.length()) {

            if(A.charAt(i)==B.charAt(i))
                {
                    i++;
                }
            else if(A.charAt(i)<B.charAt(i)) {
                System.out.println( A.charAt(i)+" "+B.charAt(i));
                flag = true;
                break;
            }
            else {
                flag=false;
                break;
            }

        }



        System.out.println(flag?"No":"Yes");
        
        //Capitalize the first letter in  and  and print them on a single line, separated by a space.
        System.out.println(
                A.substring(0,1).toUpperCase()+A.substring(1)+" "
                + B.substring(0,1).toUpperCase()+B.substring(1)
        );
        
    }

}



