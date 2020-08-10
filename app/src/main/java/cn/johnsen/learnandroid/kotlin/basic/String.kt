package cn.johnsen.learnandroid.kotlin.basic

/**
 * 简 述: 扩展函数
 * 作 者: 沈吉荣
 * 时 间: 2020/8/10
 */

fun String.lettersCount():Int{
    var count = 0
    for (char in this){
        if (char.isLetter()){
            count++
        }
    }
    return count
}

operator fun String.times(n:Int) = repeat(n)