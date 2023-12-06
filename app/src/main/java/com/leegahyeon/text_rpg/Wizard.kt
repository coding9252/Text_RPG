package com.leegahyeon.text_rpg

class Wizard {
    var name:String = ""
    var age:Int = 0
    var gender:String = ""
    var money:Int = 0
    var hp:Int = 0
    var mp:Int = 0

    constructor(_name:String, _age:Int, _gender:String, _money:Int, _hp:Int, _mp:Int) {
        println("${_name}마법사 생성")
        name = _name
        age = _age
        gender = _gender
        money = _money
        hp = _hp
        mp = _mp
    }

    fun attack() {
        println("에너지 볼!")
    }

    fun fireBall() {
        println("파이어 볼!")
    }

    fun teleport(src:Int, dst:Int) {          // 어떤 곳에서 어떤 목적지까지 이동할지
        println("${src}에서 ${dst}로 텔레포트!")
    }
}