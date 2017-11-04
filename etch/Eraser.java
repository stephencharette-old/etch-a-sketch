import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eraser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eraser extends Actor
{
    /**
     * Act - do whatever the Eraser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move( 2 );
        turn( 10 );
        if ( Math.random() < 0.01 )
        {
            setLocation( (int)( Math.random() * 650 ) + 125, (int)( Math.random() * 475 ) + 125 );
        }
        if ( isTouching( Arrow.class ) )
        {
            removeTouching( Arrow.class );
        }
    }    
}
