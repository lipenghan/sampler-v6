package com.vaadin.demo.sampler.features.text;

import com.vaadin.demo.sampler.APIResource;
import com.vaadin.demo.sampler.Feature;
import com.vaadin.demo.sampler.NamedExternalResource;
import com.vaadin.ui.Component;
import com.vaadin.ui.RichTextArea;

@SuppressWarnings("serial")
public class RichTextEditor extends Feature {

    @Override
    public Version getSinceVersion() {
        return Version.OLD;
    }

    @Override
    public String getName() {
        return "Rich text area";
    }

    @Override
    public String getDescription() {
        return "The RichTextArea allows 'rich' formatting of the input.<br/>"
                + "Click the <i>Edit</i> button to edit the label content"
                + " with the RichTextArea.";
    }

    @Override
    public APIResource[] getRelatedAPI() {
        return new APIResource[] { new APIResource(RichTextArea.class) };
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<? extends Feature>[] getRelatedFeatures() {
        return new Class[] { TextArea.class, LabelRich.class };
    }

    @Override
    public NamedExternalResource[] getRelatedResources() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Component getExample() {
        return new LabelRichExample();
    }
}
