package taxonomy.state;

import taxonomy.model.life.LifeException;

public class LifeStateMachine
{
    public static void changeState(IStateChangeable stateReference) throws LifeException
    {
        ELifeState currentState, nextState;

        currentState = stateReference.getState();
        nextState = currentState.getNextStepState();
        stateReference.validateStateChange(currentState, nextState);
        stateReference.setState(nextState);
    }
}
