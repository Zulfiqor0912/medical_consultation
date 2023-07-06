package uz.gita.medicalconsultation.presentation.ui.screens.onboarding.viewmodel

import androidx.lifecycle.LiveData

interface OnBoardingViewModel {
    val openIntroScreenLiveData: LiveData<Unit>
    fun openIntroScreens()
}