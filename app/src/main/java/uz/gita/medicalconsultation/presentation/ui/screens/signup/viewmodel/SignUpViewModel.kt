package uz.gita.medicalconsultation.presentation.ui.screens.signup.viewmodel

import androidx.lifecycle.LiveData

interface SignUpViewModel {
    val openLetsScreenLiveData: LiveData<Unit>
    val openSignInScreenLiveData:LiveData<Unit>
    val openProfileScreenLiveData:LiveData<Unit>

    fun clickBackButton()
    fun clickSignInButton()
    fun clickSignUpButton()
}