package tech.gamedev.freefit.ui.fragments.settings

import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.settings_fragment.*
import tech.gamedev.freefit.R
import tech.gamedev.freefit.data.db.other.Constants.KEY_HEIGHT
import tech.gamedev.freefit.data.db.other.Constants.KEY_NAME
import tech.gamedev.freefit.data.db.other.Constants.KEY_WEIGHT
import tech.gamedev.freefit.ui.MainActivity
import javax.inject.Inject
import kotlin.math.roundToInt

@AndroidEntryPoint
class SettingsFragment : Fragment(R.layout.settings_fragment) {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUserDetails()
        loadFieldsFromSharedPref()

        btnApplyChanges.setOnClickListener {
            val success = applyChangesToSharedPref()
            if (success) {
                Snackbar.make(view, "Saved changes", Snackbar.LENGTH_LONG).show()
            } else {
                Snackbar.make(view, "Please fill out all the fields", Snackbar.LENGTH_LONG).show()
            }
        }
    }

    private fun loadFieldsFromSharedPref() {
        val name = sharedPreferences.getString(KEY_NAME, "")
        val weight = sharedPreferences.getFloat(KEY_WEIGHT, 80f)
        val height = sharedPreferences.getFloat(KEY_HEIGHT, 170f)

        etName.setText(name)
        etWeight.setText(weight.toString())
        etHeight.setText(height.toString())
        calculateBMI()
    }

    private fun applyChangesToSharedPref(): Boolean {
        val nameText = etName.text.toString()
        val weightText = etWeight.text.toString()
        val heightText = etHeight.text.toString()

        if (nameText.isEmpty() || weightText.isEmpty() || heightText.isEmpty()) {
            return false
        }
        sharedPreferences.edit()
            .putString(KEY_NAME, nameText)
            .putFloat(KEY_WEIGHT, weightText.toFloat())
            .putFloat(KEY_HEIGHT, heightText.toFloat())
            .apply()

        calculateBMI()

        return true
    }

    private fun calculateBMI(): Boolean {
        val nameText = etName.text.toString()
        val weightText = etWeight.text.toString()
        val heightText = etHeight.text.toString()


        val weight = weightText.toFloat()
        val height = heightText.toFloat() / 100

        if (nameText.isEmpty() || weightText.isEmpty() || heightText.isEmpty()) {
            return false
        }

        val bmi = (weight / (height * height)).roundToInt()
        tvBmiValue.text = bmi.toString()

        return true
    }

    @SuppressLint("CheckResult")
    fun setUserDetails() {
        if (MainActivity.personGivenName != null && MainActivity.personPhoto != null) {
            Glide.with(this)
                .load(
                    MainActivity
                        .personPhoto
                )
                .into(ivProfileImg)

            tvProfileName.text = MainActivity.personName
        } else {
            ivProfileImg.visibility = View.GONE
            tvProfileName.visibility = View.GONE
        }
    }
}