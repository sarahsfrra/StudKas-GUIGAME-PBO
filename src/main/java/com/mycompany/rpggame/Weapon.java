/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpggame;

/**
 *
 * @author sarah
 */
public class Weapon {
    private int atk;
    private String name;
    private boolean isBroken;
    private int condition;
    
    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public Weapon() {
        isBroken = false;
        condition = 100;
        atk = 10;
    }
    
    public void repair(){
        condition = 100;
    }
    
    public int use(){
        int attack;
        if (isBroken)
            attack = 0;
        else
            attack = atk;
        //condition = condition - 10;
        condition -= 10;
        if (condition <= 0)
            isBroken = true;
        return attack;
    }
    
    public static int randomAtk(Weapon w){
        //int random = (int) (Math.random() * 20 + 10);// 10 -30 perlu dibagi 100
        double random = (Math.random() * 0.2) + 0.1; //10% - 30%
        int randomAtk = (int)(random * w.use());
        return randomAtk;
    }
}
