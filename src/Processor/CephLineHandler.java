/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processor;

import Memory.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;
/**
 *
 * @author stali
 */
public class CephLineHandler 
{
    GuiComponents gc = GuiComponents.getInstance();
    CephPoints cp = CephPoints.getInstance();
    CephLines cl = CephLines.getInstance();
    GuiHandler guiHandler = GuiHandler.getInstance();
    Graphics2D gfx;
    
    
    
    /*
    Needs to draw the lines with a red color based on the previous input
    */
    public CephLineHandler()
    {
        
    }
    public BasicStroke getDashedStroke()
    {
        float dash[] = { 10.0f };
        BasicStroke dashedStroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT,
        BasicStroke.JOIN_MITER, 10.0f, dash, 0.0f);
        return dashedStroke;
    }
    public void initGFX()
    {
        Graphics2D gfx = (Graphics2D) gc.getCephImagePanel().getGraphics();
        gfx.setColor(Color.red);
        this.gfx = gfx;
    }
    public void drawLines()
    {
        initGFX();
        drawSN();
        drawNA();
        drawNB();
        drawSpp();
        drawMP();
        drawSAr();
        drawArGo();
        drawGoMe();
        drawU_Inc();
        drawL_Inc();
        drawSppTranslate();
        drawMPTranslate();
        //drawU_IncTranslate();
        //drawL_IncTranslate();
        drawSe();
        drawCmax();
        drawCmand();
        drawRmand();
    }
    public void drawSN()
    {
       cl.setSN(new Line2D.Double(cp.getS().x, cp.getS().y, cp.getN().x, cp.getN().y));
       gfx.drawLine(cp.getS().x, cp.getS().y, cp.getN().x, cp.getN().y);
    }
    public void drawNA()
    {
       cl.setNA(new Line2D.Double(cp.getN().x, cp.getN().y, cp.getA().x, cp.getA().y));
       gfx.drawLine(cp.getN().x, cp.getN().y, cp.getA().x, cp.getA().y);
    }
    public void drawNB()
    {
       gfx.drawLine(cp.getN().x, cp.getN().y, cp.getB().x, cp.getB().y);
    }
    public void drawSpp()
    {
       gfx.drawLine(cp.getPns().x, cp.getPns().y, cp.getAns().x, cp.getAns().y);
    }
    public void drawSppTranslate(){
        gfx.draw(cl.getSppTranslate());
    }
    public void drawMP()
    {
       gfx.drawLine(cp.getMe().x, cp.getMe().y, cp.getMt2().x, cp.getMt2().y);
    }
    public void drawMPTranslate(){
        gfx.draw(cl.getMPTranslate());
    }
    public void NS()
    {
       gfx.drawLine(cp.getN().x, cp.getN().y, cp.getB().x, cp.getB().y);
    }
    public void drawSAr()
    {
       gfx.drawLine(cp.getS().x, cp.getS().y, cp.getAr().x, cp.getAr().y);
    }
    public void drawArGo()
    {
       gfx.drawLine(cp.getAr().x, cp.getAr().y, cp.getGo().x, cp.getGo().y);
    }
    public void drawGoMe()
    {
       gfx.drawLine(cp.getGo().x, cp.getGo().y, cp.getMe().x, cp.getMe().y);
    }
    public void drawU_Inc()
    {
       gfx.drawLine(cp.getU_apex().x, cp.getU_apex().y, cp.getU_tip().x, cp.getU_tip().y);
    }
    public void drawU_IncTranslate(){
        gfx.draw(cl.getU_incisorTranslate());
    }
    public void drawL_Inc()
    {
       gfx.drawLine(cp.getL_tip().x, cp.getL_tip().y, cp.getL_apex().x, cp.getL_apex().y);
    }
    public void drawL_IncTranslate(){
        gfx.draw(cl.getL_incisorTranslate());
    }
    public void drawSe()
    {
       gfx.setStroke(getDashedStroke());
       gfx.drawLine(cp.getSe().x, cp.getSe().y, cp.getN().x, cp.getN().y);
    }
    public void drawCmax()
    {
       gfx.setStroke(getDashedStroke());
       gfx.drawLine(cp.getPns().x, cp.getPns().y, cp.getCmaxPoint().x, cp.getCmaxPoint().y);
    }
    public void drawCmand()
    {
       gfx.setStroke(getDashedStroke());
       gfx.drawLine(cp.getGo().x, cp.getGo().y, cp.getCmandPoint().x, cp.getCmandPoint().y);
    }
    public void drawRmand()
    {
       gfx.setStroke(getDashedStroke());
       gfx.drawLine(cp.getRmandStartPoint().x, cp.getRmandStartPoint().y, cp.getRmandEndPoint().x, cp.getRmandEndPoint().y);
    }
    
}
