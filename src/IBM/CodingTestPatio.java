package IBM;

// given an array of Points, find the Line which intersects the most points

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;

class Line {
    Point one;
    Point two;
    float m;
    double l;

    public Line(Point one, Point two) {
        this.one = one;
        this.two = two;

        if (one.getX() == two.getX()){
            // Handle vertical line case
            m= Float.POSITIVE_INFINITY;
        } else {
            m = (float) (two.y - one.y) / (two.x - one.x);
        }

        l = calculateDistance(one, two);
    }

    public static double calculateDistance(Point p1, Point p2) {
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point getA() {
        return one;
    }

    public double getL() {
        return l;
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
                ", l=" + l +
                '}';
    }

    public float getM() {
        return m;
    }
}

class Point {
    int x;

    @Override
    public String toString() {
        return "{" +
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

public class CodingTestPatio {
    static Line maxPointIntersectByLine = null;
    static int count = 0;
    static int tempCount = 0;

    public static void interceptTheMostPoints(Set<Point> points) {

        Set<Line> lines = new HashSet<>();

        System.out.println("all : " + points);

        //putting line in set
        for (Point point1 : points) {
            points.remove(point1);
            for (Point point2 : points) {
                if (maxPointIntersectByLine==null){
                    maxPointIntersectByLine=new Line(point1, point2);
                }
                lines.add(new Line(point1, point2));
            }
        }

        //grouping line as key is slope and value is list of lines
        Map<Float, List<Line>> collectBySlop = lines.stream()
                .collect(Collectors.groupingBy(Line::getM));



        //iterate map
        for (Map.Entry<Float, List<Line>> bySlope : collectBySlop.entrySet()) {

            if (bySlope.getValue().size() > 1) {
                List<Line> lineSet = new CopyOnWriteArrayList<>(bySlope.getValue());

                for (Line line1 : lineSet) {
                    tempCount = 0;
                    lineSet.remove(line1);
                    for (Line line2 : lineSet) {
                        lineSet.remove(line2);
                        line1 = ifCommonPointThenLine(line1, line2);

                        if (tempCount >= count) {
                            count = tempCount;

                            if (maxPointIntersectByLine.getL()<line1.getL())
                                maxPointIntersectByLine = line1;
                        }
                    }
                }
            }
        }
    }

    private static Line ifCommonPointThenLine(Line line1, Line line2) {
        Set<Point> tempSet = new LinkedHashSet<>();
        tempSet.add(line1.getA());
        tempSet.add(line1.getB());

        Line temp = null;

        if (tempSet.contains(line2.getA())) {
            tempCount++;
            tempSet.remove(line2.getA());
            tempSet.add(line2.getB());
            temp = createLine(new ArrayList<>(tempSet));
        } else if (tempSet.contains(line2.getB())) {
            tempCount++;
            tempSet.remove(line2.getB());
            tempSet.add(line2.getA());
            temp = createLine(new ArrayList<>(tempSet));
        }

        if (temp != null && temp.getL() > line1.getL() && temp.getM() == line1.getM()) {
            return temp;
        } else
            return line1;
    }

    public static Line createLine(List<Point> set) {
        return new Line(set.get(0), set.get(1));
    }

    public static void main(String[] args) {

        Set<Point> set = new CopyOnWriteArraySet<>(Arrays.asList(
                new Point(1, 3),
                new Point(2, 3),
                new Point(4, 3),
                new Point(5, 5),
                new Point(-2, 5),
                new Point(1, 2),
                new Point(5, 2),
                new Point(7, 4)
        ));

        CodingTestPatio.interceptTheMostPoints(set);

        System.out.println("result : " + " no of points-" + count + " --- " + maxPointIntersectByLine);

    }


}
