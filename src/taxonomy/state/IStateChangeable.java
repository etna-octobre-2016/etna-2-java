package taxonomy.state;

import taxonomy.model.life.LifeException;

public interface IStateChangeable
{
    public ELifeState getState();

    public void setState(ELifeState state);

    public void validateStateChange(ELifeState currentState, ELifeState nextStep) throws LifeException;
}
