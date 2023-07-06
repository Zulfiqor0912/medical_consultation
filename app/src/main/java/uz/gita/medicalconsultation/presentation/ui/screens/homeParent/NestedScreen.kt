package uz.gita.medicalconsultation.presentation.ui.screens.homeParent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.medicalconsultation.R
import uz.gita.medicalconsultation.databinding.ScreenParentBinding
import uz.gita.medicalconsultation.presentation.ui.adapter.ScreensAdapter
import uz.gita.medicalconsultation.presentation.ui.screens.appointment.AppointmentScreen
import uz.gita.medicalconsultation.presentation.ui.screens.articles.ArticlesScreen
import uz.gita.medicalconsultation.presentation.ui.screens.history.HistoryScreen
import uz.gita.medicalconsultation.presentation.ui.screens.home.HomeScreen
import uz.gita.medicalconsultation.presentation.ui.screens.profile2.Profile2Screen

@AndroidEntryPoint
class NestedScreen : Fragment(R.layout.screen_parent) {
    private val binding by viewBinding(ScreenParentBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapter = ScreensAdapter(childFragmentManager,lifecycle)
        binding.apply {
            parentViewPager.adapter = adapter

            bottomNavigation.setOnItemSelectedListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.homeScreen -> {
                        childFragmentManager
                            .beginTransaction()
                            .replace(R.id.parent, HomeScreen())
                            .commit()
                        true
                    }

                    R.id.appointmentScreen -> {
                        childFragmentManager
                            .beginTransaction()
                            .replace(R.id.parent, AppointmentScreen())
                            .commit()
                        true
                    }

                    R.id.historyScreen -> {
                        childFragmentManager
                            .beginTransaction()
                            .replace(R.id.parent, HistoryScreen())
                            .commit()
                        true
                    }

                    R.id.articlesScreen -> {
                        childFragmentManager
                            .beginTransaction()
                            .replace(R.id.parent, ArticlesScreen())
                            .commit()
                        true
                    }

                    else -> {
                        childFragmentManager
                            .beginTransaction()
                            .replace(R.id.parent, Profile2Screen())
                            .commit()
                        true
                    }
                }
            }
            parentViewPager.registerOnPageChangeCallback(callback)
        }
    }

    private val callback: ViewPager2.OnPageChangeCallback =
        object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                when (position) {
                    0 -> {
                        binding.bottomNavigation.selectedItemId = R.id.homeScreen
                    }
                    1->{
                        binding.bottomNavigation.selectedItemId = R.id.appointmentScreen
                    }
                    2->{
                        binding.bottomNavigation.selectedItemId = R.id.historyScreen
                    }
                    3->{
                        binding.bottomNavigation.selectedItemId = R.id.articlesScreen
                    }
                    else->{
                        binding.bottomNavigation.selectedItemId = R.id.profile2Screen
                    }
                }
            }
        }
}