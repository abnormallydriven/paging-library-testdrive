package com.abnormallydriven.paginglibrarytestdrive

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.abnormallydriven.paginglibrarytestdrive.teamlist.TeamsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(TeamsViewModel::class)
    abstract fun bindTeamViewModel(teamViewModel : TeamsViewModel) : ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory : ViewModelFactory) : ViewModelProvider.Factory

}