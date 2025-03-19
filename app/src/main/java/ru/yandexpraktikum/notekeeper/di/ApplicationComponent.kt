package ru.yandexpraktikum.notekeeper.di

import dagger.Component
import ru.yandexpraktikum.notekeeper.MainActivity

@Component
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}