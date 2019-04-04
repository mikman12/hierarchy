package com.qaprosoft.parser;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.qaprosoft.hierarchy.main.CommonPage;

public class Jaxb {
	private static final Logger LOGGER = Logger.getLogger(Jaxb.class);

	public static void main(String[] args) {
		try {

			PropertyConfigurator.configure(
					"src\\main\\java\\com\\qaprosoft\\parser\\log4j.properties");
			File file = new File("src\\main\\resources\\XML1.xml");

			JAXBContext context = JAXBContext.newInstance(CommonPage.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			CommonPage page = (CommonPage) unmarshaller.unmarshal(file);
			System.out.println(page);
		} catch (JAXBException ex) {
			LOGGER.info(ex.getMessage());
		}

	}
}
