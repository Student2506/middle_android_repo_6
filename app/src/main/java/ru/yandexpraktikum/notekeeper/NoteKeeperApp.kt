package ru.yandexpraktikum.notekeeper

import android.app.Application
import ru.yandexpraktikum.notekeeper.di.ApplicationComponent
import ru.yandexpraktikum.notekeeper.di.DaggerApplicationComponent

class NoteKeeperApp : Application() {
    lateinit var appComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerApplicationComponent.factory().create(this)
    }
}