package taxonomy.kingdoms;

import java.util.ArrayList;

public abstract class AnimaliaKingdom
{
    protected ArrayList     descendents = new ArrayList();

    public abstract void    addDescendent();
    public abstract void    move();
    public abstract void    reproduce();
}
