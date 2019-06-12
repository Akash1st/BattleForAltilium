package com.myapp.objects;

import java.awt.*;

/**
 * <p>Basic class</p>
 * It's used like a pattern
 */
public abstract class Character {
    int y = 0;
    int x = 0;
    int damage = 0;
    int hp = 0;
    int armor = 0;
    String picture = "";
    boolean choose = false;
    public final int SIDE_LENGTH = 50;

    /**@return y coordinate*/
    public int getY() {
        return this.y;
    }

    /**@return x coordinate*/
    public int getX() {
        return this.x;
    }

    /**set y coordinate
     * @param y is y coordinate*/
    public void setY(int y) {
        this.y = y;
    }

    /**set x coordinate
     * @param x is x coordinate*/
    public void setX(int x) {
        this.x = x;
    }

    /**@return other's hp*/
    public int getHp() {
        return hp;
    }

    /**@return other's damage */
    public int getDamage() {
        return damage;
    }

    /** set damage to this object
     * @param d is damage point*/
    public void takeDamage(int d) {
        this.hp -= d;
    }

    /**@return armor's point*/
    public int getArmor() {
        return armor;
    }

    /**set armor's point
     * @param a is armor's point*/
    public void setArmor(int a) {
        this.armor = a;
    }

    /**@return path to picture*/
    public String getPicture() {
        return picture;
    }

    /**@param p set path to picture*/
    public void setPicture(String p) {
        this.picture = p;
    }

    /***/
    public boolean getChoose() {
        return choose;
    }

    /***/
    public void setChoose(boolean c) {
        this.choose = c;
    }
}