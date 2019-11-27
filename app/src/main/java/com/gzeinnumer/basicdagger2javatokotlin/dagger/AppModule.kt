package com.gzeinnumer.basicdagger2javatokotlin.dagger

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.content.res.Resources
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

//todo 3
@Module
class AppModule(private val app: Application){
    // apa yang akan di dapatkan disini
    //3 disini, tiga juga di base activity
    @Provides
    @Singleton
    fun providesAppContext(): Context = app

    @Provides
    @Singleton
    fun provideSharedPreferences(context: Context): SharedPreferences =
        context.getSharedPreferences("MY_PREF_TITLE", Context.MODE_PRIVATE)

    //todo 14
    //dagger akan membutkan function untuk memanggil ini
    @Provides
    fun providesResource() : Resources = app.resources
}