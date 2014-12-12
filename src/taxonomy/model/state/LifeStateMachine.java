package taxonomy.model.state;

import taxonomy.life.LifeException;

public class LifeStateMachine 
{
	public static void changeState(IStateChangeable stateReference) throws LifeException
	{
		stateReference.life();
		
		stateReference.setState(stateReference.getState().getNextStepState());
	}
}
