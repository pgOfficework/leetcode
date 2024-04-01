//For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
//It can also be a string like LOL, MADAM etc.

package practice;

public class A03Palindrome{
    public static void main(String[] args) {
        int input=121;
        int rem=0;
        int rev=0;
        int num=input;

        while (num>0) {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        if(input==rev){
        System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }

        // String str="121232121";
        // int flag=0;
        // char[] c=str.toCharArray();
        // int length=c.length-1;
        // System.out.println(length);

        // for (int i = 0; i < length/2; i++) {
        //     if(c[i]!=c[length-i]){
        //         flag=1;
        //         System.out.println("Not palindrom");
        //         break;
        //     }
        // }
        // if(flag==0){
        // System.out.println("Palindrom");
        // }
    }
}
