package com.vaadin.demo.sampler.features.buttons;

import com.vaadin.demo.sampler.APIResource;
import com.vaadin.demo.sampler.Feature;
import com.vaadin.demo.sampler.NamedExternalResource;
import com.vaadin.demo.sampler.features.blueprints.ProminentPrimaryAction;
import com.vaadin.ui.Button;

@SuppressWarnings("serial")
public class ButtonPush extends Feature {

    @Override
    public Version getSinceVersion() {
        return Version.V68;
    }

    @Override
    public String getName() {
        return "Push button";
    }

    @Override
    public String getDescription() {
        return "A push-button, which can be considered a 'regular' button,"
                + " returns to its 'unclicked' state after emitting an event"
                + " when the user clicks it.";
    }

    @Override
    public APIResource[] getRelatedAPI() {
        return new APIResource[] { new APIResource(Button.class) };
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<? extends Feature>[] getRelatedFeatures() {
        return new Class[] { ButtonLink.class, CheckBoxes.class,
                ProminentPrimaryAction.class };
    }

    @Override
    public NamedExternalResource[] getRelatedResources() {
        // TODO Auto-generated method stub
        return null;
    }

}
