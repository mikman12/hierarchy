
package com.qaprosoft.hierarchy.socialpages;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MessagesPage")
public class MessagesPage extends SocialPage {
	@Override
	public String sendPage() {
		return "Page is clicked";
	}

	@Override
	public String getPage() {
		return "Page is readable";
	}

	private int numOfMessages;

	public MessagesPage() {
	}

	public MessagesPage(String reg, boolean pri, String name, int numOfMessages) {
		super(reg, pri, name);
		this.numOfMessages = numOfMessages;
	}

	public int numOfMessages() {
		return numOfMessages;
	}

	public void setnumOfGroups(int numOfMessages) {
		this.numOfMessages = numOfMessages;
	}

	@Override
	public String toString() {
		return "\nnumOfMessagess: " + numOfMessages;
	}
}