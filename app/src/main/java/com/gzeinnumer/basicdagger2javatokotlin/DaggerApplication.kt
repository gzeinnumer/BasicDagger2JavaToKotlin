package com.gzeinnumer.basicdagger2javatokotlin

import android.app.Application
import com.gzeinnumer.basicdagger2javatokotlin.dagger.AppComponent
import com.gzeinnumer.basicdagger2javatokotlin.dagger.AppModule
import com.gzeinnumer.basicdagger2javatokotlin.dagger.DaggerAppComponent

//todo 4
//same like Universal Context/MyApp
class DaggerApplication: Application(){
    private var appComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()

        //todo 5
        //build first
        //todo 6
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()

        appComponent?.inject(this)
    }

    //todo 7
    fun getAppComponent() : AppComponent? = appComponent
}