/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simplegame;

import Enemy.*;
import Hero.*;
import java.util.Scanner;

/**
 *
 * @author VladimirPC
 */
public class BattleGround {
    public static void main(String[] args){
        System.out.println("Lets start our adventure.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Input hero name:");
        String heroName = scan.nextLine();
        Warrior warrior = new Warrior(heroName);
        System.out.println("Warrior " + warrior.getName() + " created!");
        Enemy monster = new Enemy(10);
        System.out.println("Lets start a fight!");
        startFight(monster, warrior);
    }
    
    public static void startFight(Enemy enemy, Hero hero){
        while (enemy.isAlive()) {
            hero.attackEnemy(enemy);
            System.out.println("Enemy health: " + enemy.getHealth());
        }
        System.out.println("Enemy was defeated!");
    }
}
