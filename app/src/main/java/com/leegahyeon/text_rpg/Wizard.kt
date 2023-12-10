package com.leegahyeon.text_rpg

class Wizard : Character {
    var name:String           // Archer와 같이 원래 다 초기화해줬었는데 어차피 생성자에서 받아와서 값을 초기화하니까 생략 가능
    var age:Int
    var gender:String
    var money:Int
    var hp:Int
    var mp:Int

    constructor(_name:String, _age:Int, _gender:String, _money:Int, _hp:Int, _mp:Int) {
        name = _name
        age = _age
        gender = _gender
        money = _money
        hp = _hp
        mp = _mp
        println("${name}마법사 생성")    // 이 println이 name = _name 위에 있었는데 name을 초기화하고 쓸 수 있기 때문에 아래로 보냄.
    }

    override fun attack() {
        println("에너지 볼!")
    }

    fun fireBall() {
        println("파이어 볼!")
    }

    fun teleport(src:Int, dst:Int) {
        println("${src}에서 ${dst}로 텔레포트!")
    }
}