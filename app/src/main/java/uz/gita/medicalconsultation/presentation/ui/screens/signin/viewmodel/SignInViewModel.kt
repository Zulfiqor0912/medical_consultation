package uz.gita.medicalconsultation.presentation.ui.screens.signin.viewmodel

import androidx.lifecycle.LiveData

interface SignInViewModel {
    val openSignUpLiveData: LiveData<Unit>
    val openLetsScreenLiveData: LiveData<Unit>
    val openHomeScreenLiveData:LiveData<Unit>

    fun clickSignUp()
    fun clickBackButton()
    fun clickSignInButton()
}