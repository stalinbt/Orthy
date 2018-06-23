/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * Memory object for the gui components
 * @author stali
 */
public final class GuiComponents
{
    private static final GuiComponents guiComponents = new GuiComponents();
    
    private JPanel cephImagePanel;
    private List<JLabel> cephPointLabels = new ArrayList<>();
    private List<JLabel> cephLineLabels = new ArrayList<>();
    private List<JTextField> resultTexts = new ArrayList<>();
    
    private GuiComponents()
    {
        
    }
    public static GuiComponents getInstance()
    {
        return guiComponents;
    }
    /**
     * Set the JPanel where the ceph image is and where the drawing is taking place
     */
    public void setCephImagePanel(JPanel panel)
    {
        this.cephImagePanel = panel;
    }
    /**
     * Set the JLabels that change color to green when a Point is drawn on the screen, by adding 
     * one JLabel to the ArrayList
     */
    public void setCephPointLabels(JLabel label)
    {
        this.cephPointLabels.add(label);
    }
    /**
     * Set the JLabels that change color to green when a Line is drawn on the screen, by adding 
     * one JLabel to the ArrayList
     */
    public void setCephLineLabels(JLabel label)
    {
        this.cephLineLabels.add(label);
    }
    public JPanel getCephImagePanel()
    {
        return this.cephImagePanel;
    }
    public List<JLabel> getCephPointLabels()
    {
        return this.cephPointLabels;
    }
    public List<JLabel> getCephLineLabels()
    {
        return this.cephLineLabels;
    }

    /**
     * @return the resultTexts
     */
    public List<JTextField> getResultTexts() {
        return resultTexts;
    }

    /**
     * @param resultTexts the resultTexts to set
     */
    public void setResultTexts(JTextField resultText) {
        this.resultTexts.add(resultText);
    }
}
