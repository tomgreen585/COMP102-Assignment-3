package PetShow;

// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102/112 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP-102-112 - 2022T1, Assignment 3
 * Name:
 * Username:
 * ID:
 */

import ecs100.*;
import java.util.ArrayList;

/** Program to create simple animated animal character using the
 *  Animal class.  
 */

public class PetShow{

    /** animate creates two or several animals on the window.
     *  Then animates them according to a fixed script by calling a series
     *  of methods on the animals.
     *  
     *  CORE
     */
    public void animate(){
        /*# YOUR CODE HERE */
        Animal b1 = new Animal("dinosaur", "Rex", 100, 150);
        Animal b2 = new Animal("dog", "Iggy", 400,150);
        b1.introduce("Hey there");
        b1.jump(90);
        b2.introduce("Hello");
        b2.goRight(20);
        b2.jump(40);
        b1.speak("Knock, Knock");
        b1.speak("Knock, Knock");
        b2.speak("Who's there?");
        b2.speak("Who's there?");
        b1.speak("Bark, Bark, Bark");
        b1.speak("Bark, Bark, Bark");
        b2.goLeft(80);
        b2.speak("Cheap joke bro");
        b2.speak("Cheap joke bro"); //sorry I thought it was funny

    }

    /** threeAnimalsRoutine creates three animals on the window.
     *  Then makes each animal do the same routine in turn.
     *  You should define a routine method, and threeAnimalsRoutine
     *   should call the routine method three times, to make
     *   each of the three animals perform the routine in turn.
     *   
     *   COMPLETION
     */
    public void threeAnimalsRoutine(){
        /*# YOUR CODE HERE */
        Animal b1 = new Animal("dog", "Iggy", 100, 150);
        Animal b2 = new Animal("snake", "JJ", 300, 150);
        Animal b3 = new Animal("bird", "Vik", 500, 150);
        this.routine(b1);
        this.routine(b2);
        this.routine(b3);
        
}
    /** makes the animal character do a little routine
     */
    public void routine (Animal B){
    /*# YOUR CODE HERE */
    B.goRight(30);
    B.jump(50);
    B.goLeft(40);
    B.jump(50);
    B.speak("Look at us move it!");
    B.goRight(50);
    B.speak("Now for you...");
    B.jump(60);
    
}
    /** Make buttons to let the user run the methods */
    public void setupGUI(){
        UI.initialise();
        UI.addButton("Clear", UI::clearGraphics );
        UI.addButton("Animate", this::animate );
        UI.addButton("Three", this::threeAnimalsRoutine );
        UI.addButton("Quit", UI::quit );
        UI.setDivider(0);       // Expand the graphics area
    }

    public static void main(String[] args){
        PetShow ps = new PetShow();
        ps.setupGUI();
    }
}

