package uz.gita.medicalconsultation.presentation.ui.screens.signin.viewmodel.impl

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import uz.gita.medicalconsultation.presentation.ui.screens.signin.viewmodel.SignInViewModel

class SignInViewModelImpl : SignInViewModel, ViewModel() {
    override val openSignUpLiveData = MutableLiveData<Unit>()
    override val openLetsScreenLiveData = MutableLiveData<Unit>()
    override val openHomeScreenLiveData = MutableLiveData<Unit>()

    override fun clickSignUp() {
        openSignUpLiveData.value = Unit
    }

    override fun clickBackButton() {
        openSignUpLiveData.value = Unit
    }

    override fun clickSignInButton() {
        openHomeScreenLiveData.value = Unit
    }

}