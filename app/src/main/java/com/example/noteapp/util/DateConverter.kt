package com.example.noteapp.util

import androidx.room.TypeConverter
import java.util.Date

class DateConverter {
    @TypeConverter
    fun timeStamp(date: Date): Long {
        return date.time
    }
    @TypeConverter
    fun dateFromTimeStamp(timeStamp: Long): Date? {
        return Date(timeStamp)
    }
}