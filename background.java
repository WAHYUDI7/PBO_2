import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{

    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Airplane airplane = new Airplane();
        addObject(airplane,69,247);
        Balloon balloon = new Balloon();
        addObject(balloon,560,155);
        Balloon balloon2 = new Balloon();
        addObject(balloon2,530,342);
        Balloon balloon3 = new Balloon();
        addObject(balloon3,652,256);
        Balloon balloon4 = new Balloon();
        addObject(balloon4,409,191);
        Balloon balloon5 = new Balloon();
        addObject(balloon5,341,354);
        Balloon balloon6 = new Balloon();
        addObject(balloon6,603,191);
        Balloon balloon7 = new Balloon();
        addObject(balloon7,180,239);
        Balloon balloon8 = new Balloon();
        addObject(balloon8,298,89);
        Balloon balloon9 = new Balloon();
        addObject(balloon9,673,358);
        Counter counter = new Counter();
        addObject(counter,9,11);
        Balloon balloon10 = new Balloon();
        addObject(balloon10,474,98);
        balloon.setLocation(460,263);
        balloon.setLocation(226,357);
        balloon.setLocation(179,384);
        balloon4.setLocation(344,228);
        balloon4.setLocation(342,227);
        balloon4.setLocation(342,227);
        balloon5.setLocation(358,368);
        balloon2.setLocation(510,418);
        balloon6.setLocation(484,244);
        balloon3.setLocation(604,144);
        balloon9.setLocation(641,299);
        balloon9.setLocation(641,299);
    }
}
