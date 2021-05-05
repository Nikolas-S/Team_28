package com.team28.thehiker.SharedPreferenceHandler

import android.app.Activity
import android.content.Context
import com.team28.thehiker.Constants.Constants

class SharedPreferenceHandler : ISharedPreferenceHandler {

    override fun getLocalizationString(context: Activity): String? {
        val sharedPref = context?.getPreferences(Context.MODE_PRIVATE)
        return sharedPref.getString(Constants.SharedPreferenceConstants.LOCALIZATION, Constants.SharedPreferenceConstants.LOCALIZATION_DEFAULT)
    }

    override fun setLocalizationString(context: Activity, localizationString: String) {
        val sharedPref = context?.getPreferences(Context.MODE_PRIVATE) ?: return
        with (sharedPref.edit()) {
            putString(Constants.SharedPreferenceConstants.LOCALIZATION, localizationString)
            apply()
        }
    }

}