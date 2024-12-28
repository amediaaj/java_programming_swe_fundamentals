
/**
 * Write a description of Point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Point {
    private int x;
    private int y;
    public Point(int start_x, int start_y) {
        x = start_x;
        y = start_y;
    }
    
    public int getX() {return x;}
    public int getY() {return y;}
    public double distance(Point otherPt) {
        int dx = x - otherPt.getX();
        int dy = y - otherPt.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);
        System.out.println(p1.distance(p2));
    }
}
