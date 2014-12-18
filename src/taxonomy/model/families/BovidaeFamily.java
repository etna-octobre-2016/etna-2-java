package taxonomy.model.families;

import taxonomy.behaviours.IVictimBehaviour;
import taxonomy.model.classes.MammaliaClass;

public abstract class BovidaeFamily extends MammaliaClass implements IVictimBehaviour
{
    ///////////////////////////////////////////////////////////////////////////////////////////////
    // Class methods
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public void charge()
    {
        System.out.println("Eat my horns !");
    }
}
