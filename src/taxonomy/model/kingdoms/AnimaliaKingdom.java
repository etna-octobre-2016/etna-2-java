package taxonomy.model.kingdoms;

import java.util.ArrayList;

public abstract class AnimaliaKingdom
{
    private int             age = 0;
    private ArrayList       descendents = new ArrayList();
    private boolean         isAdult = false;

    /* Abstract methods */

    public abstract void    eat();
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
