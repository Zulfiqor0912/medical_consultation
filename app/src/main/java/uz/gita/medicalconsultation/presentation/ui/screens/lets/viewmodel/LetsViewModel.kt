package uz.gita.medicalconsultation.presentation.ui.screens.lets.viewmodel

import androidx.lifecycle.LiveData

interface LetsViewModel {
    val openSignUpScreenLiveData: LiveData<Unit>
    val openSignInScreenLiveData:LiveData<Unit>

    fun clickSignUp()
    fun clickSignIn()
}