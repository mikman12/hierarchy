package com.qaprosoft.hierarchy.outmedia;

import com.qaprosoft.hierarchy.mediapages.MediaPage;
import com.qaprosoft.hierarchy.socialpages.SocialPage;

public class OutMedia {

	public static void main(String[] args) {

		MediaPage media = new MediaPage("RU", false, "Social network");
		System.out.println("Is this page MEDIA? " + media.isRegion());
		System.out.println("Is this page private or not? " + media.isPrivat());
		System.out.println("Where is this page? " + media.getName());
		System.out.println();
		SocialPage social = new SocialPage("RU", false, "Audio");
		System.out.println("Is this page of social network? " + social.isRegion());
		System.out.println("Is this page private or not? " + social.isPrivat());
		System.out.println("What is a type of the page? " + social.getName());
		System.out.println();

	}

}
