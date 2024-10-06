public class Line {
    Point one;
    Point two;
    int m;

    public Line(Point one, Point two){
        this.one=one;
        this.two=two;
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

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
}