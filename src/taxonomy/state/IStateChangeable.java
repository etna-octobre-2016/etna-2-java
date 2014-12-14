package taxonomy.state;

import taxonomy.model.life.ILife;

public interface IStateChangeable extends ILife
{
	public ELifeState getState();
	
	public void setState(ELifeState lifeState);
}
