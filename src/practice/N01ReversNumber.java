package practice;

public class N01ReversNumber {
   public static void main(String[] args) {
     int number=1234;
    int rev=0;
    int rem=0;

    while(number>0){
        rem=number%10;
        rev=rev*10+rem;
        number=number/10;
    }
    System.out.println(rev);
   }
}
