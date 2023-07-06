package uz.gita.medicalconsultation.presentation.ui.screens.splash.viewModel.impl

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.gita.medicalconsultation.presentation.ui.screens.splash.viewModel.SplashViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModelImpl @Inject constructor() : SplashViewModel, ViewModel() {
    override val onBoardingLiveData = MutableLiveData<Unit>()

    override fun openOnBoardingScreen() {
        onBoardingLiveData.value = Unit
    }
}