package com.leegahyeon.text_rpg

class Slime {
    var name:String = ""
    var color:String = ""
    var height:Double = 0.0
    var hp:Int = 0
    var damage:Int = 0              // 여기까지는 선언만 한 것!

    constructor(_name:String, _color:String, _height:Double, _hp:Int, _damage:Int) {    // 선언한 것을 다시 따로 대입해 줘야 함.
        println("${_name} 생성")
        name = _name
        color = _color
        height = _height
        hp = _hp
        damage = _damage
    }

    fun attack() {
        println("점성 공격!")
    }

    fun jumpAttack() {
        println("점프해서 내려찍기!")
    }
}