package testAbstract;

public class Player {
	
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
	}
	
	public void play(int count) {
			level.showLevelMessage();
			level.go(count);
	}
	
}
