package uz.gita.medicalconsultation.presentation.ui.screens.profile.viewmodel

import androidx.lifecycle.LiveData

interface ProfileViewModel {
    val openSignUpScreenLiveData: LiveData<Unit>
    val openFingerScreenLiveData: LiveData<Unit>

    fun clickBackButton()
    fun clickContinueButton()

}