package uz.gita.medicalconsultation.presentation.ui.screens.lets.viewmodel.impl

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.gita.medicalconsultation.presentation.ui.screens.lets.viewmodel.LetsViewModel
import javax.inject.Inject

@HiltViewModel
class LetsViewModelImpl @Inject constructor() : LetsViewModel, ViewModel() {
    override val openSignUpScreenLiveData = MutableLiveData<Unit>()
    override val openSignInScreenLiveData = MutableLiveData<Unit>()


    override fun clickSignUp() {
        openSignUpScreenLiveData.value = Unit
    }

    override fun clickSignIn() {
        openSignInScreenLiveData.value = Unit
    }
}