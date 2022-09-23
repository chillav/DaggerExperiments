package com.krasovitova.daggerexperiments

import android.app.Application

class ThisApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}