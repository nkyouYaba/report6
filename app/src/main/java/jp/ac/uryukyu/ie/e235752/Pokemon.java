package jp.ac.uryukyu.ie.e235752;

import java.util.ArrayList;
/**
 * ポケモンクラス
 * @param name　名前
 * @param type1　タイプ
 * @param type2　タイプ
 * @param hitPoint　HP
 * @param attackOfPhisical 攻撃力
 * @param diffenceOfPhisical　防御力
 * @param attackOfSpecial　特殊攻撃力
 * @param diffenceOfSpecial　特殊攻撃力
 * @param speed　素早さ
 */
public class Pokemon {
    String name;
    String type1;
    String type2;
    double hitPoint;
    double attackOfPhisical;
    double diffenceOfPhisical;
    double attackOfSpecial;
    double diffenceOfSpecial;
    double speed;
    public ArrayList<Skill> skills = new ArrayList<>();
/**
 * コンストラクタ、ポケモンの名前とタイプ、ステータスを決める
 * @param name　名前
 * @param type1　タイプ
 * @param type2　タイプ
 * @param hitPoint　HP
 * @param attackOfPhisical 攻撃力
 * @param diffenceOfPhisical　防御力
 * @param attackOfSpecial　特殊攻撃力
 * @param diffenceOfSpecial　特殊攻撃力
 * @param speed　素早さ
 */
    public Pokemon(String name,  String type1, String type2, double hitPoint, double attackOfPhisical, double diffenceOfPhisical, double attackOfSpecial, double diffenceOfSpecial, double speed){
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.hitPoint = hitPoint;
        this.attackOfPhisical = attackOfPhisical;
        this.diffenceOfPhisical = diffenceOfPhisical;
        this.attackOfSpecial = attackOfSpecial;
        this.diffenceOfSpecial = diffenceOfSpecial;
        this.speed = speed;
    }
}
