package com.myapp.objects;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * This class used like an empty place on the paint field
 */
public class Grass extends MapObject {

    /**Assigned field*/
    public Grass() {
        pathTitle.append("grass.jpg");
        try {
            tile = ImageIO.read(new File(pathTitle.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}