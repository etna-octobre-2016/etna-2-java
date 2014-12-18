package taxonomy.behaviours;

import taxonomy.model.life.LifeException;
import taxonomy.state.IStateChangeable;

public interface ILivingBehaviour extends IStateChangeable
{
    public void born() throws LifeException;

    public void growUp() throws LifeException;

    public void die() throws LifeException;
}
