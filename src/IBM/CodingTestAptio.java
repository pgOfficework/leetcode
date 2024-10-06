package IBM;

// given an array of Points, find the Line which intersects the most points


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Line {
    Point one;
    Point two;
    int m;

    public Line(Point one, Point two){
        this.one=one;
        this.two=two;
        System.out.println(one.toString()+" "+two.toString());
        m=(two.y-one.y)/(two.x-one.x);
    }

    public Point getX() {
        return one;
    }

    public void setX(Point one) {
        this.one = one;
    }

    public Point getB() {
        return two;
    }

    public void setB(Point two) {
        this.two = two;
    }

    @Override
    public String toString() {
        return "Line{" +
                "one=" + one +
                ", two=" + two +
                ", m=" + m +
                '}';
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
}
class Point{
    int x;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class CodingTestAptio {

    // y = mx + b
//       y1 - y2
//. m = ---------
//       x1 - x2




    public static Line interceptTheMostPoints(List<Point> points) {

        List<Line> lines=new ArrayList();

        for (Point point1:points){

            for (Point point2:points){
            //    System.out.println(point1.toString()+" "+point2.toString());
                if (!point1.equals(point2)) {
                    lines.add(new Line(point1, point2));
                }
            }
        }

        for (Line line1:lines){
            for (Line line2:lines){
                if (!line1.equals(line2)){
                    if (line1.one.equals(line2.one) || line1.one.equals(line2.two) || line1.two.equals(line2.one) || line1.two.equals(line2.two)){
                        if (line1.m==line2.m){
                            
                        }
                    }
                }
            }
        }


        System.out.println(lines.size());
        return null;
    }

    public static void main(String[] args) {

        List<Point> list= Arrays.asList(
                new Point(1,3),
                new Point(2,3),
                new Point(4,3),
                new Point(5,5),
                new Point(-2,5)
                );

        Line line = CodingTestAptio.interceptTheMostPoints(list);
        System.out.println(line.one.x+" "+line.one.y);
        System.out.println(line.two.x+" "+line.two.y);


    }


}
