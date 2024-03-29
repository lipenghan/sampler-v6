package com.vaadin.demo.sampler.features.selects;

import com.vaadin.demo.sampler.APIResource;
import com.vaadin.demo.sampler.Feature;
import com.vaadin.demo.sampler.NamedExternalResource;
import com.vaadin.ui.TwinColSelect;

@SuppressWarnings("serial")
public class TwinColumnSelect extends Feature {

    @Override
    public Version getSinceVersion() {
        return Version.V65;
    }

    @Override
    public String getName() {
        return "Twin column select (list builder)";
    }

    @Override
    public String getDescription() {
        return "The TwinColumnSelect is a multiple selection component"
                + " that shows two lists side by side. The list on the left"
                + " shows the available items and the list on the right shows"
                + " the selected items. <br><br/>You can select items"
                + " from the list on the left and either click on the >> button or press Enter to move"
                + " them to the list on the right. Items can be moved back by"
                + " selecting them and either click on the << button or press Enter.<br/>";

    }

    @Override
    public APIResource[] getRelatedAPI() {
        return new APIResource[] { new APIResource(TwinColSelect.class) };
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<? extends Feature>[] getRelatedFeatures() {
        return new Class[] { NativeSelection.class, ListSelectMultiple.class,
                ListSelectSingle.class };
    }

    @Override
    public NamedExternalResource[] getRelatedResources() {
        return new NamedExternalResource[] { new NamedExternalResource(
                "Open Source Design Pattern Library; List Builder",
                "http://www.uidesignpatterns.org/designPatterns/List-Builder") };
    }

}
