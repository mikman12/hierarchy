package com.qaprosoft.hierarchy.mediapages;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AudioPage")
public class AudioPage extends MediaPage {
	boolean reg;
	boolean pri;
	String name;

	@Override
	public String sendPage() {
		return "Page is clicked";
	}

	@Override
	public String getPage() {
		return "Page is readable";
	}

	private int len1;

	public AudioPage() {
	}

	public AudioPage(String reg, boolean pri, String name, int len) {
		super(reg, pri, name);
		this.len1 = len;
	}

	public int getLen() {
		return len1;
	}

	public void setLen(int len) {
		this.len1 = len;
	}

	@Override
	public String toString() {
		return "\nRegion: " + reg + "\nPrivat: " + pri;
	}
}