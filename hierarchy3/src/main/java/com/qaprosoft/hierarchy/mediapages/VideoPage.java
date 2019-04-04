
package com.qaprosoft.hierarchy.mediapages;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "VideoPage")
public class VideoPage extends MediaPage {
	@Override
	public String sendPage() {
		return "Page is clicked";
	}

	@Override
	public String getPage() {
		return "Page is readable";
	}

	private int len1;

	public VideoPage() {
	}

	public VideoPage(String reg, boolean pri, String name, int len1) {
		super(reg, pri, name);
		this.len1 = len1;
	}

	public int getLen1() {
		return len1;
	}

	public void setLen(int len1) {
		this.len1 = len1;
	}

	@Override
	public String toString() {
		return "\nLen1: " + len1;
	}
}