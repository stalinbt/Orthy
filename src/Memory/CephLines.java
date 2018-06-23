/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory;

import Processor.CephMath;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.shape.Line;

/**
 *
 * @author stali
 */
public final class CephLines
{
    private static final CephLines cephLines = new CephLines();
    //Instance of the CephPoints class in Memory where references to the Points are being kept
    //so we can create lines here
    private CephPoints cp = CephPoints.getInstance();
    
    //this is how all the lines should be declared(calibrationLine) :)
    private Line2D.Double calibrationLine = new Line2D.Double(cp.getCalA(), cp.getCalB());
    private Line2D.Double SN = new Line2D.Double(cp.getS(), cp.getN());
    private Line2D.Double NA = new Line2D.Double(cp.getN(), cp.getA());
    private Line2D.Double NB = new Line2D.Double(cp.getN(), cp.getB());
    private Line2D.Double Spp = new Line2D.Double(cp.getPns(), cp.getAns());
    private Line2D.Double MP = new Line2D.Double(cp.getMe(), cp.getMt2());
    private Line2D.Double NS = new Line2D.Double(cp.getN(), cp.getS());
    private Line2D.Double SAr = new Line2D.Double(cp.getS(), cp.getAr());
    private Line2D.Double ArGo = new Line2D.Double(cp.getAr(), cp.getGo());
    private Line2D.Double GoMe = new Line2D.Double(cp.getGo(), cp.getMe());
    private Line2D.Double SGo = new Line2D.Double(cp.getS(), cp.getGo());
    private Line2D.Double NMe = new Line2D.Double(cp.getN(), cp.getMe());
    private Line2D.Double U_inc = new Line2D.Double(cp.getU_apex(), cp.getU_tip());
    private Line2D.Double L_inc = new Line2D.Double(cp.getL_tip(), cp.getL_apex());
    private Line2D.Double SeN = new Line2D.Double(cp.getSe(), cp.getN());
    private Line2D.Double Cmax = new Line2D.Double(cp.getPns(), cp.getCmaxPoint());
    private Line2D.Double Cmand = new Line2D.Double(cp.getGo(), cp.getCmandPoint());
    private Line2D.Double Rmand = new Line2D.Double(cp.getRmandStartPoint(), cp.getRmandEndPoint());
    private List<Line2D.Double> cephalometricLines = new ArrayList<>();
    
    private Line2D SppTranslate;
    private Line2D MPTranslate;
    private Line2D U_incisorTranslate;
    private Line2D L_incisorTranslate;
    
    private CephLines()
    {
        
    }
    public static CephLines getInstance()
    {
        return cephLines;
    }
    public void initCephLines(){
        calibrationLine = new Line2D.Double(cp.getCalA(), cp.getCalB());
        SN = new Line2D.Double(cp.getS(), cp.getN());
        NA = new Line2D.Double(cp.getN(), cp.getA());
        NB = new Line2D.Double(cp.getN(), cp.getB());
        Spp = new Line2D.Double(cp.getPns(), cp.getAns());
        MP = new Line2D.Double(cp.getMe(), cp.getMt2());
        NS = new Line2D.Double(cp.getN(), cp.getS());
        SAr = new Line2D.Double(cp.getS(), cp.getAr());
        ArGo = new Line2D.Double(cp.getAr(), cp.getGo());
        GoMe = new Line2D.Double(cp.getGo(), cp.getMe());
        SGo = new Line2D.Double(cp.getS(), cp.getGo());
        NMe = new Line2D.Double(cp.getN(), cp.getMe());
        U_inc = new Line2D.Double(cp.getU_apex(), cp.getU_tip());
        L_inc = new Line2D.Double(cp.getL_tip(), cp.getL_apex());
        SeN = new Line2D.Double(cp.getSe(), cp.getN());
        Cmax = new Line2D.Double(cp.getPns(), cp.getCmaxPoint());
        Cmand = new Line2D.Double(cp.getGo(), cp.getCmandPoint());
        Rmand = new Line2D.Double(cp.getRmandStartPoint(), cp.getRmandEndPoint());
        SppTranslate = getSppTranslate();
        MPTranslate = getMPTranslate();
        U_incisorTranslate = getU_incisorTranslate();
        L_incisorTranslate = getL_incisorTranslate();
    }

    
    public void translateSpp(){
        /*
        Very nice way, dont be confused with the name of the method, because basically you are 
        translating a line as a whole, with the predicate that the startPoint of this new line
        is the destination parameter of the method. So basically whenever you need to draw a 
        parrarel line that is equivalent to the original line, create a line with this translated
        endPoint and the destinationPoint as startPoint
        */
        Point newAns = CephMath.translateLine(getCp().getS(), getCp().getPns(), getCp().getAns());
        this.SppTranslate = new Line2D.Double(newAns, getCp().getS());
    }
    public void translateMP(){
        Point newMe = CephMath.translateLine(getCp().getS(), getCp().getMt2(), getCp().getMe());
        this.MPTranslate = new Line2D.Double(newMe, getCp().getS());
    }
    public void translateU_inc(){
        Point newU_tip = CephMath.translateLine(getCp().getPns(), getCp().getU_tip(), getCp().getU_tip());
        this.setU_incisorTranslate(new Line2D.Double(newU_tip, getCp().getPns()));
    }
    public void translateL_inc(){
        Point newL_tip = CephMath.translateLine(getCp().getMe(), getCp().getL_tip(), getCp().getL_apex());
        this.L_incisorTranslate = new Line2D.Double(newL_tip, getCp().getMe());
    }

    /**
     * @return the SppTranslate
     */
    public Line2D getSppTranslate() {
        translateSpp();
        return SppTranslate;
    }

    /**
     * @return the SnTranslate
     */
    public Line2D getMPTranslate() {
        translateMP();
        return MPTranslate;
    }

    /**
     * @return the U_incisorTranslate
     */
    public Line2D getU_incisorTranslate() {
        translateU_inc();
        return U_incisorTranslate;
    }

    /**
     * @return the L_incisorTranslate
     */
    public Line2D getL_incisorTranslate() {
        translateL_inc();
        return L_incisorTranslate;
    }

    /**
     * @return the cp
     */
    public CephPoints getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(CephPoints cp) {
        this.cp = cp;
    }

    /**
     * @return the SN
     */
    public Line2D.Double getSN() {
        return SN;
    }

    /**
     * @param SN the SN to set
     */
    public void setSN(Line2D.Double SN) {
        this.SN = SN;
    }

    /**
     * @return the NA
     */
    public Line2D.Double getNA() {
        return NA;
    }

    /**
     * @param NA the NA to set
     */
    public void setNA(Line2D.Double NA) {
        this.NA = NA;
    }

    /**
     * @return the NB
     */
    public Line2D.Double getNB() {
        return NB;
    }

    /**
     * @param NB the NB to set
     */
    public void setNB(Line2D.Double NB) {
        this.NB = NB;
    }

    /**
     * @return the Spp
     */
    public Line2D.Double getSpp() {
        return Spp;
    }

    /**
     * @param Spp the Spp to set
     */
    public void setSpp(Line2D.Double Spp) {
        this.Spp = Spp;
    }

    /**
     * @return the MP
     */
    public Line2D.Double getMP() {
        return MP;
    }

    /**
     * @param MP the MP to set
     */
    public void setMP(Line2D.Double MP) {
        this.MP = MP;
    }

    /**
     * @return the NS
     */
    public Line2D.Double getNS() {
        return NS;
    }

    /**
     * @param NS the NS to set
     */
    public void setNS(Line2D.Double NS) {
        this.NS = NS;
    }

    /**
     * @return the SAr
     */
    public Line2D.Double getSAr() {
        return SAr;
    }

    /**
     * @param SAr the SAr to set
     */
    public void setSAr(Line2D.Double SAr) {
        this.SAr = SAr;
    }

    /**
     * @return the ArGo
     */
    public Line2D.Double getArGo() {
        return ArGo;
    }

    /**
     * @param ArGo the ArGo to set
     */
    public void setArGo(Line2D.Double ArGo) {
        this.ArGo = ArGo;
    }

    /**
     * @return the GoMe
     */
    public Line2D.Double getGoMe() {
        return GoMe;
    }

    /**
     * @param GoMe the GoMe to set
     */
    public void setGoMe(Line2D.Double GoMe) {
        this.GoMe = GoMe;
    }

    /**
     * @return the SGo
     */
    public Line2D.Double getSGo() {
        return SGo;
    }

    /**
     * @param SGo the SGo to set
     */
    public void setSGo(Line2D.Double SGo) {
        this.SGo = SGo;
    }

    /**
     * @return the NMe
     */
    public Line2D.Double getNMe() {
        return NMe;
    }

    /**
     * @param NMe the NMe to set
     */
    public void setNMe(Line2D.Double NMe) {
        this.NMe = NMe;
    }

    /**
     * @return the U_inc
     */
    public Line2D.Double getU_inc() {
        return U_inc;
    }

    /**
     * @param U_inc the U_inc to set
     */
    public void setU_inc(Line2D.Double U_inc) {
        this.U_inc = U_inc;
    }

    /**
     * @return the L_inc
     */
    public Line2D.Double getL_inc() {
        return L_inc;
    }

    /**
     * @param L_inc the L_inc to set
     */
    public void setL_inc(Line2D.Double L_inc) {
        this.L_inc = L_inc;
    }

    /**
     * @return the SeN
     */
    public Line2D.Double getSeN() {
        return SeN;
    }

    /**
     * @param SeN the SeN to set
     */
    public void setSeN(Line2D.Double SeN) {
        this.SeN = SeN;
    }

    /**
     * @return the Cmax
     */
    public Line2D.Double getCmax() {
        return Cmax;
    }

    /**
     * @param Cmax the Cmax to set
     */
    public void setCmax(Line2D.Double Cmax) {
        this.Cmax = Cmax;
    }

    /**
     * @return the Cmand
     */
    public Line2D.Double getCmand() {
        return Cmand;
    }

    /**
     * @param Cmand the Cmand to set
     */
    public void setCmand(Line2D.Double Cmand) {
        this.Cmand = Cmand;
    }

    /**
     * @return the Rmand
     */
    public Line2D.Double getRmand() {
        return Rmand;
    }

    /**
     * @param Rmand the Rmand to set
     */
    public void setRmand(Line2D.Double Rmand) {
        this.Rmand = Rmand;
    }

    /**
     * @return the cephalometricLines
     */
    public List<Line2D.Double> getCephalometricLines() {
        return cephalometricLines;
    }

    /**
     * @param cephalometricLines the cephalometricLines to set
     */
    public void setCephalometricLines(List<Line2D.Double> cephalometricLines) {
        this.cephalometricLines = cephalometricLines;
    }

    /**
     * @param U_incisorTranslate the U_incisorTranslate to set
     */
    public void setU_incisorTranslate(Line2D U_incisorTranslate) {
        this.U_incisorTranslate = U_incisorTranslate;
    }

    /**
     * @return the calibrationLine
     */
    public Line2D.Double getCalibrationLine() {
        return calibrationLine;
    }

    /**
     * @param calibrationLine the calibrationLine to set
     */
    public void setCalibrationLine(Line2D.Double calibrationLine) {
        this.calibrationLine = calibrationLine;
    }

}

