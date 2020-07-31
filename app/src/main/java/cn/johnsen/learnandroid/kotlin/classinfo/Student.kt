package cn.johnsen.learnandroid.kotlin.classinfo

/**
 * 简 述: 子类
 * 作 者: 沈吉荣
 * 时 间: 2020/7/30
 */
class Student(val sno: String, val grade: Int, name: String, age: Int) : Person(name, age),Study {
    constructor(name:String,age:Int) : this("",0,name, age)//子构造函数1
    constructor() : this("NoBody",0)//子构造函数2
    fun study() = println("" + age + "岁大的" + name + "在学习,学号是" + sno + "在" + grade + "班级")

    override fun doHomework() {
        println( name + "在做作业")
    }
}

//class Student : Person {
//    constructor(name:String,age:Int) : super(name, age){}
//}