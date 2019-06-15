package com.myapp.models;

import com.myapp.objects.Grass;
import com.myapp.objects.MapObject;
import com.myapp.objects.Rock;
import com.myapp.objects.Tree;
import com.myapp.paint.Paint;

import java.awt.event.MouseEvent;

public class ModelGame extends ModelListener {
    private Paint paint;

    ModelGame(Paint paint) {
        this.paint = paint;
        MapObject[][] map = new MapObject[9][16];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == 3 && j == 2) {
                    map[i][j] = new Tree();
                    continue;
                }
                if (i == 1 && j == 1) {
                    map[i][j] = new Rock();
                    continue;
                }
                map[i][j] = new Grass();
            }
        }
        paint.paintField(map);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        clickX = mouseEvent.getX();
        clickY = mouseEvent.getY();
    }
}
