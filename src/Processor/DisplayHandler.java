/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processor;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;

/**
 *
    * @author stali
 */
public final class DisplayHandler 
{
    private static final DisplayHandler guiControler = new DisplayHandler();
    
    //available components that can display graphics
    private GraphicsEnvironment stefcoPC = GraphicsEnvironment.getLocalGraphicsEnvironment();
    //monitors
    private GraphicsDevice[] monitors = stefcoPC.getScreenDevices();
    //configuration of the monitors
    private GraphicsConfiguration[] configurations = new GraphicsConfiguration[3];
    //JFrame window
    private Window[] windows;
    
    private DisplayHandler()
    {
        
    }
    public static DisplayHandler getInstance()
    {
        return guiControler;
    }
    /**
    Launches the application in full screen mode
    */
    public void fullScreenMode(Window[] win)
    {
        setWindows(win);
        processConfiguration();
        getMonitors()[0].setFullScreenWindow(getWindows()[0]);
    }
    /**
    Creates configuration objects from the monitors
    */
    public void processConfiguration()
    {
        for (GraphicsDevice gd_temp : getMonitors()) {
            this.setConfigurations(gd_temp.getConfigurations());
        }
    }

    /**
     * @return the stefcoPC
     */
    public GraphicsEnvironment getStefcoPC() {
        return stefcoPC;
    }

    /**
     * @param stefcoPC the stefcoPC to set
     */
    public void setStefcoPC(GraphicsEnvironment stefcoPC) {
        this.stefcoPC = stefcoPC;
    }

    /**
     * @return the monitors
     */
    public GraphicsDevice[] getMonitors() {
        return monitors;
    }

    /**
     * @param monitors the monitors to set
     */
    public void setMonitors(GraphicsDevice[] monitors) {
        this.monitors = monitors;
    }

    /**
     * @return the configurations
     */
    public GraphicsConfiguration[] getConfigurations() {
        return configurations;
    }

    /**
     * @param configurations the configurations to set
     */
    public void setConfigurations(GraphicsConfiguration[] configurations) {
        this.configurations = configurations;
    }

    /**
     * @return the window
     */
    
    /**
     * @return the windows
     */
    public Window[] getWindows() {
        return windows;
    }

    /**
     * @param windows the windows to set
     */
    public void setWindows(Window[] windows) {
        this.windows = windows;
    }
}
