import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 800, 1); 
        loadWorld();
        Dug dug = new Dug();
        addObject(dug, getWidth()/2, getHeight()/8-dug.getImage().getHeight()/2);
    }
    
    private void loadWorld() {
        GreenfootImage sky = new GreenfootImage(getWidth(), getHeight()/8);
        sky.setColor(new Color(0,2,140));
        sky.fill();
        setBackground(sky);
        
        for (int i = 0; i < getWidth()/5; i++) {
            for (int w = 0; w <= getHeight()*7/8/5; w++) {
                EmptySpace empty_space = new EmptySpace();
                addObject(empty_space, 5/2 + 5*i, getHeight()/8 + 5/2 + 5*w);
                
                GridSpace space = new GridSpace();
                addObject(space, 5/2 + 5*i, getHeight()/8 + 5/2 + 5*w);
            }
        }
        
        
    }
}
