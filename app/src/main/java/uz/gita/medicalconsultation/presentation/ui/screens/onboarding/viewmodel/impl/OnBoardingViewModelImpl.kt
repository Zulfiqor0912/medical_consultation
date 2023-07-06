package uz.gita.medicalconsultation.presentation.ui.screens.onboarding.viewmodel.impl

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.gita.medicalconsultation.presentation.ui.screens.onboarding.viewmodel.OnBoardingViewModel
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModelImpl @Inject constructor(): OnBoardingViewModel, ViewModel() {

    override val openIntroScreenLiveData = MutableLiveData<Unit>()

    override fun openIntroScreens() {
        openIntroScreenLiveData.value = Unit
    }
}