package com.myapp.objects;

/**
 *It's used for other whose can move, attack and get damage
 */
public class Warrior extends Point {

    /**Assigned field*/
    public Warrior(int y, int x, int damage, int hp) {
        super(y, x);
        this.damage = damage;
        this.hp = hp;
    }
}