package com.vaadin.demo.sampler.features.embedded;

import com.vaadin.terminal.ExternalResource;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class FlashEmbedExample extends VerticalLayout {

	String url = "http://player.youku.com/player.php/sid/XNjM5OTU0NjA0/v.swf";

	public FlashEmbedExample() {
		// "http://www.youtube.com/v/meXvxkn1Y_8&hl=en_US&fs=1&"
		Embedded e = new Embedded(null, new ExternalResource(url));
		e.setAlternateText("Vaadin Eclipse Quickstart video");
		e.setMimeType("application/x-shockwave-flash");
		e.setParameter("allowFullScreen", "true");
		// e.setWidth("320px");
		// e.setHeight("265px");
		addComponent(e);
	}
}