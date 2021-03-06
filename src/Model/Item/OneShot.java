package Model.Item;


import Model.Entity.Stats.Effect;
import Model.Location;

import java.awt.image.BufferedImage;

/**
 * Created by Wimberley on 2/2/16.
 */
public class OneShot extends Item {

    // constructor in Item
    public OneShot(BufferedImage image, int id, Location location, ItemsEnum type, String name, String description, Effect[] effects) {
        super(image, id, location, type, name, description, effects);
    }


    @Override
    public void onInteract() {
        // apply effect
        location = null;
    }

}
