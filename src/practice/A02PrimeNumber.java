//For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
package practice;
class A02PrimeNumber
{
    public static void main(String[] args) {
        
        int num1=12;
        int flag=1;
        int limit;

        if(num1==0 || num1==1){

            if(num1>10){
                limit=10;
            }
            else{
                limit=num1/2;
            }

        for(int i=2; i<=limit;i++){
            if(num1%i==0){
                flag=0;
                System.out.println( num1+" is prime number");
                break;
            }
        }
    }
        if(flag==1){
            System.out.println( num1+" is not prime number");
        }
        
    }
}