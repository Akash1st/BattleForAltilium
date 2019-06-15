package com.myapp.paint;

import com.myapp.models.ModelMenu;
import com.myapp.objects.MapObject;
import com.myapp.tools.CharacterPanel;
import com.myapp.tools.EventPanel;
import com.myapp.tools.MenuButton;

import java.awt.*;

public class Paint extends Canvas {
    private Graphics graphic;

    public Paint() {
        setSize(1100, 700);
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

    public void paintField(MapObject[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0;j < map[i].length; j++) {
                graphic.drawImage(map[i][j].getTile(), (j + 1) * 50, (i + 1) * 50, null);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        graphic = getGraphics();
        graphic.setColor(Color.BLACK);
        graphic.fillRect(50, 50, 800, 450);
        graphic.setColor(Color.WHITE);
        for (int i = 50; i < 500; i += 50) {
            for (int j = 50; j < 850; j += 50) {
                graphic.drawRect(j, i,  50, 50);
            }
        }
        graphic.setColor(Color.YELLOW);
        graphic.fillRect(0, 0, 50, 50);
        graphic.fillRect(0, 500,50, 50);
        graphic.fillRect(850, 0, 50, 50);
        graphic.fillRect(850, 500, 50, 50);
        graphic.setColor(Color.GRAY);
        graphic.fillRect(0, 50, 50, 450);
        graphic.fillRect(50, 0, 800, 50);
        graphic.fillRect(850, 50, 50, 450);
        graphic.fillRect(50, 500, 800, 50);
        graphic.setColor(Color.DARK_GRAY);
        graphic.fillRect(0, 550, 900, 116);
        graphic.fillRect(900, 0, 200, 550);
        graphic.setColor(Color.WHITE);
        graphic.fillRect(900, 550, 200, 116);
        addMouseListener(new ModelMenu(this));
    }
}