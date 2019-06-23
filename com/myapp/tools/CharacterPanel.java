package com.myapp.tools;

import java.awt.Image;

public class CharacterPanel {
    private Image image;
    private int attack;
    private int defense;
    private int hp;

    public CharacterPanel() {
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public final int getX() {
        return 900;
    }

    public final int getY() {
        return 0;
    }

    public final int getWidth() {
        return 200;
    }

    public final int getHeight() {
        return 550;
    }

    public String getAttack() {
        return "Attack: " + attack;
    }

    public String getDefense() {
        return "Defense: " + defense;
    }

    public String getHp() {
        return "HP: " + hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
