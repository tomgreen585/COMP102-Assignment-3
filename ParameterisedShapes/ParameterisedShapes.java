// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102/112 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP-102-112 - 2022T1, Assignment 3
 * Name:
 * Username:
 * ID:
 */

import ecs100.*;
import java.awt.Color;
import javax.swing.JColorChooser;

/** Parameterised Shapes: 
 * Core and Completion: draw flags with three horizontal stripes
 * Challenge: draw a street of houses
 */
public class ParameterisedShapes{

    //Constants for CORE and COMPLETION  (three stripes flags)
    public static final double width = 200;
    public static final double height = 133;

    /**   CORE
     * Asks user for a position and three colours, then calls the
     * drawThreeStripesFlag method, passing the appropriate arguments
     */
    public void doSimpleFlag(){
        double left = UI.askDouble("Left of flag");
        double top = UI.askDouble("Top of flag");
        UI.println("Now choose the colours");
        Color stripe1 = JColorChooser.showDialog(null, "First Stripe", Color.white);
        Color stripe2 = JColorChooser.showDialog(null, "Second Stripe", Color.white);
        Color stripe3 = JColorChooser.showDialog(null, "Third Stripe", Color.white);
        this.drawThreeStripesFlag(left, top, stripe1, stripe2, stripe3);
    }

    /**   CORE
     * Draws a three colour flag at the given position consisting of
     * three equal size stripes of the given colors
     * The stripes are horizontal.
     * The size of the flag is specified by the constants FLAG_WIDTH and FLAG_HEIGHT
     */
    public void drawThreeStripesFlag(double left, double top, Color stripe1, Color stripe2, Color stripe3){
        UI.clearGraphics();
        double height = width * 2/3;
        double stripe1Left = top;
        double stripe2Left = top + height;
        double stripe3Left = top + height;
        
        UI.setColor(Color.black);
        UI.drawRect(top-1, left-1, width+1, height+1);
        
        UI.setColor(stripe3);
        UI.fillRect(top, stripe3Left *0.3, width, height*1);
        
        UI.setColor(stripe2);
        UI.fillRect(top, stripe2Left *0.43, width, height *2/3);
        
        UI.setColor(stripe1);
        UI.fillRect(top, stripe1Left *0.95, width, height * 1/3); 
        

    }

    /**   COMPLETION
     * Asks user for a position, three colours, three heights and whether the circles are filled.
     * Then calls the drawFancyFlag method, passing the appropriate arguments
     */
    public void doFancyFlag(){
        double left = UI.askDouble("Left of flag");
        double Top = UI.askDouble("Top of flag");
        UI.println("Now choose the colours");
        Color col1 = JColorChooser.showDialog(null, "First Stripe", Color.white);
        Color col2 = JColorChooser.showDialog(null, "Second Stripe", Color.white);
        Color col3 = JColorChooser.showDialog(null, "Third Stripe", Color.white);
        UI.println("Now choose the sizes");
        double heightcol1 = UI.askDouble("Height of first stripe");
        double heightcol2 = UI.askDouble("Height of second stripe");
        double heightcol3 = UI.askDouble("Height of third stripe");
        this.drawFancyFlag(left, Top, col1, col2, col3, heightcol1, heightcol2, heightcol3);
        /*# YOUR CODE HERE */

    }

    /**   COMPLETION
     * Calculates the total height and width of the flag.
     * The width of the flag is 1.5 times the height of the flag.
     * It then calls drawStripe three times to draw the three stripes,
     * and outlines the flag with a black rectangle.
     */
    public void drawFancyFlag(double left, double Top, Color col1, Color col2, Color col3, double heightcol1, double heightcol2, double heightcol3){
        UI.clearGraphics();
        /*# YOUR CODE HERE */
        UI.clearGraphics();
        double width = height * 1.5;
        double col1Left = Top;
        double col2Left = Top + heightcol1;
        double col3Left = Top + heightcol3;
        
        UI.setColor(Color.black);
        UI.drawRect(Top-1, left-1, width+1, height+1);
        
        UI.setColor(col3);
        UI.fillRect(Top, col3Left *0.66, width, heightcol3);
        
        UI.setColor(col2);
        UI.fillRect(Top, col2Left *0.85, width, heightcol2);
        
        UI.setColor(col1);
        UI.fillRect(Top, col1Left, width, heightcol1 * 1.35);
        
        //first top circle
        UI.setColor(Color.black);
        UI.fillOval(col1Left * 1.2, Top * 3.6/3, width * 0.1, heightcol1 * 0.35);
        
        //second top circle
        UI.setColor(Color.black);
        UI.fillOval(col2Left * 1.26, Top * 5.25/3, width * 0.05, heightcol2 * 0.16);
        
        //third circle
        UI.setColor(Color.black);
        UI.fillOval(col3Left * 1.28, Top * 6.3/3, width * 0.05, heightcol3 * 0.12); 
        
    }

    /**   COMPLETION
     * Draws a stripe at the given position that has the right circle at the right place.
     */
    public void drawStripe(/*# YOUR CODE HERE */ ){
        /*# YOUR CODE HERE */
        

    }

    public void setupGUI(){
        UI.initialise();
        UI.addButton("Clear", UI::clearPanes );
        UI.addButton("Simple Flag", this::doSimpleFlag );
        UI.addButton("Fancy Flag", this::doFancyFlag );
        // Add a button here to call your method for the challenge part
        UI.addButton("Quit", UI::quit );
    }

    public static void main(String[] args){
        ParameterisedShapes ps = new ParameterisedShapes ();
        ps.setupGUI();
    }

}
