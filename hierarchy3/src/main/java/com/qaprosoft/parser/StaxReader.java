package com.qaprosoft.parser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

public class StaxReader {
	
	public static void main(String[] args) {
		String fileName = "src\\main\\resources\\XML.xml";
		List<Page> pageList = parseXML(fileName);
		for (Page page : pageList) {
			System.out.println(page.toString());
		}
	}

	private static List<Page> parseXML(String fileName) {
		List<Page> pageList = new ArrayList<Page>();
		Page audiopage = null;
		Page videopage = null;
		Page grouppage = null;
		Page messagepage = null;
		boolean audioParent = false;
		boolean videoParent = false;
		boolean groupParent = false;
		boolean messageParent = false;
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		try {
			XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
			while (xmlEventReader.hasNext()) {

				XMLEvent event = xmlEventReader.nextEvent();

				if (event.isStartElement() && event.asStartElement().getName().getLocalPart().equals("AudioPage")) {
					audiopage = new Page();
					audioParent = true;
				}
				if (audioParent == true && event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart().equals("Name")) {
						audiopage.setName(xmlEventReader.getElementText());
					} else if (event.asStartElement().getName().getLocalPart().equals("Region")) {
						audiopage.setRegion(xmlEventReader.getElementText());
					} else if (event.asStartElement().getName().getLocalPart().equals("LengthMin")) {
						audiopage.setlengthMin(Integer.parseInt(xmlEventReader.getElementText()));
					} else if (event.asStartElement().getName().getLocalPart().equals("Readable")) {
						audiopage.setReadable(Boolean.parseBoolean(xmlEventReader.getElementText()));
					}
				}
				if (event.isEndElement() && event.asEndElement().getName().getLocalPart().equals("AudioPage")) {
					pageList.add(audiopage);
					audioParent = false;
				}



				if (event.isStartElement() && event.asStartElement().getName().getLocalPart().equals("VideoPage")) {
					videopage = new Page();
					videoParent = true;
				}
				if (videoParent == true && event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart().equals("Name")) {
						videopage.setName(xmlEventReader.getElementText());
					} else if (event.asStartElement().getName().getLocalPart().equals("Region")) {
						videopage.setRegion(xmlEventReader.getElementText());
					} else if (event.asStartElement().getName().getLocalPart().equals("LengthMin")) {
						videopage.setlengthMin(Integer.parseInt(xmlEventReader.getElementText()));
					} else if (event.asStartElement().getName().getLocalPart().equals("Readable")) {
						videopage.setReadable(Boolean.parseBoolean(xmlEventReader.getElementText()));
					}
				}
				if (event.isEndElement() && event.asEndElement().getName().getLocalPart().equals("VideoPage")) {
					pageList.add(videopage);
					videoParent = false;
				}





				if (event.isStartElement() && event.asStartElement().getName().getLocalPart().equals("GroupPage")) {
					grouppage = new Page();
					groupParent = true;
				}
				if (groupParent == true && event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart().equals("Name")) {
						grouppage.setName(xmlEventReader.getElementText());
					} else if (event.asStartElement().getName().getLocalPart().equals("Region")) {
						grouppage.setRegion(xmlEventReader.getElementText());
					} else if (event.asStartElement().getName().getLocalPart().equals("NumOfGroups")) {
						grouppage.setNumOfGroups(Integer.parseInt(xmlEventReader.getElementText()));
					} else if (event.asStartElement().getName().getLocalPart().equals("Readable")) {
						grouppage.setReadable(Boolean.parseBoolean(xmlEventReader.getElementText()));
					}
				}
				if (event.isEndElement() && event.asEndElement().getName().getLocalPart().equals("GroupPage")) {
					pageList.add(grouppage);
					groupParent = false;
				}




				if (event.isStartElement() && event.asStartElement().getName().getLocalPart().equals("MessagesPage")) {
					messagepage = new Page();
					messageParent = true;
				}
				if (messageParent == true && event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart().equals("Name")) {
						messagepage.setName(xmlEventReader.getElementText());
					} else if (event.asStartElement().getName().getLocalPart().equals("Region")) {
						messagepage.setRegion(xmlEventReader.getElementText());
					} else if (event.asStartElement().getName().getLocalPart().equals("NumOfMessages")) {
						messagepage.setNumOfMessages(Integer.parseInt(xmlEventReader.getElementText()));
					} else if (event.asStartElement().getName().getLocalPart().equals("Readable")) {
						messagepage.setReadable(Boolean.parseBoolean(xmlEventReader.getElementText()));
					}
				}
				if (event.isEndElement() && event.asEndElement().getName().getLocalPart().equals("MessagesPage")) {
					pageList.add(messagepage);
					messageParent = false;
				}

			}

		} catch (FileNotFoundException | XMLStreamException e) {
			e.printStackTrace();
		}
		return pageList;
	}

}
