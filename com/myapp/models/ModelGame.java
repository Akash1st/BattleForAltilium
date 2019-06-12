package com.myapp.models;

import com.myapp.paint.Paint;

import java.awt.event.MouseEvent;

public class ModelGame extends ModelListener {
    private Paint paint;

    ModelGame(Paint paint) {
        this.paint = paint;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        clickX = mouseEvent.getX();
        clickY = mouseEvent.getY();
    }
}
