package cn.johnsen.learnandroid.kotlin.android

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import cn.johnsen.learnandroid.R

class FirstActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        //模仿静态类的写法
        @JvmStatic //使方法实际成为静态的 只能加在单例类 和 companion object中的方法上
        fun actionStart(context: Context, data1: String, data2: String) {
            val intent = Intent(context, FirstActivity::class.java).apply {
                putExtra(data1, data1)
                putExtra(data2, data2)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        supportActionBar?.hide()//隐藏标题栏
//        tv_click.setOnClickListener { Toast.makeText(this, "", Toast.LENGTH_LONG).show() }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_click -> {

            }
        }
    }
}