package com.leegahyeon.text_rpg

class Slime : Monster, GreenSlimeSkill {    // Monster 클래스 상속 받고, GreenSlimeSkill 인터페이스도 받음
    var name:String = ""
    var color:String = ""
    var height:Double = 0.0
    var hp:Int = 0
    var damage:Int = 0

    constructor(_name:String, _color:String, _height:Double, _hp:Int, _damage:Int) {

        name = _name
        color = _color
        height = _height
        hp = _hp
        damage = _damage
    }

    override fun attack() {     // Monster 상속 받아서 attach 메소드를 오버라이딩.
        println("점성 공격!")
    }

    fun jumpAttack() {
        println("점프해서 내려찍기!")
    }

    override fun poison() {     // GreenSlimeSkill 인터페이스를 받아서 color가 초록일 때 poison() 메소드를 사용할 수 있다.
        if(color == "초록") {
            println("초록 독 퍼뜨리기!")
        } else {
            println("일반 슬라임은 사용할 수 없습니다.")
        }
    }
}