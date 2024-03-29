package com.vaadin.demo.sampler.features.windows;

import com.vaadin.demo.sampler.APIResource;
import com.vaadin.demo.sampler.Feature;
import com.vaadin.demo.sampler.FeatureSet;
import com.vaadin.demo.sampler.NamedExternalResource;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class Subwindow extends Feature {

    @Override
    public Version getSinceVersion() {
        return Version.OLD;
    }

    @Override
    public String getName() {
        return "Subwindow";
    }

    @Override
    public String getDescription() {
        return "A <i>Subwindow</i> is a popup-window within the browser window."
                + " There can be multiple subwindows in one (native) browser"
                + " window.";
    }

    @Override
    public APIResource[] getRelatedAPI() {
        return new APIResource[] { new APIResource(Window.class) };
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<? extends Feature>[] getRelatedFeatures() {
        return new Class[] { NativeWindow.class, FeatureSet.Windows.class };
    }

    @Override
    public NamedExternalResource[] getRelatedResources() {
        return null;
    }

}
