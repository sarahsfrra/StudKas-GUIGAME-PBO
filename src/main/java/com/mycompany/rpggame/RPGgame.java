/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpggame;

import java.io.File;
import javax.swing.JFrame;

/**
 *
 * @author sarah
 */
public class RPGgame {

    public static void main(String[] args) {
        File f = new File("./images/resize.jpg");
        System.out.println(f.getAbsolutePath());
        Apayah apa = new Apayah();
    } 
    
    public static void Main(){
        Hero h = new Hero("Liz", 1, 100);
        Enemy e = new Enemy("Sarah", 1, 100);
        
        //h.setWeapon = new Weapon();
        h.setWeapon(new Weapon());
        h.getWeapon().setName("PEDANG");
        h.getWeapon().setAtk(5);
        
        e.setWeapon(new Weapon());
        e.getWeapon().setName("PANAH");
        e.getWeapon().setAtk(4);
        
        while(true) {
            // pertandingan dimulai hingga salah satu hp-nya 0
            // serangan dilakukan secara bergantian, 
            // hero terlebih dahulu menyerang enemy
            // hero menyerang enemy secara random
            int randAttackHero = (int)(Math.random() * 10) % 3;
            switch (randAttackHero) {
                case 0: h.attack(e);
                        break;
                case 1: h.defense();
                        break;
                case 2: h.heal();
                        break;
            } 
            e.info();
            // cek kondisi game menang atau kalah
            if (e.getHp() <= 0) {
                System.out.println("Selamat Anda Menang! VICTORY!!!");
                break;
            }
            
            // enemy menyerang hero secara random
            int randAttackEnemy = (int)(Math.random() * 10) % 3;
            switch (randAttackEnemy) {
                case 0: e.attack(h);
                        break;
                case 1: e.defense();
                        break;
                case 2: e.remedy();
                        break;
            }
            h.info();
            // cek kondisi game menang atau kalah            
            if (h.getHp() <= 0) {
                System.out.println("Yaaa Kalah! DEFEAT!!!");
                break;
            }
        }
    }
}

