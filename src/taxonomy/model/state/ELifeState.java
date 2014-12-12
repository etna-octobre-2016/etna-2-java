package taxonomy.model.state;

public enum ELifeState 
{	
	LIFEMORT("je suis mort", null),
	LIFEADULTE("je suis adulte", LIFEMORT ),
	LIFENAISSANCE("je suis né", LIFEADULTE);

	private ELifeState	nextStepState;
	
	private String	state;
	
	private ELifeState(String state, ELifeState nextStepState)
	{
		this.state = state;
		this.nextStepState = nextStepState;
	}
	
	public String getState()	{return state;}
	
	public ELifeState getNextStepState()	{return nextStepState;}
}
