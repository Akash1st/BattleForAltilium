package com.myapp.objects;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * <p>Warlord's class</p>
 * It's used for character whose can use armor
 */
public class Warlord extends MapObject {

    /**assigned field*/
    public Warlord() {
        this.armor = 0;
        pathTitle.append("main_human.png");
        try {
            tile = ImageIO.read(new File(pathTitle.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        hp = 300;
        damage = 50;
    }

    @Override
    public void takeDamage(int d) {
        this.hp -= (d - armor);
    }


}