package com.qaprosoft.parser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "page")
public class Page {
	private int id;
	private String name;
	private int lengthMin;
	private String region;
	private boolean readable;
	private int numOfGroups;
	private int numOfMessages;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//    @XmlAttribute(name = "LengthMin")
	public int getlengthMin() {
		return lengthMin;
	}

	public void setlengthMin(int lengthMin) {
		this.lengthMin = lengthMin;
	}

//    @XmlAttribute(name = "Readable")
	public boolean getReadable() {
		return readable;
	}

	public void setReadable(boolean readable) {
		this.readable = readable;
	}

//    @XmlAttribute(name = "Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//    @XmlAttribute(name = "Region")
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

//    @XmlAttribute(name = "numOfGroups")
	public int getNumOfGroups() {
		return numOfGroups;
	}

	public void setNumOfGroups(int numOfGroups) {
		this.numOfGroups = numOfGroups;
	}

//    @XmlAttribute
	public int getNumOfMessages() {
		return numOfMessages;
	}

	public void setNumOfMessages(int numOfMessages) {
		this.numOfMessages = numOfMessages;
	}

	@Override
	public String toString() {
		return "Page:: name=" + this.name + " lengthMin=" + this.lengthMin + " numOfMessages=" + this.numOfMessages
				+ " region=" + this.region + " readable=" + this.readable + " numOfGroups=" + this.numOfGroups;
	}

}
