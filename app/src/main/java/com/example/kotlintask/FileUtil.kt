package com.example.kotlintask

import android.content.Context

object FileUtil {
    /**
     * Reads file from raw resources.
     * @param context Android context to get access to resources.
     * @param rawId Resource generated identifier.
     * @return Returns a string with the file content.
     */
    fun readRaw(context: Context, rawId: Int): String {
        return context.resources.openRawResource(rawId)
            .bufferedReader().use { bufferedReader -> bufferedReader.readText() }
    }
}