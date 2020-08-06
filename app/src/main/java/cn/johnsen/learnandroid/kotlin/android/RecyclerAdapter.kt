package cn.johnsen.learnandroid.kotlin.android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import cn.johnsen.learnandroid.R

/**
 * 简 述:
 * 作 者: 沈吉荣
 * 时 间: 2020/8/6
 */
class RecyclerAdapter(val recyclerList: List<RecyclerData>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageUrl: ImageView = view.findViewById(R.id.iv_item)
        val textName: TextView = view.findViewById(R.id.tv_item)
        val viewItem: LinearLayout = view.findViewById(R.id.view_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        val viewHolder = ViewHolder(view)
        viewHolder.viewItem.setOnClickListener {
            val position = viewHolder.adapterPosition
            val data = recyclerList[position]
            Toast.makeText(parent.context,"父布局${data.name}",Toast.LENGTH_LONG).show()
        }
        viewHolder.imageUrl.setOnClickListener {
            val position = viewHolder.adapterPosition
            val data = recyclerList[position]
            Toast.makeText(parent.context,"子布局${data.name}",Toast.LENGTH_LONG).show()
        }
        return viewHolder
    }

    override fun getItemCount() = recyclerList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recyclerData = recyclerList[position]
        holder.imageUrl.setImageResource(recyclerData.imageId)
        holder.textName.text = recyclerData.name
    }

}