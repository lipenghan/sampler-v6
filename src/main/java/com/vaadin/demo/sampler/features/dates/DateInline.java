package com.vaadin.demo.sampler.features.dates;

import com.vaadin.demo.sampler.APIResource;
import com.vaadin.demo.sampler.Feature;
import com.vaadin.demo.sampler.NamedExternalResource;
import com.vaadin.ui.InlineDateField;

@SuppressWarnings("serial")
public class DateInline extends Feature {

    @Override
    public Version getSinceVersion() {
        return Version.OLD;
    }

    @Override
    public String getName() {
        return "Inline date selection";
    }

    @Override
    public String getDescription() {
        return "In this example, the resolution is set to be one day"
                + " and the DateField component is shown as an inline calendar"
                + " component.";
    }

    @Override
    public APIResource[] getRelatedAPI() {
        return new APIResource[] { new APIResource(InlineDateField.class) };
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<? extends Feature>[] getRelatedFeatures() {
        return new Class[] { DatePopup.class, DatePopupInputPrompt.class,
                DateLocale.class, DateResolution.class };
    }

    @Override
    public NamedExternalResource[] getRelatedResources() {
        // TODO Auto-generated method stub
        return null;
    }
}
