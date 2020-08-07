package cn.johnsen.learnandroid.kotlin.basic

/**
 * 简 述: 密封类
 * 作 者: 沈吉荣
 * 时 间: 2020/8/7
 */
//定义普通接口的话 when会要求必须有else分支 否则编译不通过
//interface Result
//class Success(val msg:String):Result
//class Failure(val error: Exception):Result
//
//fun getResult(result: Result) = when(result){
//    is Success ->result.msg
//    is Failure -> result.error.message
//    else -> throw IllegalArgumentException()
//}

//定义密封类 密封类及其子类只能定义在同一个文件的顶层位置,不能嵌套在其他类中
sealed class Result
class Success(val msg: String) : Result()
class Failure(val error: Exception) : Result()

fun getResult(result: Result) = when (result) {
    is Success -> result.msg
    is Failure -> "错误是${result.error.message}"
}