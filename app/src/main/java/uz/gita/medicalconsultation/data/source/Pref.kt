package uz.gita.medicalconsultation.data.source

import android.content.Context
import uz.gita.medicalconsultation.util.Constants.*
import javax.inject.Inject

class Pref @Inject constructor(context: Context) {
    private val sharedPref = context.getSharedPreferences(PREF_NAME.name, Context.MODE_PRIVATE)
}