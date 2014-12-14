package taxonomy.state;

import taxonomy.model.life.LifeException;

public class LifeStateMachine
{
    public static void changeState(IStateChangeable livingBeing, ELifeState nextState) throws LifeException
    {
        livingBeing.validateStateChange(nextState);
        livingBeing.setState(nextState);
    }

    public static void changeState(IStateChangeable livingBeing)
    {
        changeState(livingBeing, ELifeState.LIFENAISSANCE);
    }
}
