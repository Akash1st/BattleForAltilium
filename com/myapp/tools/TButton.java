package com.myapp.tools;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

public class TButton {
    private int y;
    private int x;
    private int width;
    private int height;
    private Image image;

    public TButton(String path, int x, int y) {
        this.x = x;
        this.y = y;
        width = 0;
        height = 0;
        try {
            image = ImageIO.read(new File(path));
            width = image.getWidth(null);
            height = image.getHeight(null);
        } catch (IOException e) {
            e.getStackTrace();
        }

    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public Image getImage() {
        return image;
    }

    public boolean isClick(int clickX, int clickY) {
        return (clickX >= x && clickX <= (width + x)) &&
                (clickY >= y && clickY <= (height + y));
    }
}