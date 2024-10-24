/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hero;

import Enemy.*;

/**
 *
 * @author VladimirPC
 */
public class Mage extends Hero{
    
    public Mage(String name) {
        super(name);
    }
    
    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Mage " + this.getName() + " blasts enemy!");
        enemy.takeDamage(3);
    }
}
