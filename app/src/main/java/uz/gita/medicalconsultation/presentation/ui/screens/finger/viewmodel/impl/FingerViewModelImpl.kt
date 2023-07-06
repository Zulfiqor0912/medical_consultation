package uz.gita.medicalconsultation.presentation.ui.screens.finger.viewmodel.impl

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.gita.medicalconsultation.presentation.ui.screens.finger.viewmodel.FingerViewModel
import javax.inject.Inject

@HiltViewModel
class FingerViewModelImpl @Inject constructor() : FingerViewModel, ViewModel() {
    override val openHomeScreenLiveData = MutableLiveData<Unit>()

    override fun clickSkipButton() {
        openHomeScreenLiveData.value = Unit
    }
}