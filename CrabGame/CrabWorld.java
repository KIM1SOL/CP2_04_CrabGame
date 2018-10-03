import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        // Crab 1마리 (231, 203) 좌표에 추가
        Crab Crab01 = new Crab();
        addObject(Crab01, 231, 203);
        
        // Worm 10마리 랜덤 좌표에 추가
        Worm Worm01 = new Worm();
        Worm Worm02 = new Worm();
        Worm Worm03 = new Worm();
        Worm Worm04 = new Worm();
        Worm Worm05 = new Worm();
        Worm Worm06 = new Worm();
        Worm Worm07 = new Worm();
        Worm Worm08 = new Worm();
        Worm Worm09 = new Worm();
        Worm Worm10 = new Worm();
        
        addObject(Worm01, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        addObject(Worm02, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        addObject(Worm03, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        addObject(Worm04, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        addObject(Worm05, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        addObject(Worm06, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(600));
        addObject(Worm07, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(600));
        addObject(Worm08, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(600));
        addObject(Worm09, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(600));
        addObject(Worm10, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(600));
        
      
        // Lobster 3마리 추가
        // 각 좌표는 (334, 65), (481, 481), (79, 270)
        Lobster Lobster01 = new Lobster();
        Lobster Lobster02 = new Lobster();
        Lobster Lobster03 = new Lobster();
        
        addObject(Lobster01, 334, 65);
        addObject(Lobster02, 481, 481);
        addObject(Lobster03, 79, 270);
        
        // 100을 세고 움직이는 Turtle 추가
        // 좌표는 랜덤
        Turtle turtle01 = new Turtle(100);
        addObject(turtle01,  Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(600));
        
        
    }
}
