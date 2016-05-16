package wdsr.exercise5;

import wdsr.exercise5.dbClient.DBClient;

public class Main {
	
	public static void main(String[] args) {
		DBClient dbClient = new DBClient();
		dbClient.createTabels();
		dbClient.insertValues();
		dbClient.select6();
		dbClient.closeConnection();
	}

}
