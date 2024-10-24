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
public class Archer extends Hero{
    
    public Archer(String name) {
        super(name);
    }
    
    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Archer " + this.getName() + " shoots enemy");
        enemy.takeDamage(2);
    }
}
