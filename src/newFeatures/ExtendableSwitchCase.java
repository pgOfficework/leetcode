package newFeatures;

public class ExtendableSwitchCase {
    public static void main(String[] args) {
        int dayOfWeek=7;

        String dayType=switch (dayOfWeek){
            case 1,2,3,4,5->"Weekday";
            case 6,7->"Weekend";
            default -> "Invalid day";
        };

        System.out.println(dayType);
    }
}
