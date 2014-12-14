package taxonomy.model.families;

import taxonomy.model.behaviours.HunterBehaviour;
import taxonomy.model.classes.MammaliaClass;

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
