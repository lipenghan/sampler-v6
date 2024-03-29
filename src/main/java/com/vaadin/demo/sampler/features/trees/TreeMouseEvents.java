package com.vaadin.demo.sampler.features.trees;

import com.vaadin.demo.sampler.APIResource;
import com.vaadin.demo.sampler.ExampleUtilResource;
import com.vaadin.demo.sampler.Feature;
import com.vaadin.demo.sampler.NamedExternalResource;
import com.vaadin.ui.Tree;

@SuppressWarnings("serial")
public class TreeMouseEvents extends Feature {

    @Override
    public Version getSinceVersion() {
        return Version.OLD;
    }

    @Override
    public String getName() {
        return "Tree, mouse events";
    }

    @Override
    public String getDescription() {
        return "In this example, selecting items from the tree"
                + " is disabled. Instead, another method of selection"
                + " is used. Using the ItemClickEvent, we can update the"
                + " label showing the selection."
                + "<br>Try to click your left, right and middle mouse"
                + " buttons on the tree items. Any modifier keys will"
                + " also be detected.";
    }

    @Override
    public APIResource[] getRelatedAPI() {
        return new APIResource[] { new APIResource(Tree.class) };
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<? extends Feature>[] getRelatedFeatures() {
        return new Class[] { TreeSingleSelect.class, TreeMultiSelect.class,
                TreeActions.class };
    }

    @Override
    public NamedExternalResource[] getRelatedResources() {
        return new NamedExternalResource[] { new ExampleUtilResource() };
    }
}
