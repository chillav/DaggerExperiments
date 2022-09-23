package com.krasovitova.daggerexperiments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var computer: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (applicationContext as? ThisApplication)?.appComponent?.inject(this)
    }
}