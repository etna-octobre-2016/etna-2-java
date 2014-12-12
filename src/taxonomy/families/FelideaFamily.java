package taxonomy.families;

import taxonomy.behaviours.HunterBehaviour;
import taxonomy.classes.MammaliaClass;

public abstract class FelideaFamily extends MammaliaClass implements HunterBehaviour
{
    public void purr()
    {
        System.out.println("Grrrrrrrrrrrr :)");
    }
    public void scratch()
    {
        System.out.println("Let me leave my signature on your skin...");
    }
}
