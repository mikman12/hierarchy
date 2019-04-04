package com.qaprosoft.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.codehaus.jackson.map.ObjectMapper;
import com.qaprosoft.hierarchy.main.CommonPage;

public class JaxXxson {
	public static void main(String[] args) throws IOException {
		byte[] jsonData = Files.readAllBytes(Paths.get("src\\main\\resources\\JSON.json"));
		ObjectMapper objectMapper = new ObjectMapper();
		CommonPage page = objectMapper.readValue(jsonData, CommonPage.class);
		System.out.println("Page Object\n" + page);
	}
}