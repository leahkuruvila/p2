
/**
 * Write a description of class GraphicPolygon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import apcslib.*;
public class GraphicPolygon
{
    // instance variables - replace the example below with your own
    private DrawingTool pen = new DrawingTool(new SketchPad(400,400));
    private double xPos, yPos;
    int degrees;
    double length;
    
    

    /**
     * Constructor for objects of class GraphicPolygon
     */
    public GraphicPolygon()
    {
        // initialise instance variables
       
    }
    public GraphicPolygon(int numSides, double sideLength, double x, double y)
    {
        degrees = 360 / numSides;
        length = sideLength;
        xPos = x;
        yPos = y;
       
    }
    
    public void draw(){
    pen.up();    
    pen.move(xPos,yPos);
    pen.down();
    pen.move(xPos + length, yPos);
    pen.turnRight(degrees);
    }
    //for (int n = 0 ; n < length; n++){
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    

