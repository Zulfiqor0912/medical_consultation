package uz.gita.medicalconsultation.presentation.ui.screens.splash.viewModel

import androidx.lifecycle.LiveData

interface SplashViewModel {
    val onBoardingLiveData: LiveData<Unit>

    fun openOnBoardingScreen()
}