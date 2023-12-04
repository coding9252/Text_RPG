package com.leegahyeon.text_rpg

fun main() {
    val worldName = "스코월드"

    println("이름을 입력해주세요")
    var myName = readLine()!!

    println("나이를 입력해주세요")
    var myAge = readLine()!!.toInt()

    println("직업을 입력해주세요")
    var myJob = readLine()!!

    println("성별을 입력해주세요")
    var myGender = readLine()!!

    println("초기자본을 입력해주세요")
    var myMoney = readLine()!!.toInt()

    println("초기체력 입력해주세요")
    var myHp = readLine()!!.toInt()
    var myMp = 0

    var isNamePass = true
    var isAgePass = true
    var isJobPass = true

    var names = arrayOf("참새", "꿩", "비둘기")
    for(name in names) {
        if(myName == name) {
            println("중복된 이름이 존재합니다.")
            isNamePass = false
            break
        }
    }

    if(myAge < 8) {
        println("8세 미만은 이용할 수 없습니다.")
        isAgePass = false
    }
    if(myJob == "전사") {
        println("일시적으로 전사를 이용할 수 없습니다.")
        isJobPass = false
    }

    // 모든 조건을 통과한 경우에만 환영
    if(isNamePass && isAgePass && isJobPass) {
        displayInfo(worldName, myName, myAge, myJob)

        if(myJob == "마법사") {
            println("마법사는 초기 mp도 입력해주세요")
            myMp = readLine()!!.toInt()
            var myCharacter = Wizard(myName, myAge, myGender, myMoney, myHp, myMp)

            println("던전을 선택해주세요")
            println("[1] 슬라임동굴, [2] 좀비마을")
            var selectWorld = readLine()!!.toInt()
            selectWorldByWizard(selectWorld, myCharacter)

        } else if(myJob == "궁수") {
            println("궁수를 선택했군요")
            var myCharacter = Archer(myName, myAge, myGender, myMoney, myHp)    // 객체 실체화 : 궁수를 선택했다면 Archer 클래스를 바탕으로 인스턴스를 만듦.
                                                                                // 그리고 내가 입력한 정보들을 부생성자로 넘겨서 인스턴스를 만들, 인스턴스의 메모리 주소를 mycharacter에 담아 놓음.
            println("던전을 선택해주세요")
            println("[1] 슬라임동굴, [2] 좀비마을")
            var selectWorld = readLine()!!.toInt()
            selectWorldByArcher(selectWorld, myCharacter)                       // 1과 2중 선택하면 selectWorld 변수에 값이 들어가고, selectWorldByArcher에 그 값과 내 캐릭터 객체를 한꺼번에 넘겨줌.
        }
    }
}

fun displayInfo(worldName:String, myName:String, myAge:Int, myJob:String) {
    println("==================${worldName}에 오신것을 환영합니다==================")
    println("당신의 정보는 다음과 같습니다.")
    println("이름: ${myName}입니다.")
    println("나이: ${myAge}입니다.")
    println("직업: ${myJob}입니다.")
    println("모험을 떠나 볼까요?")
}

fun selectWorldByArcher(selectWorld:Int, myCharacter: Archer) {
    if(selectWorld == 1) { // 슬라임 던전
        var slime1 = Slime("초록슬라임", "초록", 30.2, 200, 10)
        slime1.attack()
        myCharacter.windArrow()

    } else if(selectWorld == 2) { // 좀비 던전
        var zombie1 = Zombie("파랑좀비", "파랑", 142.2, 500, 25)
        zombie1.virus()
        myCharacter.windJump("건물1")
    }
}

fun selectWorldByWizard(selectWorld:Int, myCharacter: Wizard) {
    if(selectWorld == 1) { // 슬라임 던전
        var slime1 = Slime("초록슬라임", "초록", 30.2, 200, 10)
        slime1.attack()
        myCharacter.attack()

    } else if(selectWorld == 2) { // 좀비 던전
        var zombie1 = Zombie("파랑좀비", "파랑", 142.2, 500, 25)
        zombie1.virus()
        myCharacter.fireBall()
    }
}   // 지금은 archer가 선택한 world와 wizard가 선택한 world를 구분해 놓았지만 나중에(배우면) 하나로 합칠 수 있음