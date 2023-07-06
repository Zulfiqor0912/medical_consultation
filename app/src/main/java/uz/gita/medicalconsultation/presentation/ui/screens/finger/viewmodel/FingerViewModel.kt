package uz.gita.medicalconsultation.presentation.ui.screens.finger.viewmodel

import androidx.lifecycle.LiveData

interface FingerViewModel {
    val openHomeScreenLiveData:LiveData<Unit>

    fun clickSkipButton()

}