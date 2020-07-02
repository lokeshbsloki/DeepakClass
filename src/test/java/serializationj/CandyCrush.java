package serializationj;

import java.io.Serializable;

public class CandyCrush implements Serializable {
	
	String name;
	int level;
	long score;
	int life;
	public CandyCrush(String name, int level, long score, int life) {
		super();
		this.name = name;
		this.level = level;
		this.score = score;
		this.life = life;
	}
	

}
