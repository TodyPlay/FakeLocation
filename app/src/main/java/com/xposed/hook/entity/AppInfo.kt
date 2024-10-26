package com.xposed.hook.entity

import android.graphics.drawable.Drawable
import java.io.Serializable

class AppInfo : Serializable {
    var title: String? = null
    var packageName: String? = null
    var time: Long = 0

    @Transient
    var icon: Drawable? = null
}
