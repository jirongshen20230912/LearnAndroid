package cn.johnsen.learnandroid.kotlin.android

import android.app.Activity

/**
 * 简 述:
 * 作 者: 沈吉荣
 * 时 间: 2020/8/3
 */
object ActivityCollector {
    private val activities = ArrayList<Activity>()

    fun addActivity(activity: Activity) {
        activities.add(activity)
    }

    fun removeActivity(activity: Activity) {
        activities.remove(activity)
    }

    fun finishAll() {
        for (activity in activities) {
            if (!activity.isFinishing) {
                activity.finish()
            }
        }
        activities.clear()
    }
}