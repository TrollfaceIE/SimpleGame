/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simplegame;

import Enemy.*;
import java.util.Scanner;
import Hero.*;

/**
 *
 * @author VladimirPC
 */
public class TrainingGround {
    public static void main(String[] args){
        System.out.println("Hello!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя героя: ");
        String heroName = scan.nextLine();
        
        Warrior warrior = new Warrior(heroName);
        Mage mage = new Mage(heroName);
        Archer archer = new Archer(heroName);
        Enemy goblin = new Enemy(100);
        
        warrior.attackEnemy(goblin);
        System.out.println("Enemy health: " + goblin.getHealth());
        mage.attackEnemy(goblin);
        System.out.println("Enemy health: " + goblin.getHealth());
        archer.attackEnemy(goblin);
        System.out.println("Enemy health: " + goblin.getHealth());
    }
}
