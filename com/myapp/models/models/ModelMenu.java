package com.myapp.models;

import com.myapp.paint.Paint;
import com.myapp.tools.TButton;

import java.awt.event.MouseEvent;

public class ModelMenu extends ModelListener {
    private TButton play;

    private Paint paint;

    public ModelMenu(Paint paint) {
        this.paint = paint;
        play = new TButton("src/assets/buttons/play.png", (paint.getWidth() * 55) / 80, paint.getHeight() / 4);
        paintMenu();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        clickX = mouseEvent.getX();
        clickY = mouseEvent.getY();
        checkClick();
    }

    private void paintMenu() {
        paint.paintBackgroundMenu();
        paint.paintButton(play);
    }

    private void checkClick() {
        if (play.isClick(clickX, clickY)) {
            onClickPlay();
        }
    }

    private void onClickPlay() {
        paint.removeMouseListener(this);
        ModelGame modelGame = new ModelGame(paint);
        paint.addMouseListener(modelGame);
    }
}
