package com.myapp.paint;

import com.myapp.models.ModelMenu;
import com.myapp.objects.MapObject;
import com.myapp.tools.CharacterPanel;
import com.myapp.tools.EventPanel;
import com.myapp.tools.TButton;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Paint extends Canvas {
    private Graphics graphic;

    public Paint() {
        setSize(1100, 700);
        setBackground(Color.BLACK);
        setEnabled(true);
        setVisible(true);
    }

    public void paintButton(TButton b) {
        graphic.drawImage(b.getImage(), b.getX(), b.getY(), null);
    }

    public void paintEventPanel(EventPanel panel) {
        graphic.setColor(new Color(139, 69, 19));
        graphic.fillRect(panel.getX(), panel.getY(), panel.getWidth(), panel.getHeight());
    }

    public void paintCharacterPanel(CharacterPanel panel) {
        graphic.setColor(new Color(139, 69, 19));
        graphic.fillRect(panel.getX(), panel.getY(), panel.getWidth(), panel.getHeight());
    }

    public void paintField(MapObject[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0;j < map[i].length; j++) {
                graphic.drawImage(map[i][j].getTile(), (j + 1) * 50, (i + 1) * 50, null);
            }
        }
    }

    public void paintBackgroundMenu() {
        String p = "src/assets/logo/background_menu.png";
        try {
            graphic.drawImage(ImageIO.read(new File(p)), 0, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        graphic = getGraphics();
        /*graphic.fillRect(50, 50, 800, 450);
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
         */
        addMouseListener(new ModelMenu(this));
    }
}