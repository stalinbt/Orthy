/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory;

import Processor.CephMath;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stali
 */
public final class CephPoints
{
    private static final CephPoints cephPoints = new CephPoints();
    static int counter = 0;
    
    private Point calA = new Point();
    private Point calB = new Point();
    private Point S = new Point();
    private Point N = new Point();
    private Point A = new Point();
    private Point B = new Point();
    private Point Ans = new Point();
    private Point Pns = new Point();
    private Point Me = new Point();
    private Point Mt2 = new Point();
    private Point Go = new Point();
    private Point Ar = new Point();
    private Point u_apex = new Point();
    private Point u_tip = new Point();
    private Point l_tip = new Point();
    private Point l_apex = new Point();
    private Point Se = new Point();
    private Point CmaxPoint = new Point();
    private Point CmandPoint = new Point();
    private Point RmandStartPoint = new Point();
    private Point RmandEndPoint = new Point();
    private Point AnsTranslate;
    private Point MeTranslate;
    private Point U_tipTranslate;
    private Point L_TipTranslate;
    private List<Point> cephalometricPoints = new ArrayList<>();
    
    private CephPoints()
    {
        
    }
    public static CephPoints getInstance()
    {
        return cephPoints;
    }
//*************************************************************************************************
    /**
     * @return the S
     */
    public Point getS() {
        return S;
    }

    /**
     * @param S the S to set
     */
    public void setS(Point S) {
        this.S = S;
    }

    /**
     * @return the N
     */
    public Point getN() {
        return N;
    }

    /**
     * @param N the N to set
     */
    public void setN(Point N) {
        this.N = N;
    }

    /**
     * @return the A
     */
    public Point getA() {
        return A;
    }

    /**
     * @param A the A to set
     */
    public void setA(Point A) {
        this.A = A;
    }

    /**
     * @return the B
     */
    public Point getB() {
        return B;
    }

    /**
     * @param B the B to set
     */
    public void setB(Point B) {
        this.B = B;
    }

    /**
     * @return the Ans
     */
    public Point getAns() {
        return Ans;
    }

    /**
     * @param Ans the Ans to set
     */
    public void setAns(Point Ans) {
        this.Ans = Ans;
    }

    /**
     * @return the Pns
     */
    public Point getPns() {
        return Pns;
    }

    /**
     * @param Pns the Pns to set
     */
    public void setPns(Point Pns) {
        this.Pns = Pns;
    }

    /**
     * @return the Me
     */
    public Point getMe() {
        return Me;
    }

    /**
     * @param Me the Me to set
     */
    public void setMe(Point Me) {
        this.Me = Me;
    }

    /**
     * @return the Mt2
     */
    public Point getMt2() {
        return Mt2;
    }

    /**
     * @param Mt2 the Mt2 to set
     */
    public void setMt2(Point Mt2) {
        this.Mt2 = Mt2;
    }

    /**
     * @return the Go
     */
    public Point getGo() {
        return Go;
    }

    /**
     * @param Go the Go to set
     */
    public void setGo(Point Go) {
        this.Go = Go;
    }

    /**
     * @return the Ar
     */
    public Point getAr() {
        return Ar;
    }

    /**
     * @param Ar the Ar to set
     */
    public void setAr(Point Ar) {
        this.Ar = Ar;
    }

    /**
     * @return the u_apex
     */
    public Point getU_apex() {
        return u_apex;
    }

    /**
     * @param u_apex the u_apex to set
     */
    public void setU_apex(Point u_apex) {
        this.u_apex = u_apex;
    }

    /**
     * @return the u_tip
     */
    public Point getU_tip() {
        return u_tip;
    }

    /**
     * @param u_tip the u_tip to set
     */
    public void setU_tip(Point u_tip) {
        this.u_tip = u_tip;
    }

    /**
     * @return the l_tip
     */
    public Point getL_tip() {
        return l_tip;
    }

    /**
     * @param l_tip the l_tip to set
     */
    public void setL_tip(Point l_tip) {
        this.l_tip = l_tip;
    }

    /**
     * @return the l_apex
     */
    public Point getL_apex() {
        return l_apex;
    }

    /**
     * @param l_apex the l_apex to set
     */
    public void setL_apex(Point l_apex) {
        this.l_apex = l_apex;
    }

    /**
     * @return the Se
     */
    public Point getSe() {
        return Se;
    }

    /**
     * @param Se the Se to set
     */
    public void setSe(Point Se) {
        this.Se = Se;
    }

    /**
     * @return the CmaxPoint
     */
    public Point getCmaxPoint() {
        return CmaxPoint;
    }

    /**
     * @param CmaxPoint the CmaxPoint to set
     */
    public void setCmaxPoint(Point CmaxPoint) {
        this.CmaxPoint = CmaxPoint;
    }

    /**
     * @return the CmandPoint
     */
    public Point getCmandPoint() {
        return CmandPoint;
    }

    /**
     * @param CmandPoint the CmandPoint to set
     */
    public void setCmandPoint(Point CmandPoint) {
        this.CmandPoint = CmandPoint;
    }
        /**
     * @return the RmandStartPoint
     */
    public Point getRmandStartPoint() {
        return RmandStartPoint;
    }

    /**
     * @param RmandStartPoint the RmandStartPoint to set
     */
    public void setRmandStartPoint(Point RmandStartPoint) {
        this.RmandStartPoint = RmandStartPoint;
    }

    /**
     * @return the RmandEndPoint
     */
    public Point getRmandEndPoint() {
        return RmandEndPoint;
    }

    /**
     * @param RmandEndPoint the RmandEndPoint to set
     */
    public void setRmandEndPoint(Point RmandEndPoint) {
        this.RmandEndPoint = RmandEndPoint;
    }
    //*********************************************************************************************
    public void initCephPointsArray(Point point)
    {
        /*
        When we click the points on the image, we first add them to an array containing all the
        points, but individual point variables like A, B, etc... are not initialized. This just 
        creates an array of points. But since the way this application works and that is strict
        step by step, where the user cany skip a step, the points must be clicked in a predetermined
        order. That is why this class has a static variable - counter that is initialized to zero
        that each time a point is added to this array it is incremented. And since the points are
        clicked in a controled way, then we use the counter in the initCephPoint method, using a for
        loop where the counter value(better yet the for variable i ) fits the order of initialization
        of each point in the method body.
        */
        this.cephalometricPoints.add(point);
        System.out.println(counter);
        ++counter;
    }
    //*********************************************************************************************
    public void initCephPoints()
    {
        /*
        Explanation in the initCephPointArray method body :)
        */
        
            this.calA = cephalometricPoints.get(0);
            this.calB = cephalometricPoints.get(1);
            this.S = cephalometricPoints.get(2);
            this.N = cephalometricPoints.get(3);
            this.A = cephalometricPoints.get(4);
            this.B = cephalometricPoints.get(5);
            this.Ans = cephalometricPoints.get(6);
            this.Pns = cephalometricPoints.get(7);
            this.Me = cephalometricPoints.get(8);
            this.Mt2 = cephalometricPoints.get(9);
            this.Go = cephalometricPoints.get(10);
            this.Ar = cephalometricPoints.get(11);
            this.u_apex = cephalometricPoints.get(12);
            this.u_tip = cephalometricPoints.get(13);
            this.l_tip = cephalometricPoints.get(14);
            this.l_apex = cephalometricPoints.get(15);
            this.Se = cephalometricPoints.get(16);
            this.CmaxPoint = cephalometricPoints.get(17);
            this.CmandPoint = cephalometricPoints.get(18);
            this.RmandStartPoint = cephalometricPoints.get(19);
            this.RmandEndPoint = cephalometricPoints.get(20);

        
        //this declarations are used to create a translated Point for the parallel lines
        //A translated point is an end point of a line that is using a point on the destination line
        //as a start point, while if we compare the original line and the translated line we will
        //see that these lines are equivalent in lenght, its the same line just the position is
        //different
        this.AnsTranslate = CephMath.translateLine(this.S, this.Pns, this.Ans);
        this.MeTranslate = CephMath.translateLine(this.S, this.Go, this.Me);
        this.U_tipTranslate = CephMath.translateLine(this.Pns, this.u_apex, this.u_tip);
        this.L_TipTranslate = CephMath.translateLine(this.Me, this.l_apex, this.l_tip);
        for(Point p : cephalometricPoints){
            System.out.println(p.toString());
        }
    }
    /**
     * @return the cephalometricPoints
     */
    public List<Point> getCephalometricPoints() {
        return cephalometricPoints;
    }

    /**
     * @param cephalometricPoints the cephalometricPoints to set
     */
    public void setCephalometricPoints(List<Point> cephalometricPoints) {
        this.cephalometricPoints = cephalometricPoints;
    }

    /**
     * @return the AnsTranslate
     */
    public Point getAnsTranslate() {
        return AnsTranslate;
    }

    /**
     * @param AnsTranslate the AnsTranslate to set
     */
    public void setAnsTranslate(Point AnsTranslate) {
        this.AnsTranslate = AnsTranslate;
    }

    /**
     * @return the PnsTranslate
     */
    public Point getMeTranslate() {
        return MeTranslate;
    }

    /**
     * @param PnsTranslate the PnsTranslate to set
     */
    public void setMeTranslate(Point PnsTranslate) {
        this.MeTranslate = PnsTranslate;
    }

    /**
     * @return the U_tipTranslate
     */
    public Point getU_tipTranslate() {
        return U_tipTranslate;
    }

    /**
     * @param U_tipTranslate the U_tipTranslate to set
     */
    public void setU_tipTranslate(Point U_tipTranslate) {
        this.U_tipTranslate = U_tipTranslate;
    }

    /**
     * @return the L_TipTranslate
     */
    public Point getL_TipTranslate() {
        return L_TipTranslate;
    }

    /**
     * @param L_TipTranslate the L_TipTranslate to set
     */
    public void setL_TipTranslate(Point L_TipTranslate) {
        this.L_TipTranslate = L_TipTranslate;
    }

    /**
     * @return the calA
     */
    public Point getCalA() {
        return calA;
    }

    /**
     * @param calA the calA to set
     */
    public void setCalA(Point calA) {
        this.calA = calA;
    }

    /**
     * @return the calB
     */
    public Point getCalB() {
        return calB;
    }

    /**
     * @param calB the calB to set
     */
    public void setCalB(Point calB) {
        this.calB = calB;
    }
}
