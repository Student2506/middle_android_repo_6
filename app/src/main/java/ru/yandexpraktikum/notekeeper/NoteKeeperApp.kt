package ru.yandexpraktikum.notekeeper

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import ru.yandexpraktikum.notekeeper.di.ApplicationComponent
import ru.yandexpraktikum.notekeeper.di.DaggerApplicationComponent

@HiltAndroidApp
class NoteKeeperApp : Application() {
    lateinit var appComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerApplicationComponent.factory().create(this)
    }
}