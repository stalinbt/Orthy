/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stali
 */
public final class CephValues 
{
    private static CephValues cephAngles = new CephValues();
    
    private Double SNA;
    private Double SNB;
    private Double ANB;
    private Double SN_Spp;
    private Double SN_MP;
    private Double Spp_MP;
    private Double NSAr;
    private Double SArGo;
    private Double ArGoMe;
    private Double Bjork;
    private Double SGo;
    private Double NMe;
    private Double facialRatio;
    private Double SGo_NMe;
    private Double U_inc_Spp;
    private Double L_inc_MP;
    private Double U_inc_L_inc;
    private Double Se;
    private Double CMax;
    private Double CMand;
    private Double RMand;
    private List<Double> values = new ArrayList<>();
    
    private CephValues()
    {
        
    }
    public static CephValues getInstance()
    {
        return cephAngles;
    }

    /**
     * @return the SNA
     */
    public Double getSNA() {
        return SNA;
    }

    /**
     * @param SNA the SNA to set
     */
    public void setSNA(Double SNA) {
        this.SNA = SNA;
    }

    /**
     * @return the SNB
     */
    public Double getSNB() {
        return SNB;
    }

    /**
     * @param SNB the SNB to set
     */
    public void setSNB(Double SNB) {
        this.SNB = SNB;
    }

    /**
     * @return the ANB
     */
    public Double getANB() {
        return ANB;
    }

    /**
     * @param ANB the ANB to set
     */
    public void setANB(Double ANB) {
        this.ANB = ANB;
    }

    /**
     * @return the SN_Spp
     */
    public Double getSN_Spp() {
        return SN_Spp;
    }

    /**
     * @param SN_Spp the SN_Spp to set
     */
    public void setSN_Spp(Double SN_Spp) {
        this.SN_Spp = SN_Spp;
    }

    /**
     * @return the SN_MP
     */
    public Double getSN_MP() {
        return SN_MP;
    }

    /**
     * @param SN_MP the SN_MP to set
     */
    public void setSN_MP(Double SN_MP) {
        this.SN_MP = SN_MP;
    }

    /**
     * @return the Spp_MP
     */
    public Double getSpp_MP() {
        return Spp_MP;
    }

    /**
     * @param Spp_MP the Spp_MP to set
     */
    public void setSpp_MP(Double Spp_MP) {
        this.Spp_MP = Spp_MP;
    }

    /**
     * @return the NSAr
     */
    public Double getNSAr() {
        return NSAr;
    }

    /**
     * @param NSAr the NSAr to set
     */
    public void setNSAr(Double NSAr) {
        this.NSAr = NSAr;
    }

    /**
     * @return the SArGo
     */
    public Double getSArGo() {
        return SArGo;
    }

    /**
     * @param SArGo the SArGo to set
     */
    public void setSArGo(Double SArGo) {
        this.SArGo = SArGo;
    }

    /**
     * @return the ArGoMe
     */
    public Double getArGoMe() {
        return ArGoMe;
    }

    /**
     * @param ArGoMe the ArGoMe to set
     */
    public void setArGoMe(Double ArGoMe) {
        this.ArGoMe = ArGoMe;
    }

    /**
     * @return the Bjork
     */
    public Double getBjork() {
        return Bjork;
    }

    /**
     * @param Bjork the Bjork to set
     */
    public void setBjork(Double Bjork) {
        this.Bjork = Bjork;
    }

    /**
     * @return the SGo
     */
    public Double getSGo() {
        return SGo;
    }

    /**
     * @param SGo the SGo to set
     */
    public void setSGo(Double SGo) {
        this.SGo = SGo;
    }

    /**
     * @return the NMe
     */
    public Double getNMe() {
        return NMe;
    }

    /**
     * @param NMe the NMe to set
     */
    public void setNMe(Double NMe) {
        this.NMe = NMe;
    }

    /**
     * @return the SGo_NMe
     */
    public Double getSGo_NMe() {
        return SGo_NMe;
    }

    /**
     * @param SGo_NMe the SGo_NMe to set
     */
    public void setSGo_NMe(Double SGo_NMe) {
        this.SGo_NMe = SGo_NMe;
    }

    /**
     * @return the U_inc_Spp
     */
    public Double getU_inc_Spp() {
        return U_inc_Spp;
    }

    /**
     * @param U_inc_Spp the U_inc_Spp to set
     */
    public void setU_inc_Spp(Double U_inc_Spp) {
        this.U_inc_Spp = U_inc_Spp;
    }

    /**
     * @return the L_inc_MP
     */
    public Double getL_inc_MP() {
        return L_inc_MP;
    }

    /**
     * @param L_inc_MP the L_inc_MP to set
     */
    public void setL_inc_MP(Double L_inc_MP) {
        this.L_inc_MP = L_inc_MP;
    }

    /**
     * @return the U_inc_L_inc
     */
    public Double getU_inc_L_inc() {
        return U_inc_L_inc;
    }

    /**
     * @param U_inc_L_inc the U_inc_L_inc to set
     */
    public void setU_inc_L_inc(Double U_inc_L_inc) {
        this.U_inc_L_inc = U_inc_L_inc;
    }

    /**
     * @return the Se
     */
    public Double getSe() {
        return Se;
    }

    /**
     * @param Se the Se to set
     */
    public void setSe(Double Se) {
        this.Se = Se;
    }

    /**
     * @return the CMax
     */
    public Double getCMax() {
        return CMax;
    }

    /**
     * @param CMax the CMax to set
     */
    public void setCMax(Double CMax) {
        this.CMax = CMax;
    }

    /**
     * @return the CMand
     */
    public Double getCMand() {
        return CMand;
    }

    /**
     * @param CMand the CMand to set
     */
    public void setCMand(Double CMand) {
        this.CMand = CMand;
    }

    /**
     * @return the RMand
     */
    public Double getRMand() {
        return RMand;
    }

    /**
     * @param RMand the RMand to set
     */
    public void setRMand(Double RMand) {
        this.RMand = RMand;
    }

    /**
     * @return the facialRatio
     */
    public Double getFacialRatio() {
        return facialRatio;
    }

    /**
     * @param facialRatio the facialRatio to set
     */
    public void setFacialRatio(Double facialRatio) {
        this.facialRatio = facialRatio;
    }
    
    public void initCephValuesArray(){
        values.add(SNA);
        values.add(SNB);
        values.add(ANB);
        values.add(SN_Spp);
        values.add(SN_MP);
        values.add(Spp_MP);
        values.add(NSAr);
        values.add(SArGo);
        values.add(ArGoMe);
        values.add(Bjork);
        values.add(SGo);
        values.add(NMe);
        values.add(facialRatio);
        values.add(U_inc_Spp);
        values.add(L_inc_MP);
        values.add(Se);
        values.add(CMax);
        values.add(CMand);
        values.add(RMand);
    }
    public List<Double> getCephValues(){
        return values;
    }

}
