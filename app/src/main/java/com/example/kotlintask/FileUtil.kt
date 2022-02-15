package com.example.kotlintask

import android.content.Context

object FileUtil {
    fun readRaw(context: Context, rawId: Int): String {
        return context.resources.openRawResource(rawId)
            .bufferedReader().use { bufferedReader -> bufferedReader.readText() }
    }
}