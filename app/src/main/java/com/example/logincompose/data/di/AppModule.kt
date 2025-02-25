package com.example.logincompose.data.di

import com.example.logincompose.data.remote.api.UserApi
import com.example.logincompose.data.repository.UserRepositoryImpl
import com.example.logincompose.domain.repository.LoginRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideUserRepository(apiService: UserApi): LoginRepository {
        return UserRepositoryImpl(apiService)
    }
}