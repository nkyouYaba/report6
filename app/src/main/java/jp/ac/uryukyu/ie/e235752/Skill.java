package jp.ac.uryukyu.ie.e235752;
/**
 * ポケモンの技のクラス
 * @param name　技の名前
 * @param skillPattern　物理か特殊か
 * @param attackType　技のタイプ
 * @param attackAmount　技の威力
 */
public class Skill {
    String name;
    String skillPattern;
    int attackAmount;
    String attackType;
    double informationCompability;
    /**
     * コンストラクタ、技の名前、物理か特殊か、技のタイプ、技の威力
     * @param name　技の名前
     * @param skillPattern　物理か特殊か
     * @param attackType　技のタイプ
     * @param attackAmount　技の威力
     */
    public Skill(String name, String skillPattern, String attackType, int attackAmount) {
        this.name = name;
        this.skillPattern = skillPattern;
        this.attackType = attackType;
        this.attackAmount = attackAmount;
    }
    
    Type type = new Type();

    /**
     * ポケモンのタイプ相性を表す
     * @param attackType //攻撃するタイプ
     * @param diffenceType　//防御側のポケモンのタイプ
     * @return　こうかはばつぐんの時は2、こうかはいまひとつなら0.5、こうかはなしなら0、そのどれでもなければ1を返す
     */
    public double typeCompatibility(String attackType, String diffenceType) {
        if(attackType == type.electric && diffenceType == type.water) {//-----------------------------------------------
            return 2.0;
        } else if (attackType == type.grass && diffenceType == type.water){
            return 2.0;                                                         //みずタイプが技を受ける時のタイプ相性
        } else if(attackType == type.fire && diffenceType == type.water) {
            return 0.5;
        }else if(attackType == type.rock && diffenceType == type.fire) {//-----------------------------------------------
            return 2.0;
        }else if(attackType == type.ground && diffenceType == type.fire) {
            return 2.0;
        }else if(attackType == type.water && diffenceType == type.fire) {       //ほのおタイプが技を受ける時のタイプ相性
            return 2.0;
        }else if(attackType == type.steel && diffenceType == type.fire) {
            return 0.5;                                                         
        }else if(attackType == type.rock && diffenceType == type.flying) {//---------------------------------------------
            return 2.0;                                                         //ひこうタイプが技を受ける時のタイプ相性
        }else if(attackType == type.ground && diffenceType == type.flying) {
            return 0.0;                                                   //---------------------------------------------
        }else {                                                                 //その他のすべてのタイプ相性
            return 1.0;
        }
    }
    /**
     * 味方のポケモンが相手のポケモンに技をうつメソッド
     * @param partnerPokemon 味方のポケモン
     * @param partnerSkill 味方のポケモンの技
     * @param opponentPokemon 相手のポケモン
     */
    public void attack(Pokemon partnerPokemon, Skill partnerSkill, Pokemon opponentPokemon){
        informationCompability = typeCompatibility(partnerSkill.attackType, opponentPokemon.type1) * typeCompatibility(partnerSkill.attackType, opponentPokemon.type2);
        System.out.println("========================");
        System.out.println("相手のHP(攻撃前);" + opponentPokemon.hitPoint);
        System.out.println(partnerPokemon.name + "の" + partnerSkill.name + "!");

        if(partnerSkill.skillPattern == "物理"){
            opponentPokemon.hitPoint -= Math.floor((22 * Math.floor(partnerSkill.attackAmount * partnerPokemon.attackOfPhisical / opponentPokemon.diffenceOfPhisical) / 50 + 2) * typeCompatibility(partnerSkill.attackType, opponentPokemon.type1) * typeCompatibility(partnerSkill.attackType, opponentPokemon.type2));
        }
        if(partnerSkill.skillPattern == "特殊"){
            opponentPokemon.hitPoint -= Math.floor((22 * Math.floor(partnerSkill.attackAmount * partnerPokemon.attackOfSpecial / opponentPokemon.diffenceOfSpecial) / 50 + 2) * typeCompatibility(partnerSkill.attackType, opponentPokemon.type1) * typeCompatibility(partnerSkill.attackType, opponentPokemon.type2));
        }

        if(informationCompability == 2.0){
            System.out.println("こうかはばつぐんだ！");
            }else if(informationCompability == 4.0){
                System.out.println("こうかはばつぐんだ");
            }else if(informationCompability == 0.5){
                System.out.println("こうかはいまひとつのようだ...");
            }else if(informationCompability == 0.0){
                System.out.println("こうかはないようだ...");
            }
        System.out.println("相手のHP(攻撃後);" + opponentPokemon.hitPoint);
    }
}
