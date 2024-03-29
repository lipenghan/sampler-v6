package com.vaadin.demo.sampler.features.windows;

import com.vaadin.demo.sampler.APIResource;
import com.vaadin.demo.sampler.Feature;
import com.vaadin.demo.sampler.FeatureSet;
import com.vaadin.demo.sampler.NamedExternalResource;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class SubwindowPositioned extends Feature {

    @Override
    public Version getSinceVersion() {
        return Version.OLD;
    }

    @Override
    public String getName() {
        return "Window position";
    }

    @Override
    public String getDescription() {
        return "The position of a window can be specified, or it can be centered.";
    }

    @Override
    public APIResource[] getRelatedAPI() {
        return new APIResource[] { new APIResource(Window.class) };
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<? extends Feature>[] getRelatedFeatures() {
        return new Class[] { FeatureSet.Windows.class };
    }

    @Override
    public NamedExternalResource[] getRelatedResources() {
        return null;
    }

}
