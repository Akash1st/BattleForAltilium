package com.myapp.objects;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Rock extends MapObject {

    public Rock() {
        pathTitle.append("rock.jpg");
        try {
            tile = ImageIO.read(new File(pathTitle.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
