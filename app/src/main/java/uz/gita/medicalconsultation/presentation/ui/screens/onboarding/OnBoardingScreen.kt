package uz.gita.medicalconsultation.presentation.ui.screens.onboarding

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.medicalconsultation.R
import uz.gita.medicalconsultation.databinding.ScreenZeroIntroBinding
import uz.gita.medicalconsultation.presentation.ui.screens.onboarding.viewmodel.impl.OnBoardingViewModelImpl

@AndroidEntryPoint
class OnBoardingScreen : Fragment(R.layout.screen_zero_intro) {
    private val binding by viewBinding(ScreenZeroIntroBinding::bind)
    private val viewModel by viewModels<OnBoardingViewModelImpl>()
    private lateinit var h: Handler

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.openIntroScreenLiveData.observe(viewLifecycleOwner, openIntoScreensObserver)
        h = Handler(Looper.getMainLooper())
        h.postDelayed({
            viewModel.openIntroScreens()
        }, 3000)
    }


    private val openIntoScreensObserver = Observer<Unit> {
        findNavController().navigate(R.id.action_onBoardingScreen_to_introParent)
    }
}