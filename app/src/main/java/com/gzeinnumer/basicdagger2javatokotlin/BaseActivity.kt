package com.gzeinnumer.basicdagger2javatokotlin

import android.content.Context
import android.content.SharedPreferences
import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

open class BaseActivity: AppCompatActivity(){

    //todo 8
    @Inject lateinit var preft : SharedPreferences
    @Inject lateinit var context : Context
    @Inject lateinit var res : Resources

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //todo 9
        (application as DaggerApplication).getAppComponent()?.inject(this)

    }
}