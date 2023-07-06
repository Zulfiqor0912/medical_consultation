package uz.gita.medicalconsultation.di

import android.content.Context
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import uz.gita.medicalconsultation.data.source.Pref

@Module
@InstallIn(SingletonComponent::class)
class StoreModule {

    fun providerSharedPref(@ApplicationContext context: Context): Pref = Pref(context)
}