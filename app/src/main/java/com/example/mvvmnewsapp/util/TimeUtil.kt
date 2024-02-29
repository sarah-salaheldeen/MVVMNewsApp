package com.example.mvvmnewsapp.util

import android.util.Log
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Locale
import java.util.TimeZone


class TimeUtil {

    companion object {

        fun getDateTimeName(createdAt: String): String {

            val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US)
            dateFormat.timeZone = TimeZone.getTimeZone("GMT")
            try {
                val date = dateFormat.parse(createdAt)
                val dateFormatLocal = SimpleDateFormat("dd MMM, hh:mm a", Locale.US)
                return dateFormatLocal.format(date)
            } catch (e: ParseException) {
                e.printStackTrace()
            }
            return createdAt
        }

    }
}