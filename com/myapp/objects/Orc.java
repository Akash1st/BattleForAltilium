package com.myapp.objects;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Orc extends MapObject {

    public Orc() {
        pathTitle.append("second_orc.png");
        try {
            tile = ImageIO.read(new File(pathTitle.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        damage = 30;
        hp = 150;
    }
}
