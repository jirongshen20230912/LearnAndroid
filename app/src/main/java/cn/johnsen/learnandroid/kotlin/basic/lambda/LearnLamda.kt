package cn.johnsen.learnandroid.kotlin.basic.lambda

/**
 * 简 述:
 * 作 者: 沈吉荣
 * 时 间: 2020/7/31
 */

fun main() {
    val list = listOf("1", "2", "3")//不可变集合
//    println(list)
    val mutList = mutableListOf("1", "2", "3")//可变集合
    mutList.add("4")
//    println(mutList)
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
//    println(map["a"])
    val mutList1 = mutableListOf("abc", "bc", "aaaac", "ddddddd")
    val newList = mutList1.filter { it.length < 5 }//filter函数 过滤
            .map { it.toUpperCase() }//map函数
//    println(newList)
    val anyResult = mutList1.any { it.length<5 }//判断是否有一个满足条件
    val allResult = mutList1.all { it.length<5 }//判断是否全部满足条件
//    println(anyResult)
//    println(allResult)
    Thread(Runnable { println("Runnable") }).start()//kotlin调用java单抽象方法接口
}
