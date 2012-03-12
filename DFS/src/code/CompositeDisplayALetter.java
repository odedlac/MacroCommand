package code;

import java.util.ArrayList;

public class CompositeDisplayALetter implements DisplayALetter {

    //Collection of child graphics.
    private ArrayList<DisplayALetter> displayALetterChildren = new ArrayList<DisplayALetter>();
 
    @Override
    public void displayYourLetter() {
        for (DisplayALetter displayALetter : displayALetterChildren) {
        	displayALetter.displayYourLetter();
        }
    }
 
    //Adds the graphic to the composition.
    public void add(DisplayALetter displayALetter) {
    	displayALetterChildren.add(displayALetter);
    }
 
    //Removes the graphic from the composition.
    public void remove(DisplayALetter displayALetter) {
    	displayALetterChildren.remove(displayALetter);
    }
}
