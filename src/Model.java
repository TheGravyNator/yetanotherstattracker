import java.util.List;

public class Model 
{
	private List<Player> playerlist;
	
	public void addPlayer(String name, int stamina, int shield, int gold)
	{
		playerlist.add(new Player(name, playerlist.size()+1, stamina, shield, gold));
	}
	
	public String getPlayerName(int playerNumber)
	{
		Player player = playerlist.get(playerNumber);
		return player.getName();
	}
	
	public int getPlayerStamina(int playerNumber)
	{
		Player player = playerlist.get(playerNumber);
		return player.getStamina();
	}
	
	public int getPlayerShield(int playerNumber)
	{
		Player player = playerlist.get(playerNumber);
		return player.getShield();
	}
	
	public int getPlayerGold(int playerNumber)
	{
		Player player = playerlist.get(playerNumber);
		return player.getGold();
	}
	
	public void setPlayerStamina(int playerNumber, int modifier)
	{
		Player player = playerlist.get(playerNumber);
		player.setStamina(modifier);
	}
	
	public void setPlayerShield(int playerNumber, int modifier)
	{
		Player player = playerlist.get(playerNumber);
		player.setShield(modifier);
	}
	
	public void setPlayerGold(int playerNumber, int modifier)
	{
		Player player = playerlist.get(playerNumber);
		player.setGold(modifier);
	}
}
