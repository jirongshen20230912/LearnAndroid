package cn.johnsen.learnandroid.kotlin.basic.fuction

/**
 * 简 述:
 * 作 者: 沈吉荣
 * 时 间: 2020/8/4
 */

fun main() {
    val list = listOf("a","b","c","d")
//    val result  = with(StringBuilder()){//with函数 连续调用同一个对象的多个方法时 让代码简单些
//        append("开始")
//        for (s in list) {
//            append(s).append("\n")
//        }
//        append("结束")
//        toString()
//    }
//    val result  = StringBuilder().run{//run函数 与with函数功能类似
//        append("开始")
//        for (s in list) {
//            append(s).append("\n")
//        }
//        append("结束")
//        toString()
//    }
//    val result  = StringBuilder().apply{//apply函数 与run函数功能类似 返回值是对象本身0
//        append("开始")
//        for (s in list) {
//            append(s).append("\n")
//        }
//        append("结束")
//    }
//    println(result.toString())

    doSomething()//kotlin直接调用顶层方法
}