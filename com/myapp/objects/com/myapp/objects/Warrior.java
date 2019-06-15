package com.myapp.objects;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 *It's used for other whose can move, attack and get damage
 */
public class Warrior extends MapObject {

    /**Assigned field*/
    public Warrior() {
        try {
            tile = ImageIO.read(new File("src/assets/tiles/"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        damage = 30;
        hp = 150;
    }
}