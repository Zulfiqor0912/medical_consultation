package uz.gita.medicalconsultation.presentation.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.gita.medicalconsultation.presentation.ui.screens.intro.FirstIntro
import uz.gita.medicalconsultation.presentation.ui.screens.intro.SecondIntro
import uz.gita.medicalconsultation.presentation.ui.screens.intro.ThirdIntro

class   IntroAdapter(fr: FragmentActivity) : FragmentStateAdapter(fr) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            1 -> FirstIntro()
            2 -> SecondIntro()
            else -> ThirdIntro()
        }
    }
}