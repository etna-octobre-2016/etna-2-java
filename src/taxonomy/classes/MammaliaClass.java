package taxonomy.classes;

import taxonomy.kingdoms.AnimaliaKingdom;

public abstract class MammaliaClass extends AnimaliaKingdom
{
    public void suckle()
    {
        if (!this.isAdult())
        {
            System.out.println("Yummy! Thanks mom");
        }
        else
        {
            System.out.println("No, I am not creepy...");
        }
    }
}
