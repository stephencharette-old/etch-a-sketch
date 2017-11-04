import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board extends World
{

    /**
     * Constructor for objects of class Board.
     * 
     */
    public Board()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 750, 1); 
        
        Stylus dotman = new Stylus();
        addObject( dotman, getWidth() / 2, getHeight() / 2 );
        
        LeftKnob edwin = new LeftKnob();
        addObject( edwin, 68, 683 );
        
        RightKnob wesley = new RightKnob();
        addObject( wesley, 833, 683 );
        
        Eraser meermans = new Eraser();
        addObject( meermans, (int)( Math.random() * 650 ) + 125, (int)( Math.random() * 475 ) + 125 );
    }
}
