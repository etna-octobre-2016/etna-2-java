package taxonomy.state;

import taxonomy.model.life.LifeException;

public class LifeStateMachine
{
    public static void changeState(IStateChangeable livingBeing)
    {
        livingBeing.setState(livingBeing.getState().getNextStepState());
    }
    public static void changeState(IStateChangeable livingBeing, ELifeState nextState)
    {
        livingBeing.validateStateChange(nextState);
        livingBeing.setState(nextState);
    }
}
