package com.myapp.paint;

import com.myapp.models.ModelMenu;
import com.myapp.tools.CharacterPanel;
import com.myapp.tools.EventPanel;
import com.myapp.tools.MenuButton;

import java.awt.*;

public class Paint extends Canvas {
    private Graphics graphic;

    public Paint() {
        setSize(1280, 720);
        setBackground(Color.BLUE);
        setEnabled(true);
        setVisible(true);
    }

    public void paintMenuButton(MenuButton b) {
        graphic.setColor(Color.YELLOW);
        graphic.drawRect(b.getX(), b.getY(), b.getWidth(), b.getHeight());
        graphic.drawString(b.getText(), b.getTextX(), b.getTextY());
    }

    public void paintEventPanel(EventPanel panel) {

    }

    public void paintCharacterPanel(CharacterPanel panel) {

    }

    public void paintField() {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        graphic = getGraphics();
        graphic.setColor(Color.BLACK);
        graphic.fillRect(0, 0, 500, 500);
        graphic.setColor(Color.YELLOW);
        graphic.drawString("Smth", 0, 10);
        addMouseListener(new ModelMenu(this));
    }
}