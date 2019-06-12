package com.myapp.models;

import com.myapp.paint.Paint;
import com.myapp.tools.MenuButton;

import java.awt.event.MouseEvent;

public class ModelMenu extends ModelListener {
    private MenuButton play;

    private Paint paint;

    public ModelMenu(Paint paint) {
        this.paint = paint;
        play = new MenuButton("Play", paint.getWidth() / 2, paint.getHeight() / 4);
        paintMenu();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        clickX = mouseEvent.getX();
        clickY = mouseEvent.getY();
        checkClick();
    }

    private void paintMenu() {
        paint.paintMenuButton(play);
    }

    private void checkClick() {
        if (checkButtonClick(play)) {
            actionPlay();
        }
    }

    private boolean checkButtonClick(MenuButton button) {
        return (clickX >= button.getX() && clickX <= (button.getWidth()) + button.getX()) &&
                (clickY >= button.getY() && clickY <= (button.getHeight() + button.getY()));
    }

    private void actionPlay() {
        paint.removeMouseListener(this);
        ModelGame modelGame = new ModelGame(paint);
        paint.addMouseListener(modelGame);
    }
}
