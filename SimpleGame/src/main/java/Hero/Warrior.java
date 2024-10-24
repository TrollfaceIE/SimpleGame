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
public class Warrior extends Hero {
    
    public Warrior(String name) {
        super(name);
    }
    
    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Warrior " + this.getName() + " smashes enemy!");
        enemy.takeDamage(3);
    }
}
