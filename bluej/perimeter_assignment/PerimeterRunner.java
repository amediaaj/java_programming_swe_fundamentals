import edu.duke.*;
import edu.duke.Point;
import java.util.ArrayList;
import java.io.File;

/**
 * Write a description of PerimeterRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PerimeterRunner {
    public double getPerimeter(Shape s) {
        double totalPerim = 0;
        Point prevPt = s.getLastPoint();
        
        for(edu.duke.Point currPt: s.getPoints()) {
            double currDist = prevPt.distance(currPt);
            totalPerim = totalPerim + currDist;
            prevPt = currPt;
        }
        
        return totalPerim; 
    }
    
        public int getNumPoints(Shape s) {
        int count = 0;
        
        for(Point point : s.getPoints()){
            count += 1;
        }
   
        return count;
    }
    
    public double getAverageLength(Shape s) {
        return getPerimeter(s)/getNumPoints(s);
    }
    
    public double getLargestSide(Shape s) {
        return 0.0;
    }
    
    public double getLargestX(Shape s) {
        double currLargest = 0.0;
        for(Point point : s.getPoints()) {
            double x = point.getX();
            if(x > currLargest) {
                currLargest = x;
            }
        }
        
        return currLargest;
    }
    
    public double getLargestLength(Shape s) {
        double currLargest = 0.0;
        Point lastPoint = s.getLastPoint();
        for(Point point : s.getPoints()) {
            double distance = point.distance(lastPoint);
            if(distance > currLargest) {
                currLargest = distance;
            }
        }
        return currLargest;
    }
    
    public double getLargestPerimeter() {
        double currLargest = 0.0;
        DirectoryResource dr = new DirectoryResource();
         for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double perimeter = getPerimeter(s);
            if(perimeter>currLargest) {
                currLargest = perimeter;
            }
         }
         
         return currLargest;
    }
    
    public void test() {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        testPerimeter(s);
        testGetNumPoints(s);
        testGetAverageLength(s);
        testGetLargestX(s);
        testGetLargestLength(s);
        // testGetLargestPerimeter();
    }
    
    private void testPerimeter(Shape s) {
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
    }
    
    private void testGetNumPoints(Shape s) {
        int numPoints = getNumPoints(s);
        System.out.println("number of points = " + numPoints);
    }
    
    private void testGetAverageLength(Shape s) {
        double average = getAverageLength(s);
        System.out.println("average length: " + average);
    }
    
    private void testGetLargestSide(Shape s) {
        double largest = getLargestSide(s);
        System.out.println("largest side: " + largest);
    }
    
    private void testGetLargestX(Shape s) {
        double largestX = getLargestX(s);
        System.out.println("largest x: " + largestX);
    }
    
    private void testGetLargestLength(Shape s) {
        double largestLength = getLargestLength(s);
        System.out.println("largest length: " + largestLength);
    }
    
   public void testGetLargestPerimeter() {
        double largestPerimeter = getLargestPerimeter();
        System.out.println("largest perimeter: " + largestPerimeter);
    }
    
    public static void main (String[] args) {
        PerimeterRunner pr = new PerimeterRunner();
        pr.test();
    }
    
    
    
}
