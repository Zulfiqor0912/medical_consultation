package uz.gita.medicalconsultation.presentation.ui.screens.signup

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.medicalconsultation.R
import uz.gita.medicalconsultation.databinding.ScreenSignUpBinding
import uz.gita.medicalconsultation.presentation.ui.screens.signup.viewmodel.SignUpViewModel
import uz.gita.medicalconsultation.presentation.ui.screens.signup.viewmodel.impl.SignUpViewModelImpl

class SignUpScreen : Fragment(R.layout.screen_sign_up) {
    private val binding by viewBinding(ScreenSignUpBinding::bind)
    private val viewModel: SignUpViewModel by viewModels<SignUpViewModelImpl>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.openLetsScreenLiveData.observe(this, openLetsScreenObserver)
        viewModel.openSignInScreenLiveData.observe(this, openSignInScreenObserver)
        viewModel.openProfileScreenLiveData.observe(this,openPrifeScreenObserver)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.apply {
            buttonSignupBack.setOnClickListener {
                viewModel.clickBackButton()
            }

            textSignUpToSignIn.setOnClickListener {
                viewModel.clickSignInButton()
            }

            buttonSignUp.setOnClickListener {
                viewModel.clickSignUpButton()
            }
        }
    }

    private val openLetsScreenObserver = Observer<Unit> {
        Log.d("TTT", "back")
        findNavController().popBackStack()
    }

    private val openSignInScreenObserver = Observer<Unit> {
        findNavController().navigate(R.id.action_signUpScreen_to_signInScreen)
    }

    private val openPrifeScreenObserver = Observer<Unit> {
        findNavController().navigate(R.id.action_signUpScreen_to_profileScreen)
    }
}