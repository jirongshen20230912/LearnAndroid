package cn.johnsen.learnandroid.kotlin.basic.operator

/**
 * 简 述: 运算符重载
 * 作 者: 沈吉荣
 * 时 间: 2020/8/10
 */
class Money(val value: Int) {

    operator fun plus(money: Money): Money {
        val sum = value + money.value
        return Money(sum)
    }

    operator fun plus(newValue:Int): Money {
        val sum = value +newValue
        return Money(sum)
    }
}