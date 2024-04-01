package practice;

public class TimeCorrection {

    public static void main(String[] args) {
        double time1 = 0.0825;

        double min = (time1 - (int) time1) * 60;
        int sec = (int) (60 * (min - (int) min));

        System.out.println((int) time1 + " hour " + (int) min + " min " + sec + " sec");

    }

}
