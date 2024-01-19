package jp.ac.uryukyu.ie.e235752;

public class Skill {
    String name;
    String skillPattern;
    int attackAmount;
    String attackType;
    
    public Skill(String name, String skillPattern, String attackType, int attackAmount) {
        this.name = name;
        this.skillPattern = skillPattern;
        this.attackType = attackType;
        this.attackAmount = attackAmount;
    }
    
    Type type = new Type();
    public double typeCompatibility(String attackType, String diffenceType) {
        if(attackType == type.electric && diffenceType == type.water) {//-----------------------------------------------
            return 2.0;
        } else if (attackType == type.grass && diffenceType == type.water){
            return 2.0;                                                              //みずタイプが技を受ける時のタイプ相性
        } else if(attackType == type.fire && diffenceType == type.water) {
            return 0.5;
        }else if(attackType == type.rock && diffenceType == type.fire) {//-----------------------------------------------
            return 2.0;
        }else if(attackType == type.ground && diffenceType == type.fire) {
            return 2.0;
        }else if(attackType == type.water && diffenceType == type.fire) {      //ほのおタイプが技を受ける時のタイプ相性
            return 2.0;
        }else if(attackType == type.steel && diffenceType == type.fire) {
            return 0.5;                                                         
        }else if(attackType == type.rock && diffenceType == type.flying) {//---------------------------------------------
            return 2.0;                                                              //ひこうタイプが技を受ける時のタイプ相性
        }else if(attackType == type.ground && diffenceType == type.flying) {
            return 0.0;                                                         //---------------------------------------------
        }else {                                                                      //その他のすべてのタイプ相性
            return 1.0;
        }
    }

    public void attack(Pokemon partnerPokemon, Skill partnerSkill, Pokemon opponentPokemon){
        System.out.println("========================");
        System.out.println(opponentPokemon.hitPoint);
        if(partnerSkill.skillPattern == "物理"){
            opponentPokemon.hitPoint -= Math.floor((22 * Math.floor(partnerSkill.attackAmount * partnerPokemon.attackOfPhisical / opponentPokemon.diffenceOfPhisical) / 50 + 2) * typeCompatibility(partnerSkill.attackType, opponentPokemon.type1) * typeCompatibility(partnerSkill.attackType, opponentPokemon.type2));
        }
        if(partnerSkill.skillPattern == "特殊"){
            opponentPokemon.hitPoint -= Math.floor((22 * Math.floor(partnerSkill.attackAmount * partnerPokemon.attackOfSpecial / opponentPokemon.diffenceOfSpecial) / 50 + 2) * typeCompatibility(partnerSkill.attackType, opponentPokemon.type1) * typeCompatibility(partnerSkill.attackType, opponentPokemon.type2));
        }
        System.out.println(opponentPokemon.hitPoint);
    }
}
