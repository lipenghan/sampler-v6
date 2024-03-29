package com.vaadin.demo.sampler.features.layouts;

import com.vaadin.demo.sampler.APIResource;
import com.vaadin.demo.sampler.Feature;
import com.vaadin.demo.sampler.NamedExternalResource;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.VerticalSplitPanel;

@SuppressWarnings("serial")
public class SplitPanelBasic extends Feature {

    @Override
    public Version getSinceVersion() {
        return Version.OLD;
    }

    @Override
    public String getName() {
        return "Split panel";
    }

    @Override
    public String getDescription() {
        return "A split panel has two resizable component areas, either vertically (VerticalSplitPanel)"
                + " or horizontally (HorizontalSplitPanel) oriented."
                + "The split position can optionally be locked.<br/>"
                + "By nesting split panels, one can make quite complicated, dynamic layouts.";
    }

    @Override
    public APIResource[] getRelatedAPI() {
        return new APIResource[] { new APIResource(HorizontalSplitPanel.class),
                new APIResource(VerticalSplitPanel.class),

        };
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<? extends Feature>[] getRelatedFeatures() {
        return new Class[] {};
    }

    @Override
    public NamedExternalResource[] getRelatedResources() {
        return null;
    }
}
