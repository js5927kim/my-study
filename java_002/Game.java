package com.test;

public class Game {
	
	private String gameName;
	private String gameStudio;
	private String jenre;
	
	public Game() {
		
	}
	
	public Game(String gameName, String gameStudio, String jenre) {
		this.gameName = gameName;
		this.gameStudio = gameStudio;
		this.jenre = jenre;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameStudio() {
		return gameStudio;
	}

	public void setGameStudio(String gameStudio) {
		this.gameStudio = gameStudio;
	}

	public String getJenre() {
		return jenre;
	}

	public void setJenre(String jenre) {
		this.jenre = jenre;
	}
	
	public void info() {
		System.out.printf("게임 이름 : %s / 회사 : %s / 게임 장르 : %s\n",this.gameName, this.gameStudio, this.jenre);
	}
	
	
}
