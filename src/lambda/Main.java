package lambda;
interface StringFunction {
  String run(String str1, String str2);
}

public class Main {
  public static void main(String[] args) {
    StringFunction exclaim = (s1,s2) -> s1 + s2;
    StringFunction ask = (s1,s2) -> s1 + s2;
    
    printFormatted("Hello","Java", exclaim);
    printFormatted("Hello","Scala", ask);
  }
  public static void printFormatted(String str1,String str2, StringFunction format) {
    String result = format.run(str1,str2);
    System.out.println(result);
  }
}