package debug.processor;

import debug.memory.Memory;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import javax.swing.JPanel;
import java.awt.geom.Line2D;

/**
 * Handles the canvas
 * Contains methods appropriate for this canvas
 * Contains all the methods necessary for drawing on the canvas like points, lines, text,
 *      
 * @author stali
 */
public final class CanvasHandler 

{
    private final static CanvasHandler canvasHandler = new CanvasHandler();
    private JPanel canvas;
    private Graphics2D gfx;
    private Memory m = Memory.getInstance();
    
    
    
    private CanvasHandler(){};
    public static CanvasHandler getInstance(){
        return canvasHandler;
    }
    
    public void setCanvas(JPanel panel){
        this.canvas = panel;
    }
    public void setGFX(){
        this.gfx = (Graphics2D)canvas.getGraphics();
    }
    public void resetGfx(){
        gfx.setColor(Color.BLACK);
        gfx.setStroke(new BasicStroke(1));
    }
    public void drawPoint(Point p){
        gfx.drawOval(p.x, p.y, 3, 3);
    };
    public void drawLine(int lineNum){
        switch(lineNum)
        {
            case 1:
                gfx.drawLine(m.getStartPointLineOne().x, m.getStartPointLineOne().y, 
                        m.getEndPointLineOne().x, m.getEndPointLineOne().y);
                break;
            case 2:
                gfx.drawLine(m.getStartPointLineTwo().x, m.getStartPointLineTwo().y, 
                        m.getEndPointLineTwo().x, m.getEndPointLineTwo().y);
                break;
        }
    };
    public void drawTriangle(){
        gfx.setColor(Color.YELLOW);
        gfx.setStroke(new BasicStroke(2));
        gfx.drawLine(m.getStartPointLineOne().x, m.getStartPointLineOne().y, 
                        m.getEndPointLineOne().x, m.getEndPointLineOne().y);
        gfx.drawLine(m.getEndPointLineOne().x, m.getEndPointLineOne().y,
                m.getStartPointLineTwo().x, m.getStartPointLineTwo().y);
    }
    public void drawTranslatedLinesTriangle(Point p1, Point center, Point p2){
        gfx.setColor(Color.GREEN);
        gfx.setStroke(new BasicStroke(5));
        Line2D line1 = new Line2D.Double(p1, center);
        Line2D line2 = new Line2D.Double(center, p2);
        gfx.draw(line1);
        gfx.draw(line2);
    }
    public void drawText(){};
}
