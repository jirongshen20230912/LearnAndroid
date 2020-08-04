package cn.johnsen.learnandroid;

import org.junit.Test;

import cn.johnsen.learnandroid.kotlin.basic.fuction.HelperKt;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        HelperKt.doSomething();//java调用kotlin顶层方法
    }
}