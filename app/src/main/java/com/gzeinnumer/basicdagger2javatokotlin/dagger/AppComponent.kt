package com.gzeinnumer.basicdagger2javatokotlin.dagger

import com.gzeinnumer.basicdagger2javatokotlin.BaseActivity
import com.gzeinnumer.basicdagger2javatokotlin.DaggerApplication
import dagger.Component
import javax.inject.Singleton

//todo 2
//ignore red
@Singleton
@Component(modules = [AppModule::class])
interface AppComponent{
    fun inject(activity: DaggerApplication)
//    fun inject(activity: MainActivity)
    //todo 11
    //pada todo11 ini, komentarkan MainActivity, dan buat untuk BaseActivity
    fun inject(activity: BaseActivity)
}