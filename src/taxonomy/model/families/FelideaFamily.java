package taxonomy.model.families;

import taxonomy.behaviours.IHunterBehaviour;
import taxonomy.model.classes.MammaliaClass;

public abstract class FelideaFamily extends MammaliaClass implements IHunterBehaviour
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
