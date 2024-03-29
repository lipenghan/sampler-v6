package com.vaadin.demo.sampler.features.text;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

@SuppressWarnings("serial")
public class TextAreaExample extends HorizontalLayout implements
        Property.ValueChangeListener {

    private static final String initialText = "The quick brown fox jumps over the lazy dog.";

    private Label plainText;
    private final com.vaadin.ui.TextArea editor;

    public TextAreaExample() {
        setSpacing(true);
        setWidth("100%");

        editor = new com.vaadin.ui.TextArea(null, initialText);
        editor.setRows(20);
        editor.setColumns(20);
        editor.addListener(this);
        editor.setImmediate(true);
        addComponent(editor);

        // the TextArea is immediate, and its valueChange updates the Label,
        // so this button actually does nothing
        addComponent(new Button(">"));

        plainText = new Label(initialText);
        plainText.setContentMode(Label.CONTENT_XHTML);
        addComponent(plainText);
        setExpandRatio(plainText, 1);
    }

    /*
     * Catch the valuechange event of the textfield and update the value of the
     * label component
     */
    public void valueChange(ValueChangeEvent event) {
        String text = (String) editor.getValue();
        if (text != null) {
            // replace newline with BR, because we're using Label.CONTENT_XHTML
            text = text.replaceAll("\n", "<br/>");
        }
        plainText.setValue(text);
    }
}
