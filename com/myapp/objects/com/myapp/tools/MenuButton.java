package com.myapp.tools;

public class MenuButton {
    private int y;
    private int x;
    private int width;
    private int height;
    private String text;
    private int textX = 0;
    private int textY = 0;

    public MenuButton(String text, int x, int y) {
        this.text = text;
        this.x = x;
        this.y = y;
        this.height = 30;
        countWidth();
        countPositionText();
    }

    private void countWidth() {
        final int add = 10;
        width = add * text.length();
    }

    private void countPositionText() {
        final int addWidth = 5;
        textX = x + (width / text.length());
        textY = y + (height / 2) + 5;
        width = width  + (addWidth);
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getText() {
        return text;
    }

    public int getTextX() {
        return textX;
    }

    public int getTextY() {
        return textY;
    }
}