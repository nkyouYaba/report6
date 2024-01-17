package jp.ac.uryukyu.ie.e235752;

public class Skill {
    String name;
    String skillPattern;
    int attackAmount;
    int attackType;

    public Skill(String name, String skillPattern, int attackType, int attackAmount) {
        this.name = name;
        this.skillPattern = skillPattern;
        this.attackType = attackType;
        this.attackAmount = attackAmount;
    }

    public void attack(Pokemon partnerPokemon, Skill partnerSkill, Pokemon opponentPokemon){
        System.out.println(opponentPokemon.hitPoint);
        if(partnerSkill.skillPattern == "物理"){
            opponentPokemon.hitPoint -= Math.floor(22 * Math.floor(partnerSkill.attackAmount * partnerPokemon.attackOfPhisical / opponentPokemon.diffenceOfPhisical) / 50 + 2);
        }
        if(partnerSkill.skillPattern == "特殊"){
            opponentPokemon.hitPoint -= Math.floor(22 * Math.floor(partnerSkill.attackAmount * partnerPokemon.attackOfSpecial / opponentPokemon.diffenceOfSpecial) / 50 + 2);
        }
        System.out.println(opponentPokemon.hitPoint);
    }
}
