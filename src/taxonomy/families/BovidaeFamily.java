package taxonomy.families;

import taxonomy.behaviours.IVictimBehaviour;
import taxonomy.classes.MammaliaClass;

public abstract class BovidaeFamily extends MammaliaClass implements IVictimBehaviour
{
	public void shout()
    {
        System.out.println("Shout of Bovine :)");
    }
    public void suffering()
    {
        System.out.println("I'm a poor victim of the crulty of lions...");
    }
}
