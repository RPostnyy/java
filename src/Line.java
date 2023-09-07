public class Line {
    Point start, end;

    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return  ("Линия от точки "+start + " до "+ " "+end);
    }
    public double Length(){
        int side1 = start.getX() - end.getX();
        int side2 = start.getY() - end.getY();

        return Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2));
    }
}
