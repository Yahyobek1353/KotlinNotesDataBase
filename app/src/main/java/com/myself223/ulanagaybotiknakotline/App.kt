package com.myself223.ulanagaybotiknakotline

import android.app.Application
import androidx.room.Room

class App: Application() {

    companion object {
        lateinit var db : MainDb
    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            this, MainDb::class.java,
            "roomAndroid"
        ).allowMainThreadQueries().build()
    }
}