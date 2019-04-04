package com.qaprosoft.hierarchy.socialpages;

import javax.xml.bind.annotation.XmlRootElement;

import com.qaprosoft.hierarchy.main.CommonPage;

@XmlRootElement(name = "SocialPage")
public class SocialPage extends CommonPage {

	private String name;
	
	public SocialPage() {
	}

	public SocialPage(String reg, boolean pri, String name) {
		super(reg, pri);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\nname: " + name;
	}
}
