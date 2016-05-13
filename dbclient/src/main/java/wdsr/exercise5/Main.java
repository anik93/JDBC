package wdsr.exercise5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import wdsr.exercise5.dbClient.DBClient;

public class Main {
	
	private static final Logger log = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		DBClient dbClient = new DBClient();
		dbClient.createTabels();
		dbClient.insertValues();
		dbClient.select5();
	}

}
