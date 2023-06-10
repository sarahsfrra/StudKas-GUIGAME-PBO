/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpggame;

/**
 *
 * @author sarah
 */
public abstract class Character {
    private int hp;
    private int def;
    private Weapon weapon;
    private int level;
    private String name;
    private int atk;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    public Character(String name) {
        def = 0;
        level = 1;
        this.name = name;
    }  
    
    public abstract void attack(Character character);
    
    public static String getReport(Character char1, Character char2, String tipeSerangan)
    {
        return "" + char1.getName() + " " + tipeSerangan + " " + char2.getName() + " dengan attack sebesar " + char1.getAtk();
    }
    
    public abstract void defense();
    
    public void setAtk(int atk)
    {
        this.atk = atk;
    }
    
    public int getAtk()
    {
        return atk;
    }
}
