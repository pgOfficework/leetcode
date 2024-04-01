package practice;

//Given, N=80 then N+1 will be 80+1=81, 
//which is a perfect square of the number 9. Hence 80 is a sunny number.
public class N05SunnyNumber {
    public static void main(String[] args) {
        int number = 80;
        int num = number;

        if (Math.sqrt(num + 1) - Math.floor(Math.sqrt(num + 1)) == 0) {
            System.out.println("Sunny Number");
        } else {
            System.out.println("Not Sunny Number");
        }

    }
}
