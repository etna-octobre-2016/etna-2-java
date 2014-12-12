package taxonomy.model.state;

import taxonomy.life.ILife;

public interface IStateChangeable extends ILife
{
	public ELifeState getState();
	
	public void setState(ELifeState lifeState);
}
