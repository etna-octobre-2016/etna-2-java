package taxonomy.kingdoms;

import java.util.ArrayList;

public abstract class AnimaliaKingdom
{
    protected int           age = 0;
    protected ArrayList     descendents = new ArrayList();
    protected boolean       isAdult = false;

    /* Abstract methods */

    public abstract void    addDescendent();
    public abstract void    move();
    public abstract void    reproduce();

    /* Getters */

    public int              getAge()
    {
        return this.age;
    }
    public boolean          isAdult()
    {
        return this.isAdult;
    }

    /* Setters */

    public void             setAge(int age)
    {
        this.age = age;
    }
    public void             setAdult(boolean isAdult)
    {
        this.isAdult = isAdult;
    }
}
