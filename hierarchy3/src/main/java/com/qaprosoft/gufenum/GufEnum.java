package com.qaprosoft.gufenum;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class GufEnum {
	private static final Logger LOGGER = Logger.getLogger(GufEnum.class);
	

	public static void westcoast(Pagge pagge) {
		switch (pagge) {
		case AUDIO:
			LOGGER.info("Audio");
			break;

		case VIDEO:
			LOGGER.info("Video");
			break;

		case MESSAGES:
			LOGGER.info("Messages");
			break;

		case GROUPS:
			LOGGER.info("Groups");
			break;

		default:
			LOGGER.info("GUF");
			break;
		}
	}

	public static void main(String[] args) {
		PropertyConfigurator.configure("src\\main\\java\\com\\qaprosoft\\parser\\log4j.properties");
	    
		westcoast(Pagge.AUDIO);
		westcoast(Pagge.VIDEO);
		westcoast(Pagge.MESSAGES);
		westcoast(Pagge.GROUPS);

	}
}
