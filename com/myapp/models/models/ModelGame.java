package com.myapp.models;

import com.myapp.level.Level;
import com.myapp.objects.MapObject;
import com.myapp.paint.Paint;
import com.myapp.tools.CharacterPanel;
import com.myapp.tools.EventPanel;
import com.myapp.tools.TButton;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ModelGame extends ModelListener {
    private TButton left;
    private TButton top;
    private TButton right;
    private TButton down;

    private Paint paint;

    private ArrayList<ArrayList<MapObject>> map;
    private MapObject[][] visibleMap;

    private int visibleMapX;
    private int visibleMapY;

    private final int VISIBLE_MAP_WIDTH = 16;
    private final int VISIBLE_MAP_HEIGHT = 9;

    private EventPanel eventPanel;
    private CharacterPanel characterPanel;

    ModelGame(Paint paint) {
        visibleMap = new MapObject[VISIBLE_MAP_HEIGHT][VISIBLE_MAP_WIDTH];
        visibleMapX = 0;
        visibleMapY = 0;

        String pathToButtons = "src/assets/buttons/";
        left = new TButton(pathToButtons + "left.png", 0, 50);
        top = new TButton(pathToButtons + "top.png", 50, 0);
        right = new TButton(pathToButtons + "right.png", 850, 50);
        down = new TButton(pathToButtons + "down.png", 50, 500);

        this.paint = paint;
        Level level = new Level();
        map = level.getMap();
        visiblePartMap();
        paint();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        clickX = mouseEvent.getX();
        clickY = mouseEvent.getY();
        checkClick();
    }

    private void checkClick() {
        if (left.isClick(clickX, clickY)) {
            onClickLeft();
            visiblePartMap();
        }
        if (top.isClick(clickX, clickY)) {
            onClickTop();
            visiblePartMap();
        }
        if (right.isClick(clickX, clickY)) {
            onClickRight();
            visiblePartMap();
        }
        if (down.isClick(clickX, clickY)) {
            onClickDown();
            visiblePartMap();
        }
        if (isClickOnMap()) {
            onClickMap();
        }
        paint();
    }

    private void onClickLeft() {
        if (visibleMapX > 0) {
            --visibleMapX;
        }
    }

    private void onClickTop() {
        if (visibleMapY > 0) {
            --visibleMapY;
        }
    }

    private void onClickRight() {
        if (visibleMapX < (map.get(0).size() - VISIBLE_MAP_WIDTH)) {
            ++visibleMapX;
        }
    }

    private void onClickDown() {
        if (visibleMapY < (map.size() - VISIBLE_MAP_HEIGHT)) {
            ++visibleMapY;
        }
    }

    private void onClickMap() {
        int indexX = (clickX - 50) / 50;
        int indexY = (clickY - 50) / 50;
    }

    private boolean isClickOnMap() {
        return (clickX >= 50 && clickX <= (50 + (VISIBLE_MAP_WIDTH * 50))) &&
                (clickY >= 50 && clickY <= (50 + (VISIBLE_MAP_HEIGHT * 50)));
    }

    private void paint() {
        paint.paintCharacterPanel(new CharacterPanel());
        paint.paintEventPanel(new EventPanel());
        paint.paintField(visibleMap);
        paint.paintButton(left);
        paint.paintButton(top);
        paint.paintButton(right);
        paint.paintButton(down);
    }

    private void visiblePartMap() {
        for (int i = 0; i < visibleMap.length; i++) {
            for (int j = 0; j < visibleMap[i].length; j++) {
                visibleMap[i][j] = map.get(visibleMapY + i).get(visibleMapX + j);
            }
        }
    }
}
