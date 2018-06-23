/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processor;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.nio.file.Paths;
import javax.swing.JFileChooser;

/**
 *
 * @author stali
 */
public final class ImageHandler 
{
    private static final ImageHandler imageHandler = new ImageHandler();
    private Path imagePath = 
            Paths.get("C:\\Users\\stali\\Documents\\NetBeansProjects\\MyFramework_New_1.1_1_resize\\src\\gui\\IMG\\H2.jpg");
    private BufferedImage cephImage;
    
    int OFFSET = 14;
    
    private ImageHandler()
    {
        
    }
    public static ImageHandler getInstance()
    {
        return imageHandler;
    }
    
    public void createImage(File img)
    {
        BufferedImage imgTemp = null;
        try {
            imgTemp = ImageIO.read(img);
        } catch (Exception e) {
        }
        this.cephImage = imgTemp;
        //return imgTemp;
    }
    
    public void createImage(String path)
    {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imagePath.toString()));
        } catch (Exception e) {
        }
        this.cephImage = img;
    }

    public void showImage(JPanel imagePanel)
    {
        Graphics2D gfx = (Graphics2D) imagePanel.getGraphics();
        gfx.drawImage(this.cephImage, 30, 30, imagePanel);
    }
    public void saveImage()
    {
        
    }
    public Path getPath()
    {
        return this.imagePath;
    }
    public void setPath(Path path)
    {
        this.imagePath = path;
    }
    public BufferedImage getCephImage()
    {
        return this.cephImage;
    }
    public void setCephImage(BufferedImage cephImage)
    {
        this.cephImage = cephImage;
    }
    public JFileChooser createFileChooser(JPanel root)
    {
        JFileChooser fc = new JFileChooser("C:\\Users\\stali\\Desktop\\CephImagesJava");
        return fc;
    }
}
