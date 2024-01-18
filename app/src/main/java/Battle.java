import jp.ac.uryukyu.ie.e235752.*;

public class Battle {
    public static void main(String[] args) {

        Pokemon charizard = new Pokemon("リザードン", fire, flying, 153, 104, 98, 129, 105, 120);
        charizard.skills.add(new Skill("かえんほうしゃ", "特殊", fire, 90));
        charizard.skills.add(new Skill("かみなりパンチ", "物理", electric, 75));
        charizard.skills.add(new Skill("ソーラービーム", "特殊", grass, 120));
        charizard.skills.add(new Skill("ドラゴンクロー", "物理", doragon, 80));

        Pokemon blastoise = new Pokemon("カメックス", water, nothing, 154, 103, 120, 105, 125, 98);
        blastoise.skills.add(new Skill("みずのはどう", "特殊", water, 60));
        blastoise.skills.add(new Skill("ラスターカノン", "特殊", steel, 80));
        blastoise.skills.add(new Skill("がんせきふうじ", "物理", rock, 60));
        blastoise.skills.add(new Skill("じしん", "物理", ground, 100));

        Skill skill = new Skill(null, null, nothing, nothing);
        skill.attack(charizard, charizard.skills.get(0), blastoise);
    }
}
