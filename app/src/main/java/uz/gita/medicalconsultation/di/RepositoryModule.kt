package uz.gita.medicalconsultation.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.medicalconsultation.domain.repositories.MedRepository
import uz.gita.medicalconsultation.domain.repositories.impl.MedRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {


    @[Binds Singleton]
    fun bindMedRepository(impl: MedRepositoryImpl): MedRepository
}