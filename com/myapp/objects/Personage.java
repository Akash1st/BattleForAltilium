package com.myapp.objects;

/**
 * <p>Main person's class</p>
 * It's used for characters whose can use armor
 */
public class Personage extends Warrior {

    /**assigned field*/
    public Personage(int y, int x, int damage , int hp) {
        super(y, x, damage, hp);
        this.armor = 0;
    }

    @Override
    public void takeDamage(int d) {
        this.hp -= (d - armor);
    }
}