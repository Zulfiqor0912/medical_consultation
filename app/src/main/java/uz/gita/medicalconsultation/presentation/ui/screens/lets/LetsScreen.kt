package uz.gita.medicalconsultation.presentation.ui.screens.lets

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.medicalconsultation.R
import uz.gita.medicalconsultation.databinding.ScreenLetsBinding
import uz.gita.medicalconsultation.presentation.ui.screens.lets.viewmodel.impl.LetsViewModelImpl

@AndroidEntryPoint
class LetsScreen : Fragment(R.layout.screen_lets) {
    private val binding by viewBinding(ScreenLetsBinding::bind)
    private val viewModel by viewModels<LetsViewModelImpl>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.openSignUpScreenLiveData.observe(this, openSignUpScreenObserver)
        viewModel.openSignInScreenLiveData.observe(this, openSignInScreenLiveData)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.apply {
            textSignUp.setOnClickListener {
                viewModel.clickSignUp()
            }

            buttonLetsSignIn.setOnClickListener {
                viewModel.clickSignIn()
            }

        }


    }

    private val openSignUpScreenObserver = Observer<Unit> {
        findNavController().navigate(R.id.action_letsScreen_to_signUpScreen)
    }

    private val openSignInScreenLiveData = Observer<Unit> {
        findNavController().navigate(R.id.action_letsScreen_to_signInScreen)
    }
}