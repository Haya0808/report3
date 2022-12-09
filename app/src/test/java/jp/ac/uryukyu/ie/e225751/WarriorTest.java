package jp.ac.uryukyu.ie.e225751;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test void attackWithWeponSkill() {
        
        int defaultEnemyHp = 200;
        int defaultattack = 100;
        for(int count=0; count<3; count++){

            Warrior demoWarrior = new Warrior("デモ戦士", 1,defaultattack);
            Enemy slime = new Enemy("スライムもどき",defaultEnemyHp, 100);
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(defaultEnemyHp-slime.getHitPoint(),defaultattack*1.5);
        }
    }
}

