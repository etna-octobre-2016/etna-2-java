package taxonomy.state;

public enum ELifeState
{
    LIFEMORT("je suis mort", null),
    LIFEADULTE("je suis adulte", LIFEMORT),
    LIFENAISSANCE("Born to be alive.", LIFEADULTE);

    private ELifeState nextState;

    private String stateDescription;

    private ELifeState(String stateDescription, ELifeState nextStepState)
    {
        this.stateDescription = stateDescription;
        this.nextState = nextStepState;
    }

    public String getStateDescription()
    {
        return stateDescription;
    }

    public ELifeState getNextState()
    {
        return nextState;
    }
}
