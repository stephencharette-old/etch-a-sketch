import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stylus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stylus extends Actor
{
    /**
     * Act - do whatever the Stylus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Arrow joshua = new Arrow();
        if ( Greenfoot.isKeyDown( "up" ) )
        {
            setRotation( 270 );
            getWorld().addObject( joshua, getX(), getY() );
            joshua.setRotation( getRotation() );
            move( 2 );
        }
        if ( Greenfoot.isKeyDown( "down" ) )
        {
            setRotation( 90 );
            getWorld().addObject( joshua, getX(), getY() );
            joshua.setRotation( getRotation() );
            move( 2 );
        }
        if ( Greenfoot.isKeyDown( "left" ) )
        {
            setRotation( 180 );
            getWorld().addObject( joshua, getX(), getY() );
            joshua.setRotation( getRotation() );
            move( 2 );
        }
        if ( Greenfoot.isKeyDown( "right" ) )
        {
            setRotation( 0 );
            getWorld().addObject( joshua, getX(), getY() );
            joshua.setRotation( getRotation() );
            move( 2 );
        }
        
        /*
         *  6) Modify the Arrow class to make them automatically be removed from the screen
            when they are outside the Etch-A-Sketch boundaries
         */
        if ( getX() >= 775 )
        {
            setLocation( 126, getY() );
        }
        if ( getX() <= 125 )
        {
            setLocation( 775, getY() );
        }
        if ( getY() >= 600 )
        {
            setLocation( getX(), 126 );
        }
        if ( getY() <= 125 )
        {
            setLocation( getX(), 600 );
        }
    }    
}
