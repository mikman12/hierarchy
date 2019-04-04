
package com.qaprosoft.hierarchy.socialpages;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GroupPage")
public class GroupPage extends SocialPage {
	@Override
	public String sendPage() {
		return "Page is clicked";
	}

	@Override
	public String getPage() {
		return "Page is readable";
	}

	private int numOfGroups;

	public GroupPage() {
	}

	public GroupPage(String reg, boolean pri, String name, int numOfGroups) {
		super(reg, pri, name);
		this.numOfGroups = numOfGroups;
	}

	public int getnumOfGroups() {
		return numOfGroups;
	}

	public void setnumOfGroups(int numOfGroups) {
		this.numOfGroups = numOfGroups;
	}

	@Override
	public String toString() {
		return "\nnumOfGroups: " + numOfGroups;
	}
}
