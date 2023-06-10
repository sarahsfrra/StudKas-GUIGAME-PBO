/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpggame;

/**
 *
 * @author sarah
 */
public class Hero extends Character{
      private static int baseAtk;
    
    public Hero(String name, int level, int hp) {
        super(name, level, hp);
        baseAtk = 58;
    }
    
    public  void attack(Character en) {
        int atk = getLevel() * baseAtk + getWeapon().getAtk() - en.getDef() + Weapon.randomAtk(getWeapon());
        setAtk(atk);
        // jika atk negatif, maka hp lawan tidak bertambah/berkurang
        if (atk < 0)
            atk = 0;
        
        //en.hp = en.hp - atk;
        en.setHp(en.getHp()-atk);
        en.setDef(0);        
        System.out.println("HERO attack " + atk);
    }
      @Override
    public void defense(){
        //def = def + (baseAtk * level / 2);
        setDef(getDef() + (baseAtk * getLevel() / 2));
        System.out.println("HERO defense " + getDef());
    }
    
    public void heal(){
        //hp = hp + 100;
        setHp(getHp() + 100); 
        System.out.println("HERO hp " + getHp());
    }
    
    public void info(){
        System.out.println(".::HERO::.");
        System.out.println("hp : " + getHp());
        System.out.println("def : " + getDef());
        System.out.println("lev : " + getLevel());
        System.out.println("----------------");
    }
    
 
}
