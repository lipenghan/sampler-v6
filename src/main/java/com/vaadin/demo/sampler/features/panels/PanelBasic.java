package com.vaadin.demo.sampler.features.panels;

import com.vaadin.demo.sampler.APIResource;
import com.vaadin.demo.sampler.Feature;
import com.vaadin.demo.sampler.FeatureSet;
import com.vaadin.demo.sampler.NamedExternalResource;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Panel;

@SuppressWarnings("serial")
public class PanelBasic extends Feature {

    @Override
    public Version getSinceVersion() {
        return Version.OLD;
    }

    @Override
    public String getName() {
        return "Panel";
    }

    @Override
    public String getDescription() {
        return "";

    }

    @Override
    public APIResource[] getRelatedAPI() {
        return new APIResource[] { new APIResource(Panel.class),
                new APIResource(Layout.class) };
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<? extends Feature>[] getRelatedFeatures() {
        return new Class[] { PanelLight.class, FeatureSet.Layouts.class };
    }

    @Override
    public NamedExternalResource[] getRelatedResources() {
        // TODO Auto-generated method stub
        return null;
    }

}
