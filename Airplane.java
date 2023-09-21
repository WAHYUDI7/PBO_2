import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Airplane extends Actor
{
    /**
     * Act - do whatever the Airplane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        take();
    }
    
    public void moveAndTurn()
    {
        // Gerakkan pesawat ke depan
        move(4);
        
        // Menggunakan kontrol keyboard
        if (Greenfoot.isKeyDown("up")) {
            // Gerakkan pesawat ke atas
            setRotation(-90);
            move(4);
            setRotation(0);  // Mengembalikan orientasi pesawat ke depan
        }
        if (Greenfoot.isKeyDown("down")) {
            // Gerakkan pesawat ke bawah
            setRotation(90);
            move(4);
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("left")) {
            // Putar pesawat ke kiri
            turn(-4);
        }
        if (Greenfoot.isKeyDown("right")) {
            // Putar pesawat ke kanan
            turn(4);
        }
    }
    
    public void take()
{
    Actor balloon; // Perhatikan penggunaan huruf kecil untuk nama variabel
    balloon = getOneObjectAtOffset(0, 0, Balloon.class); // Perhatikan penggunaan huruf kecil untuk nama kelas

    if (balloon != null)
    {
        World world; // Perhatikan penggunaan huruf kecil untuk nama variabel
        world = getWorld();
        world.removeObject(balloon); // Perhatikan penggunaan huruf kecil untuk nama metode dan variabel
        addScore(); // Panggil metode addScore() yang sesuai
    }
}

public void addScore()
    {
        if(!getWorld().getObjects(Counter.class).isEmpty())
        {
            ((Counter) getWorld().getObjects(Counter.class).get(0)).add(1);
        }
    }
}

        
    

