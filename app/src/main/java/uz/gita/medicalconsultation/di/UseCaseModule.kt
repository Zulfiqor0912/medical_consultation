package uz.gita.medicalconsultation.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uz.gita.medicalconsultation.domain.usecase.MedUseCase
import uz.gita.medicalconsultation.domain.usecase.impl.MedUseCaseImpl
import javax.inject.Singleton


@Module
@InstallIn(ViewModelComponent::class)
interface UseCaseModule {

    @[Binds]
    fun bindMedUseCase(impl:MedUseCaseImpl):MedUseCase
}