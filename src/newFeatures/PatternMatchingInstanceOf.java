package newFeatures;

public class PatternMatchingInstanceOf {
    public static void main(String[] args) {
        Object obj="a";


        //old
        if (obj instanceof String){
            String str=(String) obj;
            System.out.println("string");
        }

        //new extended
        if (obj instanceof String str)
            System.out.println("new string");
    }
}
