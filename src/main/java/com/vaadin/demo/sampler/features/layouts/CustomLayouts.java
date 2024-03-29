package com.vaadin.demo.sampler.features.layouts;

import com.vaadin.demo.sampler.APIResource;
import com.vaadin.demo.sampler.Feature;
import com.vaadin.demo.sampler.NamedExternalResource;
import com.vaadin.ui.CustomLayout;

@SuppressWarnings("serial")
public class CustomLayouts extends Feature {

    @Override
    public Version getSinceVersion() {
        return Version.OLD;
    }

    @Override
    public String getName() {
        return "Custom layout";
    }

    @Override
    public String getDescription() {
        return "The CustomLayout allows you to make a layout in regular HTML,"
                + " using styles and embedding images to suit your needs."
                + " You can even make the layout using a WYSIWYG editor.<br/>"
                + " Marking an area in the HTML as a named <i>location</i>"
                + " will allow you to replace that area with a component later."
                + "<br/>HTML prototypes can often be quickly converted into a"
                + " working application this way, providing a clear path from"
                + " design to implementation.";
    }

    @Override
    public APIResource[] getRelatedAPI() {
        return new APIResource[] { new APIResource(CustomLayout.class) };
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<? extends Feature>[] getRelatedFeatures() {
        return new Class[] { WebLayout.class, ApplicationLayout.class };
    }

    @Override
    public NamedExternalResource[] getRelatedResources() {
        return new NamedExternalResource[] { new NamedExternalResource(
                "Layout HTML (view source)", getThemeBase()
                        + "layouts/examplecustomlayout.html") };
    }
}
