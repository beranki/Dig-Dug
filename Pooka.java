import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pooka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pooka extends Actor
{
    /**
     * Act - do whatever the Pooka wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pooka()
    {
        GreenfootImage img = getImage();
        img.scale(40, 40);
        setImage(img);
    }
    
    public void act() {}
}
