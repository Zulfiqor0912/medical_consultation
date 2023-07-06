package uz.gita.medicalconsultation.presentation.ui.screens.profile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.medicalconsultation.R
import uz.gita.medicalconsultation.databinding.ScreenProfileBinding
import uz.gita.medicalconsultation.presentation.ui.screens.profile.viewmodel.ProfileViewModel
import uz.gita.medicalconsultation.presentation.ui.screens.profile.viewmodel.impl.ProfileViewModelImpl

@AndroidEntryPoint
class ProfileScreen : Fragment(R.layout.screen_profile) {
    private val binding by viewBinding(ScreenProfileBinding::bind)
    private val viewModel: ProfileViewModel by viewModels<ProfileViewModelImpl>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.openSignUpScreenLiveData.observe(this, openSignUpScreenObserver)
        viewModel.openFingerScreenLiveData.observe(this, openFingerScreenObserver)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            buttonProfileContinue.setOnClickListener {
                viewModel.clickContinueButton()
            }

            buttonLetsBack.setOnClickListener {
                viewModel.clickBackButton()
            }
        }
    }

    private val openSignUpScreenObserver = Observer<Unit> {
        findNavController().popBackStack()
    }

    private val openFingerScreenObserver = Observer<Unit> {
        findNavController().navigate(R.id.action_profileScreen_to_fingerScreen)
    }
}