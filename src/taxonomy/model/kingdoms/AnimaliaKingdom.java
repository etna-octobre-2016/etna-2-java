package taxonomy.model.kingdoms;

import taxonomy.state.ELifeState;
import taxonomy.state.IStateChangeable;

public abstract class AnimaliaKingdom implements IStateChangeable
{
    protected ELifeState    state;

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // Abstract methods
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public abstract void    eat();
    public abstract void    move();
    public abstract void    reproduce();
}
