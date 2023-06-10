/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpggame;

/**
 *
 * @author sarah
 */
public class Enemy extends Character{
     public static int baseAtk;
    
    public Enemy(String name, int level, int hp) {
        super(name, level, hp);
        baseAtk = 46;
    }
    
    public void attack(Character h) {
        int atk = getLevel() * baseAtk + getWeapon().getAtk() - h.getDef() + Weapon.randomAtk(getWeapon());
        setAtk(atk);
        // jika atk negatif, maka hp lawan tidak bertambah/berkurang
        if (atk < 0)
            atk = 0;
        
        //en.hp = en.hp - atk;
        h.setHp(h.getHp() - atk);
        h.setDef(0);
        System.out.println("ENEMY attack " + atk);
    }
    
    @Override
    public void defense(){
        //def = def + (baseAtk * level / 2);
        setDef(getDef() + (baseAtk * getLevel() / 2));
        System.out.println("ENEMY defense " + getDef());
    }
    
    public void remedy(){
        setHp(getHp() + 100); 
        System.out.println("ENEMY hp " + getHp());
    }
    
    public void info(){
        System.out.println(".::ENEMY::.");
        System.out.println("hp : " + getHp());
        System.out.println("def : " + getDef());
        System.out.println("lev : " + getLevel());
        System.out.println("----------------");
    }
}
