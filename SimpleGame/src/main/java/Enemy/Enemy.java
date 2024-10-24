/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enemy;

import com.mycompany.simplegame.Mortal;

/**
 *
 * @author VladimirPC
 */
public class Enemy implements Mortal{
    private int health;
    
    public Enemy(int health){
        this.health = health;
    }
    
    public void setHealth(int health){
        this.health = health;
    }
    
    public int getHealth(){
        return this.health;
    }
    
    public void takeDamage(int damage){
        this.health -= damage;
        if (this.health < 0){
            this.health = 0;
        }
    }

    @Override
    public boolean isAlive() {
        return this.health > 0; //To change body of generated methods, choose Tools | Templates.
    }
}
