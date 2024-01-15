package com.myself223.ulanagaybotiknakotline

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database (entities = [Notes::class], version = 2)
abstract class MainDb:RoomDatabase() {
    abstract fun getDao():Dao
}