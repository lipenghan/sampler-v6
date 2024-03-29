package com.vaadin.demo.sampler.features.selects;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.demo.sampler.ExampleUtil;
import com.vaadin.ui.AbstractSelect;
import com.vaadin.ui.AbstractSelect.Filtering;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class ComboBoxContainsExample extends VerticalLayout implements
        Property.ValueChangeListener {

    public ComboBoxContainsExample() {
        setSpacing(true);

        // Creates a new combobox using an existing container
        ComboBox l = new ComboBox("Please select your country",
                ExampleUtil.getISO3166Container());

        // Sets the combobox to show a certain property as the item caption
        l.setItemCaptionPropertyId(ExampleUtil.iso3166_PROPERTY_NAME);
        l.setItemCaptionMode(AbstractSelect.ITEM_CAPTION_MODE_PROPERTY);

        // Sets the icon to use with the items
        l.setItemIconPropertyId(ExampleUtil.iso3166_PROPERTY_FLAG);

        // Set a reasonable width
        l.setWidth(350, UNITS_PIXELS);

        // Set the appropriate filtering mode for this example
        l.setFilteringMode(Filtering.FILTERINGMODE_CONTAINS);
        l.setImmediate(true);
        l.addListener(this);

        // Disallow null selections
        l.setNullSelectionAllowed(false);

        addComponent(l);
    }

    /*
     * Shows a notification when a selection is made.
     */
    public void valueChange(ValueChangeEvent event) {
        Property selected = ExampleUtil.getISO3166Container()
                .getContainerProperty(event.getProperty().toString(), "name");
        getWindow().showNotification("Selected country: " + selected);
    }
}
