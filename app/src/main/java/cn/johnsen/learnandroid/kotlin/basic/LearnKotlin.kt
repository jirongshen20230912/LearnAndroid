package cn.johnsen.learnandroid.kotlin.basic

import cn.johnsen.learnandroid.kotlin.basic.classinfo.Study
import cn.johnsen.learnandroid.kotlin.classinfo.*
import kotlin.math.max

/**
 * 简 述:
 * 作 者:
 * 时 间: 2020/7/29
 */

fun main() {
//    val a = 10//val不可变
//    var b = "10"//var可变
//    val c = 7
//    println(b + a)
//    println(largerNumber(a, c))
//
//    for (i in 0 until 10 step 3) {
//        println(i)
//    }
//    for (i in 10 downTo 1 step 2) {
//        println(i)
//    }

//    val person = Person()
//    person.age = 15
//    person.name = "小明"
//    person.play()

//    val student = Student("01",3,"小花",16)
//    val student1 = Student("小明",3)
//    val student2 = Student()
//    student.age = 18
//    student.name = "小红"
//    student1.play()
//    student2.play()
//    student.play()
//    doStudy(student)//多态
//    student1.doHomework()
//    student1.readBooks()
//    student2.doHomework()
//    student2.readBooks()

//    val cellPhone = CellPhone("小米",2800.00)
//    println(cellPhone)

//    Singleton.singletonPrint()

    printParams(123)
    printParams1(num = 123)//键值对的方式来传参
}

val study: Study? = null
fun doStudy1() {//后面加上 ? 使study可以传入null
    study?.let {//let函数可以处理全局变量判空问题
        it.readBooks()
        it.doHomework()
    }
}

fun doStudy(study: Study?) {//后面加上 ? 使study可以传入null
//    study?.doHomework()//?.表示判空操作 为空时不执行
//    study?.readBooks()
}

fun getTextLength(text: String?) = text?.length ?: 0//?:表示左边的表达式不为空就返回左边 否则返回右边


fun largerNumber(a: Int, b: Int) = max(a, b)
fun largerNumber1(a: Int, b: Int) = if (a > b) a else b
fun getScore(name: String) = when {
    name.startsWith("Tom") -> 89
    name == "J" -> 60
    else -> 0
}

fun getScore1(name: String) = when (name) {
    "Tom" -> 89
    "J" -> 60
    else -> 0
}

fun printParams(num: Int, str: String = "hello") {//默认参数值
    println("num is $num,str is $str")//${}字符串表达式
}

fun printParams1(str: String = "hello", num: Int) {//默认参数值
    println("num is${num},str is${str}")//${}字符串表达式
}
