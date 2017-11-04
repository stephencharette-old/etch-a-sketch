import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if ( Greenfoot.isKeyDown( "w" ) )
        {
            move( 5 );
        }
        if ( getX() <= 125 || getX() >= 775 || getY() <= 125 || getY() >= 600 )
        {
            getWorld().removeObject( this );
        }
        if ( Greenfoot.isKeyDown( "space" ) )
        {
            getWorld().removeObject( this );
        }
    }    
}
