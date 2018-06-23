/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processor;

import Memory.CephPoints;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import Memory.GuiComponents;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;

/**
 * 
 * Class, a handler for points. Each graphical object has a corresponding handler that can draw
 * that object
 * @author stali
 */
public class CephPointHandler extends MouseAdapter
{
    CephPoints cp = CephPoints.getInstance();
    //this is needed as a reference to the canvas, the cephImagePanel to draw points
    GuiComponents gc = GuiComponents.getInstance();
    //The guiHandler draws, or repaints the Labels
    GuiHandler guiHandler = GuiHandler.getInstance();
    static int pointCount = 0;
    Point[] cephPoints = new Point[21];
    List<Point> tempPoints = new ArrayList<>();
    
    //the true name of this method should be drawPoint, since every handler knows how to handle
    //the object that it handles. If its a drawable object, it can draw it, if it is movable object
    //it can move it, etc....
    @Override
    public void mouseClicked(MouseEvent event)
    {
        Graphics2D gfx = (Graphics2D) gc.getCephImagePanel().getGraphics();
        gfx.setColor(Color.YELLOW);
        if(pointCount < cephPoints.length)
        {
            //sentinelList and used in drawing
            cephPoints[pointCount] = event.getPoint();
            //creates an array of points in Memory
            cp.initCephPointsArray(event.getPoint());
            gfx.drawOval(cephPoints[pointCount].x, cephPoints[pointCount].y, 2, 2);
            //GUI HANDLER
            guiHandler.paintCephPointLabels(pointCount); 
            ++pointCount;
        }
        if(pointCount == 21)
        {
            //from the previous array in Memory gives value to each point
            cp.initCephPoints();
        }
    }
    public static void resetPointCounter()
    {
        pointCount = 0;
    }
    public void setCalibrationPoints(Point a, Point b){
        cp.setCalA(a);
        cp.setCalB(b);
    }
}
