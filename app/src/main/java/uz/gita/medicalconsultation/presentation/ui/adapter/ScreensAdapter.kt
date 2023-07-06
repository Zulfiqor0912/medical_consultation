package uz.gita.medicalconsultation.presentation.ui.adapter

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.gita.medicalconsultation.presentation.ui.screens.appointment.AppointmentScreen
import uz.gita.medicalconsultation.presentation.ui.screens.articles.ArticlesScreen
import uz.gita.medicalconsultation.presentation.ui.screens.history.HistoryScreen
import uz.gita.medicalconsultation.presentation.ui.screens.home.HomeScreen
import uz.gita.medicalconsultation.presentation.ui.screens.profile2.Profile2Screen

class ScreensAdapter(fm:FragmentManager,lifecycle: Lifecycle) : FragmentStateAdapter(fm,lifecycle) {
    override fun getItemCount(): Int = 5

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeScreen().apply {
                arguments = bundleOf(Pair("POS",position))
            }
            1 -> AppointmentScreen().apply {
                arguments = bundleOf(Pair("POS",position))
            }
            2 -> HistoryScreen().apply {
                arguments = bundleOf(Pair("POS",position))
            }
            3 -> ArticlesScreen().apply {
                arguments = bundleOf(Pair("POS",position))
            }
            else -> Profile2Screen().apply {
                arguments = bundleOf(Pair("POS",position))
            }
        }
    }
}