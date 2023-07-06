package uz.gita.medicalconsultation.presentation.ui.screens.finger

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.medicalconsultation.R
import uz.gita.medicalconsultation.databinding.ScreenFingerBinding
import uz.gita.medicalconsultation.presentation.ui.screens.finger.viewmodel.FingerViewModel
import uz.gita.medicalconsultation.presentation.ui.screens.finger.viewmodel.impl.FingerViewModelImpl


@AndroidEntryPoint
class FingerScreen : Fragment(R.layout.screen_finger) {
    private val binding by viewBinding(ScreenFingerBinding::bind)
    private val viewModel: FingerViewModel by viewModels<FingerViewModelImpl>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.openHomeScreenLiveData.observe(this, openHomeScreenObserver)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            buttonFingerContinue.setOnClickListener {
                viewModel.clickSkipButton()
            }
        }
    }


    private val openHomeScreenObserver = Observer<Unit> {
        findNavController().navigate(R.id.action_fingerScreen_to_nestedScreen)
    }
}