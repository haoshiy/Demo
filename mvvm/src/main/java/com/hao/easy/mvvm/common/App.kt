package com.hao.easy.mvvm.common

import android.app.Application
import com.hao.easy.mvvm.extensions.notNullSingleValue
import com.hao.easy.mvvm.inject.component.AppComponent
import com.hao.easy.mvvm.inject.component.DaggerAppComponent
import com.hao.easy.mvvm.inject.module.ApiModule
import com.hao.easy.mvvm.inject.module.AppModule
import com.hao.easy.mvvm.inject.module.NetworkModule
import com.socks.library.KLog
import com.tencent.smtt.sdk.QbSdk

/**
 * @author Yang Shihao
 * @date 2018/11/18
 */
class App : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    companion object {
        var instance by notNullSingleValue<App>()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        KLog.init(true)
        QbSdk.initX5Environment(this, null)
    }
}