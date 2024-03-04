package org.acad.messenger.di

import org.acad.data.local.user.UserStorage
import org.acad.data.local.user.UserStorageImpl
import org.acad.data.remote.auth.AuthFirebase
import org.acad.data.remote.auth.AuthFirebaseImpl
import org.acad.data.repo.AuthRepoImpl
import org.acad.domain.repo.AuthRepo
import org.acad.domain.usecase.auth.SendSmsCodeUseCase
import org.acad.presentation.screen.phone.PhoneVM
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Acad Bek on 3/5/2024
 */

val repoModule = module {
    single<AuthRepo> { AuthRepoImpl(get()) }
}

val useCaseModule = module {
    single { SendSmsCodeUseCase(get()) }
}

val localModule = module {
    single<UserStorage> { UserStorageImpl() }
}

val remoteModule = module {
    single<AuthFirebase> { AuthFirebaseImpl() }
}

val vmModule = module {
    viewModel { PhoneVM(get()) }
}