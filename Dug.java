import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dug extends Actor
{
    /**
     * Act - do whatever the Dug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter = 0;
    int dx = 0;
    int dy = 0;
    GreenfootImage img = getImage();
    public Dug() {
        img.scale(40, 40);
        setImage(img);
    }
    
    public void act()
    {
        dx = 0;
        dy = 0;
        
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) {
            counter++;
            setRotation(0);
            dx = 2;
            dy = 0;
            setImage(img);
        } if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")) {
            counter++;
            setRotation(0);
            dx = -2;
            dy = 0;
        }
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")) {
            counter++;
            dx = 0;
            dy = -2;
            setRotation(270);
            
        } if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")) {
            counter++;
            dx = 0;
            dy = 2;
            setRotation(90);
        } 
        if (getOneIntersectingObject(GridSpace.class) != null) {
            getWorld().removeObjects(getObjectsInRange(getImage().getHeight()/2, GridSpace.class));
            if (counter % 10 == 0) {
                img = new GreenfootImage("dug_slash_1.PNG");
            }   
            if (counter % 10 == 5) {
                img = new GreenfootImage("dug_slash_2.PNG");
            }
        } else {
            if (counter % 10 == 0) {
                img = new GreenfootImage("dug_walk_1.png");
            }   
            if (counter % 10 == 5) {
                img = new GreenfootImage("dug_walk_2.PNG");
            }
        }

        img.scale(40,40);
        setLocation(getX() + dx, getY() + dy);
        setImage(img);
    }
}
