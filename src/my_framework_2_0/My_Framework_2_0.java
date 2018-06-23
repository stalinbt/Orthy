/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_framework_2_0;

import debug.objects.Vector;
import debug.processor.VectorMath;
import java.awt.Point;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author stali
 */
public class My_Framework_2_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\stali\\Documents\\NetBeansProjects\\MyFramework_New_1.1_1_resize\\src\\gui\\IMG\\H2.jpg");
        
        Point p1 = new Point(9, 2);
        Point center = new Point(4, 3);
        Point p2 = new Point(2, 6);
        
        Vector v1 = new Vector(p1);
        System.out.println(v1.getDirection());
        System.out.println(v1.getLength());
        System.out.println(VectorMath.dotProduct(p1, p2));
    }
    
}
