package com.leegahyeon.text_rpg

fun main() {

    val worldName = "스코월드"
    var myName = readLine()
    var myAge = readLine()!!.toInt()
    var myJob = readLine()

    var isNamePass = true
    var isAgePass = true
    var isJobPass = true

    var names = arrayOf("참새", "꿩", "비둘기")
    for (name in names) {
        if (myName == name) {
            println("중복된 이름이 존재합니다.")
            isNamePass = false
            break                                 // 가장 가까운 반복문(for문) 탈출
        }
    }

    if (myAge < 8) {
        println("8세 미만은 이용할 수 없습니다")
        isAgePass = false
    }
    if (myJob == "전사") {
        println("일시적으로 전사를 이용할 수 없습니다.")
        isJobPass = false
    }

    // 모든 조건을 통과한 경우에만 환영
    if (isNamePass && isAgePass && isJobPass) {    // 셋 다 true로 만족했을 때 실행 됨. 현재 isNamePass만 false.
        println("==================${worldName}에 오신것을 환영합니다==================")
        println("당신의 정보는 다음과 같습니다.")
        println("이름: ${myName}입니다.")
        println("나이: ${myAge}살 입니다.")
        println("직업: ${myJob}입니다.")
        println("모험을 떠나 볼까요?")
    }
}