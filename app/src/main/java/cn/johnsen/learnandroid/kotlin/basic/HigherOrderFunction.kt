package cn.johnsen.learnandroid.kotlin.basic

/**
 * 简 述: 高阶函数
 * 作 者: 沈吉荣
 * 时 间: 2020/8/11
 */

fun num1AndNum2(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {
    return operation(num1, num2)
}

fun plus(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun minus(num1: Int, num2: Int): Int {
    return num1 - num2
}

fun main() {
    val num1 = 10
    val num2 = 10
//    val result1 = num1AndNum2(num1,num2,::plus)
//    val result2 = num1AndNum2(num1,num2,::minus)
    val result1 = num1AndNum2(num1, num2) { n1, n2 -> n1 + n2 }
    val result2 = num1AndNum2(num1, num2) { n1, n2 -> n1 - n2 }
    println("result1:${result1}")
    println("result2:${result2}")
}