package Entities;

public class Game {

	private int id;
	private String gameName;
	private String serialNumber;
	private double gamePrice;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public double getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
		
	
}
