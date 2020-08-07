package cn.johnsen.learnandroid.kotlin.android

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import cn.johnsen.learnandroid.R
import kotlinx.android.synthetic.main.activity_first.*
import java.lang.StringBuilder

class FirstActivity : AppCompatActivity(), View.OnClickListener {
    private val recyclerList = ArrayList<RecyclerData>()

    //    private  var adapter: RecyclerAdapter? = null//需要初始化为null
    private lateinit var adapter: RecyclerAdapter//lateinit延迟初始化

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
        tv_click.setOnClickListener(this)
//        tv_click.setOnClickListener { Toast.makeText(this, "", Toast.LENGTH_LONG).show() }
//        val layoutManager = LinearLayoutManager(this)
//        layoutManager.orientation = LinearLayoutManager.HORIZONTAL//横向滚动
        val layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
        if (!::adapter.isInitialized) {//判断变量adapter是否已经初始化 避免重复初始化
            adapter = RecyclerAdapter(recyclerList)
        }
        recyclerView.adapter = adapter
    }

    private fun initData() {
        repeat(2) {//重复执行两次
            recyclerList.add(RecyclerData(getRandomString("001"), R.drawable.avatar))
            recyclerList.add(RecyclerData(getRandomString("002"), R.drawable.avatar))
            recyclerList.add(RecyclerData(getRandomString("003"), R.drawable.avatar))
            recyclerList.add(RecyclerData(getRandomString("004"), R.drawable.avatar))
            recyclerList.add(RecyclerData(getRandomString("005"), R.drawable.avatar))
            recyclerList.add(RecyclerData(getRandomString("006"), R.drawable.avatar))
        }
    }

    private fun getRandomString(str: String): String {
        val n = (1..20).random()
        val builder = StringBuilder()
        repeat(n) {
            builder.append(str)
        }
        return builder.toString()
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_click -> {
                println("111")
                initData()
//                adapter?.notifyDataSetChanged()//adapter如果定义成普通var就需要判空才行
                adapter.notifyDataSetChanged()//adapter如果延迟初始化后就不用判空了
            }
        }
    }
}