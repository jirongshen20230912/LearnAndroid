package cn.johnsen.learnandroid.kotlin.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * 简 述:
 * 作 者: 沈吉荣
 * 时 间: 2020/8/3
 */
open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityCollector.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityCollector.removeActivity(this)
    }
}