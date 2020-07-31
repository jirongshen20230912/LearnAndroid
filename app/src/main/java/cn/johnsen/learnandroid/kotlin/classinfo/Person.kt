package cn.johnsen.learnandroid.kotlin.classinfo

/**
 * 简 述: 父类
 * 作 者: 沈吉荣
 * 时 间: 2020/7/30
 */
open class Person(val name: String,val age :Int) {
    fun play() = println(name + "在玩游戏,今年" + age + "岁了")
}