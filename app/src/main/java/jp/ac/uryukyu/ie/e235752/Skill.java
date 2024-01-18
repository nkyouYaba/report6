package jp.ac.uryukyu.ie.e235752;

public class Skill {
    String name;
    String skillPattern;
    int attackAmount;
    String attackType;
    static final String nothing = "なし";
    static final String fire = "ほのお";
    static final String water = "みず";
    static final String grass = "くさ";
    static final String electric = "でんき";
    static final String ground = "じめん";
    static final String flying = "ひこう";
    static final String rock = "いわ";
    static final String dragon = "ドラゴン";
    static final String steel = "はがね";

    public Skill(String name, String skillPattern, String attackType, int attackAmount) {
        this.name = name;
        this.skillPattern = skillPattern;
        this.attackType = attackType;
        this.attackAmount = attackAmount;
    }

    public double typeCompatibility(String attackType, String diffenceType) {
        if(attackType == electric && diffenceType == water) {//-----------------------------------------------
            return 2.0;
        } else if (attackType == grass && diffenceType == water){
            return 2.0;                                                              //みずタイプが技を受ける時のタイプ相性
        } else if(attackType == fire && diffenceType == water) {
            return 0.5;
        }else if(attackType == rock && diffenceType == fire) {//-----------------------------------------------
            return 2.0;
        }else if(attackType == ground && diffenceType == fire) {
            return 2.0;
        }else if(attackType == water && diffenceType == fire) {      //ほのおタイプが技を受ける時のタイプ相性
            return 2.0;
        }else if(attackType == steel && diffenceType == fire) {
            return 0.5;                                                         
        }else if(attackType == rock && diffenceType == flying) {//---------------------------------------------
            return 2.0;                                                              //ひこうタイプが技を受ける時のタイプ相性
        }else if(attackType == ground && diffenceType == flying) {
            return 0.0;                                                         //---------------------------------------------
        }else {                                                                      //その他のすべてのタイプ相性
            return 1.0;
        }
    }

    public void attack(Pokemon partnerPokemon, Skill partnerSkill, Pokemon opponentPokemon){
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
