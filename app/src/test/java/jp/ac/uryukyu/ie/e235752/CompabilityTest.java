package jp.ac.uryukyu.ie.e235752;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CompabilityTest {
    double notVeryEffectiveNomber = 0.5;

    @Test
    void CompabilityTest(){
        Skill skill = new Skill(null, null, null, 0);
        Type type = new Type();
        Pokemon testCharizard = new Pokemon("テストのリザードン", type.fire, type.flying, 153, 104, 98, 129, 105, 120);
        testCharizard.skills.add(new Skill("かえんほうしゃ", "特殊", type.fire, 90));

        Pokemon testBlastoise = new Pokemon("テストのカメックス", type.water, type.nothing, 154, 103, 120, 105, 125, 98);

        skill.attack(testCharizard, testCharizard.skills.get(0), testBlastoise);
        assertEquals(154 - testBlastoise.hitPoint, Math.floor((22 * Math.floor(testCharizard.skills.get(0).attackAmount * testCharizard.attackOfSpecial / testBlastoise.diffenceOfSpecial) / 50 + 2) * notVeryEffectiveNomber));

        
        }
    }



