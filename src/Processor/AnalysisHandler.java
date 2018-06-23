/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processor;

import Memory.*;
import Processor.CephMath;
import java.awt.Point;
import javafx.scene.control.Cell;
/**
 *
 * @author stali
 */
public final class AnalysisHandler 
{
    private static final AnalysisHandler analysisHandler = new  AnalysisHandler();
    
    CephPoints cp = CephPoints.getInstance();
    CephLines cl = CephLines.getInstance();
    CephValues cv = CephValues.getInstance();
    GuiHandler gh = GuiHandler.getInstance();
    private AnalysisHandler()
    {
        
    }
    public static AnalysisHandler getInstance()
    {
        return analysisHandler;
    }
    
    //this is the class where the magic happens :)
    public void initValues(){
        
        double oneMM = CephMath.calibrate(cp.getCalA(), cp.getCalB());
        double sna = CephMath.getAngleBetweenThreePoints(cp.getS(), cp.getN(), cp.getA());
        double snb = CephMath.getAngleBetweenThreePoints(cp.getS(), cp.getN(), cp.getB());
        double anb = sna - snb;
        double snSpp  = CephMath.getAngleBetweenThreePoints(cp.getAnsTranslate(), cp.getS(), cp.getN());
        double snMp = CephMath.getAngleBetweenThreePoints(cp.getMeTranslate(), cp.getS(), cp.getN());
        double sppMp = snMp - snSpp;
        double nsar = CephMath.getAngleBetweenThreePoints(cp.getN(), cp.getS(), cp.getAr());
        double sargo = CephMath.getAngleBetweenThreePoints(cp.getS(), cp.getAr(), cp.getGo());
        double argome = CephMath.getAngleBetweenThreePoints(cp.getAr(), cp.getGo(), cp.getMe());
        double bjork = nsar+sargo+argome;
        double sGo = CephMath.convertPx_to_mm(CephMath.getLineLength(cp.getS(), cp.getN()), oneMM);
        double NMe = CephMath.convertPx_to_mm(CephMath.getLineLength(cp.getN(), cp.getMe()), oneMM);
        double facialRatio = sGo/NMe*100;
        double u_incSpp = CephMath.getAngleBetweenThreePoints(cp.getU_tipTranslate(), cp.getPns(), cp.getAns());
        double l_incMP = CephMath.getAngleBetweenThreePoints(cp.getL_TipTranslate(), cp.getMe(), cp.getGo());
        double se = CephMath.convertPx_to_mm(CephMath.getLineLength(cp.getSe(), cp.getN()), oneMM);
        double cmax = 7*se/10 - CephMath.convertPx_to_mm(CephMath.getLineLength(cp.getPns(), cp.getCmaxPoint()), oneMM);
        double cmand = 21*se/20 - CephMath.convertPx_to_mm(CephMath.getLineLength(cp.getGo(), cp.getCmandPoint()), oneMM);
        double rmand = (21*se/20)*5/7 - CephMath.convertPx_to_mm(CephMath.getLineLength(cp.getRmandStartPoint(), cp.getRmandEndPoint()), oneMM);
        
        cv.setSNA(Math.toDegrees(sna));
        cv.setSNB(Math.toDegrees(snb));
        cv.setANB(Math.toDegrees(anb));
        cv.setSN_Spp(Math.toDegrees(snSpp));
        cv.setSN_MP(Math.toDegrees(snMp));
        cv.setSpp_MP(Math.toDegrees(sppMp));
        cv.setNSAr(Math.toDegrees(nsar));
        cv.setSArGo(Math.toDegrees(sargo));
        cv.setArGoMe(Math.toDegrees(argome));
        cv.setBjork(Math.toDegrees(bjork));
        cv.setSGo(sGo);
        cv.setNMe(NMe);
        cv.setFacialRatio(facialRatio);
        cv.setU_inc_Spp(Math.toDegrees(u_incSpp));
        cv.setL_inc_MP(Math.toDegrees(l_incMP));
        cv.setSe(se);
        cv.setCMax(cmax);
        cv.setCMand(cmand);
        cv.setRMand(rmand);
        cv.initCephValuesArray();
        
        int counter = 0;
        for(Double value : cv.getCephValues()){
            gh.setValueText(counter, value);
            counter++;
        }

    }
   
}

