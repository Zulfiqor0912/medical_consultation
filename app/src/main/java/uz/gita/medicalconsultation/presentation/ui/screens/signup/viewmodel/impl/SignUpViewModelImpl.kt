package uz.gita.medicalconsultation.presentation.ui.screens.signup.viewmodel.impl

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.gita.medicalconsultation.presentation.ui.screens.signup.viewmodel.SignUpViewModel
import javax.inject.Inject

@HiltViewModel
class SignUpViewModelImpl @Inject constructor() : SignUpViewModel, ViewModel() {
    override val openLetsScreenLiveData = MutableLiveData<Unit>()
    override val openSignInScreenLiveData = MutableLiveData<Unit>()
    override val openProfileScreenLiveData = MutableLiveData<Unit>()

    override fun clickBackButton() {
        openLetsScreenLiveData.value = Unit
    }

    override fun clickSignInButton() {
        openSignInScreenLiveData.value = Unit
    }

    override fun clickSignUpButton() {
        openProfileScreenLiveData.value = Unit
    }
}