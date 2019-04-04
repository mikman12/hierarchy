package com.qaprosoft.hierarchy.main;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.qaprosoft.hierarchy.mewinterface.GufReadable;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CommonPage")
public class CommonPage implements GufReadable {

	@XmlElement(name = "region")
	@JsonProperty("region")
	private String region = "RU";
	@XmlElement(name = "privat")
	@JsonProperty("privat")
	private boolean privat;

	public String errorMessage;

	private List<CommonPage> mediaPage;

	public List<CommonPage> getAction() {
		return mediaPage;
	}

	public void setAction(List<CommonPage> mediaPage) {
		this.mediaPage = mediaPage;
	}

	@JsonCreator
	public CommonPage(@JsonProperty("errorMessage") String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public CommonPage() {
	}

	public CommonPage(String reg, boolean pri) {
		this.region = reg;
		this.privat = pri;
	}

	public String isRegion() {
		return region;
	}

	@XmlElement
	public void setRegion(String region) {
		this.region = region;
	}

	public boolean isPrivat() {
		return privat;
	}

	@XmlElement
	public void setPrivat(boolean privat) {
		this.privat = privat;
	}

	@Override
	public String toString() {
		return "\nRegion: " + region + "\nPrivat: " + privat;
	}

	public String sendPage() {
		return "Link is clicked";
	}

	public String getPage() {
		return "Page is shown";
	}

	public void setName(String elementText) {
		// TODO Auto-generated method stub
		
	}

}
