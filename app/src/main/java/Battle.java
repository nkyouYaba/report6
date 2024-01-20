import jp.ac.uryukyu.ie.e235752.*;

public class Battle {
    public static void main(String[] args) {
        Type type = new Type();
        Pokemon charizard = new Pokemon("リザードン", type.fire, type.flying, 153, 104, 98, 129, 105, 120);
        charizard.skills.add(new Skill("かえんほうしゃ", "特殊", type.fire, 90));
        charizard.skills.add(new Skill("かみなりパンチ", "物理", type.electric, 75));
        charizard.skills.add(new Skill("ソーラービーム", "特殊", type.grass, 120));
        charizard.skills.add(new Skill("ドラゴンクロー", "物理", type.dragon, 80));

        Pokemon blastoise = new Pokemon("カメックス", type.water, type.nothing, 154, 103, 120, 105, 125, 98);
        blastoise.skills.add(new Skill("みずのはどう", "特殊", type.water, 60));
        blastoise.skills.add(new Skill("ラスターカノン", "特殊", type.steel, 80));
        blastoise.skills.add(new Skill("がんせきふうじ", "物理", type.rock, 60));
        blastoise.skills.add(new Skill("じしん", "物理", type.ground, 100));

        Skill skill = new Skill(null, null, null, 0);
        skill.attack(charizard, charizard.skills.get(0), blastoise);
        skill.attack(charizard, charizard.skills.get(1), blastoise);
        skill.attack(charizard, charizard.skills.get(2), blastoise);
        skill.attack(charizard, charizard.skills.get(3), blastoise);

        skill.attack(blastoise, blastoise.skills.get(0), charizard);
        skill.attack(blastoise, blastoise.skills.get(1), charizard);
        skill.attack(blastoise, blastoise.skills.get(2), charizard);
        skill.attack(blastoise, blastoise.skills.get(3), charizard);
    }
}
