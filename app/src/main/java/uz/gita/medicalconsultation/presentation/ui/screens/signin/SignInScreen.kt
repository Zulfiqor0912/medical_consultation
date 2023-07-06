package uz.gita.medicalconsultation.presentation.ui.screens.signin

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.medicalconsultation.R
import uz.gita.medicalconsultation.databinding.ScreenSignInBinding
import uz.gita.medicalconsultation.presentation.ui.screens.signin.viewmodel.SignInViewModel
import uz.gita.medicalconsultation.presentation.ui.screens.signin.viewmodel.impl.SignInViewModelImpl

class SignInScreen : Fragment(R.layout.screen_sign_in) {
    private val binding by viewBinding(ScreenSignInBinding::bind)
    private val viewModel: SignInViewModel by viewModels<SignInViewModelImpl>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.openSignUpLiveData.observe(this, openSignUpObserver)
        viewModel.openLetsScreenLiveData.observe(this, openLetsScreenObserver)
        viewModel.openHomeScreenLiveData.observe(this, openHomeScreenObserver)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.apply {
            buttonSignInBack.setOnClickListener {
                viewModel.clickBackButton()
            }

            textSignInToSignUp.setOnClickListener {
                viewModel.clickSignUp()
            }

            buttonSignIn.setOnClickListener {
                viewModel.clickSignInButton()
            }
        }
    }

    private val openSignUpObserver = Observer<Unit> {
        findNavController().navigate(R.id.action_signInScreen_to_signUpScreen)
    }

    private val openLetsScreenObserver = Observer<Unit> {
        findNavController().popBackStack()
    }

    private val openHomeScreenObserver = Observer<Unit> {
        findNavController().navigate(R.id.action_signInScreen_to_nestedScreen)
    }
}