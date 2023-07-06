package uz.gita.medicalconsultation.presentation.ui.screens.profile.viewmodel.impl

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.gita.medicalconsultation.presentation.ui.screens.profile.viewmodel.ProfileViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileViewModelImpl @Inject constructor() : ProfileViewModel, ViewModel() {
    override val openSignUpScreenLiveData = MutableLiveData<Unit>()
    override val openFingerScreenLiveData = MutableLiveData<Unit>()

    override fun clickBackButton() {
        openSignUpScreenLiveData.value = Unit
    }

    override fun clickContinueButton() {
        openFingerScreenLiveData.value = Unit
    }
}