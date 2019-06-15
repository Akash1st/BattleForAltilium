package com.myapp.objects;

import java.awt.Image;

/**
 * <p>Basic class</p>
 * It's used like a pattern
 */
public abstract class MapObject {
    StringBuilder pathTitle = new StringBuilder("src/assets/tiles/");
    int damage = 0;
    int hp = 0;
    int armor = 0;
    Image tile;
    Image portrait;

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

    /**@return picture of game's tile*/
    public Image getTile() {
        return tile;
    }

    public boolean collide(Grass grass) {
        return false;
    }

    public boolean collide(Rock rock) {
        return false;
    }

    public boolean collide(Tree tree) {
        return false;
    }

    public boolean collide(Warrior warrior) {
        return false;
    }

    public boolean collide(Warlord warlord) {
        return false;
    }

    public boolean collide(Orc orc) {
        return false;
    }

    public boolean collide(LordOrc lordOrc) {
        return false;
    }
}