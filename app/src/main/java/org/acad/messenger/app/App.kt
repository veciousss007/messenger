package org.acad.messenger.app

import android.app.Application
import org.acad.messenger.di.localModule
import org.acad.messenger.di.remoteModule
import org.acad.messenger.di.repoModule
import org.acad.messenger.di.useCaseModule
import org.acad.messenger.di.vmModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * Created by Acad Bek on 3/5/2024
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(
                repoModule,
                useCaseModule,
                localModule,
                remoteModule,
                vmModule
            )
        }
    }
}