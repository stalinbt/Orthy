/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processor;

import java.awt.Color;
import Memory.GuiComponents;
import java.awt.Point;

/**
 *
 * @author stali
 */
public final class GuiHandler 
{
    private static final GuiHandler guiHandler = new GuiHandler();
    
    private GuiComponents gc = GuiComponents.getInstance();
    
    private GuiHandler()
    {
        
    }
    public static GuiHandler getInstance()
    {
        return guiHandler;
    }


    public void paintCephPointLabels(int index)
    {
        gc.getCephPointLabels().get(index).setBackground(Color.GREEN);
    }
    public void paintCephLinesLabels(int index)
    {
        gc.getCephLineLabels().get(index).setBackground(Color.GREEN);
    }
    public void setValueText(int index, Double value){
        gc.getResultTexts().get(index).setText(String.format("%.1f", value));
    }
    
    public String logPoint(Point p){
        return String.format("Point [ %d , %d ]%n", p.x,p.y);
    }
    public String logLine(Point p1, Point p2){
        return String.format("Line[ Point(%d,%d) , Point(%d,%d) ]%n", p1.x,p1.y,p2.x,p2.y);
    }
    public String logHorizontalAngle(Double angle){
        return String.format("Deviation from horizontal is: %.2f%n", angle);
    }
}
