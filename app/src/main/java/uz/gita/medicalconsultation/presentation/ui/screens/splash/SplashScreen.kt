package uz.gita.medicalconsultation.presentation.ui.screens.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.medicalconsultation.R
import uz.gita.medicalconsultation.presentation.ui.screens.splash.viewModel.impl.SplashViewModelImpl

@AndroidEntryPoint
class SplashScreen : Fragment(R.layout.screen_splash) {
    private val viewModel by viewModels<SplashViewModelImpl>()
    private lateinit var h: Handler


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.onBoardingLiveData.observe(viewLifecycleOwner, openOnBoardingScreenObserver)
        h = Handler(Looper.getMainLooper())
        h.postDelayed({
            viewModel.openOnBoardingScreen()
        }, 5000)
    }

    private val openOnBoardingScreenObserver = Observer<Unit> {
        findNavController().navigate(R.id.action_splashScreen_to_onBoardingScreen)
    }

}