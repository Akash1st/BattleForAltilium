package com.myapp.objects;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Tree extends MapObject {


    public Tree() {
        pathTitle.append("tree.jpg");
        try {
            tile = ImageIO.read(new File(pathTitle.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
