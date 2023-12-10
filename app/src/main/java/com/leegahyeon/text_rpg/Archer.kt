package com.leegahyeon.text_rpg

class Archer : Character {
    var name: String    // 원래 var name: String 이렇게 기본 초기화를 뒀었는데, 아래처럼 생성자를 둔 이후부터는 딱히 초기화를 하지 않고 이렇게 대체할 수 있다.
    var age: Int        // 애초에 코틀린이 컴파일 하는 시점에서 생성자가 있다는 것은 객체가 만들어질 때 이미 값이 결정이 된다는 것이기 때문이다.
    var gender: String  // 밑의 생성자가 만들어질 때 프로퍼티의 값이 결정이 된다. 무조건 객체 만들 때 결정이 되는데 값이 없을 수가 없으니 항상 초기화가 된다. 그래서 생략 가능!
    var money: Int
    var hp: Int

    constructor(_name: String, _age: Int, _gender: String, _money: Int, _hp: Int) {
        name = _name
        age = _age
        gender = _gender
        money = _money
        hp = _hp
        println("${name}궁수 생성")    // 이 println이 name = _name 위에 있었었는데 name을 초기화하고 쓸 수 있기 때문에 아래로 보냄.
    }

    override fun attack() {
        println("활쏘기!")
    }

    fun windArrow() {
        println("바람의 화살!!")
    }

    fun windJump(destination: String) {
        println("${destination}까지 도약!")
    }
}