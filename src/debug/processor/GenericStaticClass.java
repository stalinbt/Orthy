package debug.processor;

/**
 * Handles the canvas
 * Contains methods appropriate for this canvas
 * Contains all the methods necessary for drawing on the canvas like points, lines, text,
 *      
 * @author stali
 */
public final class GenericStaticClass 

{
    private final static GenericStaticClass canvasHandler = new GenericStaticClass();
    
    private GenericStaticClass(){};
    public static GenericStaticClass getInstance(){
        return canvasHandler;
    }
}
