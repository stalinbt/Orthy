package debug.memory;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import math.geom2d.line.*;
import math.geom2d.Angle2D;

/**
 *      
 * @author stali
 */
public final class Memory 

{
    private final static Memory memory = new Memory();
    
    private Point startPointLineOne;
    private Point endPointLineOne;
    private Point startPointLineTwo;
    private Point endPointLineTwo;
    private Point newEndPoint;
    static int counter = 1;
    
    private Memory(){};
    public static Memory getInstance(){
        return memory;
    }


    public Point getStartPointLineOne() {
        return startPointLineOne;
    }


    public void setStartPointLineOne(Point startPointLineOne) {
        this.startPointLineOne = startPointLineOne;
        ++counter;
    }

    public Point getEndPointLineOne() {
        return endPointLineOne;
    }

    public void setEndPointLineOne(Point endPointLineOne) {
        this.endPointLineOne = endPointLineOne;
        ++counter;
    }

    public Point getStartPointLineTwo() {
        return startPointLineTwo;
    }

    public void setStartPointLineTwo(Point startPointLineTwo) {
        this.startPointLineTwo = startPointLineTwo;
        ++counter;
    }

    public Point getEndPointLineTwo() {
        return endPointLineTwo;
    }

    public void setEndPointLineTwo(Point endPointLineTwo) {
        this.endPointLineTwo = endPointLineTwo;
        ++counter;
    }
    
    public int getCounter(){
        return counter;
    }
    public void resetCounter(){
        this.counter = 1;
    }

    /**
     * @return the newEndPoint
     */
    public Point getNewEndPoint() {
        return newEndPoint;
    }

    /**
     * @param newEndPoint the newEndPoint to set
     */
    public void setNewEndPoint(Point newEndPoint) {
        this.newEndPoint = newEndPoint;
    }
}
