package debug.processor;

import utilities.objects.Vector;
import utilities.VectorMath;
import java.awt.Point;
import java.awt.geom.Point2D;
import sun.misc.VM;
import static utilities.VectorMath.convertLineToVector;
import static utilities.VectorMath.dotProduct;

/**
 * Handles the canvas
 * Contains methods appropriate for this canvas
 * Contains all the methods necessary for drawing on the canvas like points, lines, text,
 *      
 * @author stali
 */
public final class CephCalculator 

{
    private final static CephCalculator cephCalculator = new CephCalculator();
    private CephCalculator(){};
    public static CephCalculator getInstance(){
        return cephCalculator;
    } 
    public static Double getLineLength(Point p1, Point p2){
        double dX = p1.x - p2.x;
        double dY = p1.y - p2.y;
        //Pythagorean theorem, which states that the square of the hypotenuse is equal to the added squares of the other two sides
        //So here, we add the squares of the sides of the imaginary triangle and end up with the square of the imaginary hypotenuse
        //Then we just square-root this number and we have the imaginary hypotenuse length, that is, the length of the line between the two points
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
  
}
