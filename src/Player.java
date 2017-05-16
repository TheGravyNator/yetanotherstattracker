
public class Player
{
	private String name;
	private int playernumber;
	private int stamina;
	private int shield;
	private int gold;
	
	public Player(String name, int playernumber, int stamina, int shield, int gold)
	{
		this.name = name;
		this.playernumber = playernumber;
		this.stamina = stamina;
		this.shield = shield;
		this.gold = gold;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPlayerNumber()
	{
		return playernumber;
	}
	
	public int getStamina()
	{
		return stamina;
	}
	
	public int getShield()
	{
		return shield;
	}
	
	public int getGold()
	{
		return gold;
	}
	
	public void setStamina(int stamina)
	{
		this.stamina = stamina;
	}
	
	public void setShield(int shield)
	{
		this.shield = shield;
	}
	
	public void setGold(int gold)
	{
		this.gold = gold;
	}
}
