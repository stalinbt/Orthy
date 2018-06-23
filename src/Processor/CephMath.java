package Processor;

import utilities.objects.Vector;
import utilities.VectorMath;
import java.awt.Point;
import static utilities.VectorMath.dotProduct;

/**
 * Handles the canvas
 * Contains methods appropriate for this canvas
 * Contains all the methods necessary for drawing on the canvas like points, lines, text,
 *      
 * @author stali
 */
public final class CephMath 

{
    private final static CephMath cephCalculator = new CephMath();
    private CephMath(){};
    public static CephMath getInstance(){
        return cephCalculator;
    } 
    public static Double getLineLength(Point p1, Point p2){
        double dX = p1.x - p2.x;
        double dY = p1.y - p2.y;
        //Pythagorean theorem, which states that the square of the hypotenuse is equal to the added squares of the other two sides
        //So here, we add the squares of the sides of the imaginary triangle and end up with the square of the imaginary hypotenuse
        //Then we just square-root this number and we have the imaginary hypotenuse length, that is, the length of the line between the two points
        //Return a value in pixels
        return Math.sqrt(dX * dX + dY * dY);
    }
    public static Double GetAngleOfLineBetweenTwoPoints(Point.Double p1, Point.Double p2) {
        double xDiff = p2.x - p1.x;
        double yDiff = p2.y - p1.y;
        return Math.toDegrees(Math.atan2(yDiff, xDiff));
    }
    public static Double getAngleBetweenThreePoints(Point p1, Point center, Point p3){
        /*
        convert the lines to vectors. The first line is (p1,center)
        the second line is (center, p2)
        After this find the length of each line
        Calculate the dotProduct
        and finally calculate the angle
        */
        Vector line1 = VectorMath.convertLineToVector(center, p1);
        Vector line2 = VectorMath.convertLineToVector(center, p3);
        Double line1Length = line1.getLength();
        Double line2Length = line2.getLength();
        Double lengthProduct = line1Length*line2Length;
        Double dotProduct = dotProduct(line1.getPoint(), line2.getPoint());
        Double theta = (Math.acos(dotProduct/lengthProduct));
        return theta;
    }
    public static Double getLengthRatioBetweenTwoLines(Point p1, Point p2, Point p3, Point p4){
        Vector line1 = VectorMath.convertLineToVector(p1, p2);
        Vector line2 = VectorMath.convertLineToVector(p3, p4);
        Double line1Length = line1.getLength();
        Double line2Length = line2.getLength();
        Double ratio = (line1Length*line2Length)/100;
        return ratio;
    }
   public static Point translateLine(Point destination, Point startPoint, Point endPoint){
        /**
         * Creates a parallel line at a destination point
         * Genuine copy of a line in the Cartesian space is any line that satisfies these 
         * conditions: start.x - end.x and start.y and end.y is constant(the same as in the 
         * original line);
         * start.x(newLine) and start.y(newLine) are the same as the destinationPoint
         * end.x(newLine) and end.y(newLine) are defined as start.x(newLine)+xDiff, 
         * start.y(newLine)+yDiff of the original line
         */
        Integer xDiff = endPoint.x - startPoint.x;
        System.out.println(xDiff);
        Integer yDiff = endPoint.y - startPoint.y;
        System.out.println(yDiff);
        Integer newXStart = destination.x;
        System.out.println(newXStart);
        Integer newYStart = destination.y;
        System.out.println(newYStart);
        Point newEndPoint = new Point(newXStart+xDiff, newYStart+yDiff);
        return newEndPoint;
    }
    
    public static boolean isPositiveLine(Point p1, Point p2){
        /**
         * In computer graphics the cartesian space is a set of numbers(x,y) that are only positive
         * If we take as an axiom that the start point of any line is the point that has y value 
         * either equal to the y value of the end point or less,and the x value is either equal or
         * less than the end point x value, we can assume that every line that satisfies these 
         * conditions will be a positive line. If a line has greater value of either xstart or ystart
         * compared to xend or yend, we can assume that this line is a negative line. Now we cannot
         * accurately and properly compare two lines one positive and one negative with same 
         * length(physical) in the computer coordinate system. This is why we must convert every 
         * negative line to a positive line.
         */
        if(p1.x <= p2.x && p1.y <= p2.y){
            return true;
        }
        else{
            return false;
        }
    }
    public static Point convertNegativeLineToPositive(Point p1, Point p2){
        /**
         * Because its hard and tedious to always define which point is start and which is end
         * for a start point in a negative line we will use the point that has a lower x value
         * For a pivot(rotation point) we will select the point with greater x value. 
         * The translation will be on the x axis according to this formula: 
         * ((x_end*2-x_start),y_start).
         */
        //Now compare the x values of the points
        int newStartX = p2.x;
        int newStartY = p2.y;
        int newEndX = newStartX*2-p1.x;
        int newEndY = p1.y;
        return new Point(newEndX, newEndY);
    }
    public static Double calibrate(Point p1, Point p2){
        Double valueInPixels = getLineLength(p1, p2);
        Double oneMilimeter = valueInPixels/10;
        return oneMilimeter;
    }
    public static Double convertPx_to_mm(Double valuePixels, Double oneMilimeter){
        /*
        the standard value for now will be 10mm
        TBA... add another parameter in this method that will coincide with a JList, where you can
        select the precision of the calibration in terms whether the distance in pixels received 
        will be 10,20,25 mm etc...
        */
        Double convertedValue = valuePixels/oneMilimeter;
        return convertedValue;
    }
  
}
