import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends Actor
{
    /**
     * Act - do whatever the Space wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Space(Color color)
    {
        GreenfootImage image = new GreenfootImage(5, 5);
        image.setColor(color);
        image.fill();
        setImage(image);
    }
}
