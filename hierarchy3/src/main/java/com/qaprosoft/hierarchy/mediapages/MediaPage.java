package com.qaprosoft.hierarchy.mediapages;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.qaprosoft.hierarchy.main.CommonPage;

@XmlRootElement(name = "MediaPage")
public class MediaPage extends CommonPage {

	private String name;

	public MediaPage() {
	}

	public MediaPage(String reg, boolean pri, String name) {
		super(reg, pri);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\nName: " + name;
	}
}