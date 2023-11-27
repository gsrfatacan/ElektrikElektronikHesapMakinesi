package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.ActivitySeriRlBinding
import kotlin.math.sqrt

class SeriRL : AppCompatActivity() {

    private lateinit var binding: ActivitySeriRlBinding
    lateinit var mAdView : AdView

    private val bobinBirim = ArrayList<String>()
    private lateinit var veriAdaptoru: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeriRlBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MobileAds.initialize(this) {}

        mAdView = findViewById(com.gserifatacan.elektrikelektronikhesapmakinesi.R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val adView = AdView(this)

        adView.adSize

        adView.adUnitId = "ca-app-pub-1879393212966846/1948543313"

        bobinBirim.add("Bobin Birimi")
        bobinBirim.add("Henry")
        bobinBirim.add("Mili Henry")
        bobinBirim.add("Micro Henry")

        veriAdaptoru =
            ArrayAdapter(this, R.layout.simple_list_item_1, R.id.text1, bobinBirim)

        binding.spinnerBob.adapter = veriAdaptoru

        binding.spinnerBob.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, indeks: Int, p3: Long) {

                val gelenVeri = bobinBirim[indeks]

                binding.buttonSerilRLHesapla.setOnClickListener() {
                    val R = binding.edittextR.text.toString().toFloatOrNull()
                    val L = binding.editTextL.text.toString().toFloatOrNull()
                    val V = binding.editTextV.text.toString().toFloatOrNull()
                    val f = binding.editTextf.text.toString().toFloatOrNull()

                    try {
                        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                        imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
                    } catch (_: Exception) {
                    }

                    if (gelenVeri == "Bobin Birimi") {
                        Toast.makeText(
                            applicationContext,
                            com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.paralelrluyari,
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }

                    if (gelenVeri == "Henry") {
                        if (R != null && L != null && V != null && f != null) {
                            val XL = Math.round((2 * 3.14 * f * (L)) * 100.0) / 100.0
                            val Z = Math.round((sqrt(R * R + XL * XL)) * 100.0) / 100.0
                            val i = Math.round((V / Z) * 100.0) / 100.0
                            val VL = Math.round((i * XL) * 100.0) / 100.0
                            val VR = Math.round((i * R) * 100.0) / 100.0

                            val XLtamSayi = XL.toInt()
                            val ZtamSayi = Z.toInt()
                            val itamSayi = i.toInt()
                            val VLtamSayi = VL.toInt()
                            val VRtamSayi = VR.toInt()

                            if (XL > XLtamSayi) {
                                binding.textViewXL.text = "XL: $XL Ω"
                            } else {
                                binding.textViewXL.text = "XL: $XLtamSayi Ω"
                            }

                            if (Z > ZtamSayi) {
                                binding.textViewZ.text = "Z: $Z Ω"
                            } else {
                                binding.textViewZ.text = "Z: $ZtamSayi Ω"
                            }

                            if (VL > VLtamSayi) {
                                binding.textViewVL.text = "VL: $VL V"
                            } else {
                                binding.textViewVL.text = "VL: $VLtamSayi V"
                            }

                            if (VR > VRtamSayi) {
                                binding.textViewVR.text = "VR: $VR V"
                            } else {
                                binding.textViewVR.text = "VR: $VRtamSayi V"
                            }

                            if (i > itamSayi) {
                                binding.textViewi.text = "I: $i A"
                            } else {
                                binding.textViewi.text = "I: $itamSayi A"
                            }
                        } else {
                            Toast.makeText(
                                applicationContext,
                                com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rluyari,
                                Toast.LENGTH_SHORT
                            )
                                .show()
                        }
                    }

                    if (gelenVeri == "Mili Henry") {
                        if (R != null && L != null && V != null && f != null) {
                            val XL = Math.round((2 * 3.14 * f * (L / 1000)) * 100.0) / 100.0
                            val Z = Math.round((sqrt(R * R + XL * XL)) * 100.0) / 100.0
                            val i = Math.round((V / Z) * 100.0) / 100.0
                            val VL = Math.round((i * XL) * 100.0) / 100.0
                            val VR = Math.round((i * R) * 100.0) / 100.0

                            val XLtamSayi = XL.toInt()
                            val ZtamSayi = Z.toInt()
                            val itamSayi = i.toInt()
                            val VLtamSayi = VL.toInt()
                            val VRtamSayi = VR.toInt()

                            if (XL > XLtamSayi) {
                                binding.textViewXL.text = "XL: $XL Ω"
                            } else {
                                binding.textViewXL.text = "XL: $XLtamSayi Ω"
                            }

                            if (Z > ZtamSayi) {
                                binding.textViewZ.text = "Z: $Z Ω"
                            } else {
                                binding.textViewZ.text = "Z: $ZtamSayi Ω"
                            }

                            if (VL > VLtamSayi) {
                                binding.textViewVL.text = "VL: $VL V"
                            } else {
                                binding.textViewVL.text = "VL: $VLtamSayi V"
                            }

                            if (VR > VRtamSayi) {
                                binding.textViewVR.text = "VR: $VR V"
                            } else {
                                binding.textViewVR.text = "VR: $VRtamSayi V"
                            }

                            if (i > itamSayi) {
                                binding.textViewi.text = "I: $i A"
                            } else {
                                binding.textViewi.text = "I: $itamSayi A"
                            }
                        } else {
                            Toast.makeText(
                                applicationContext,
                                com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rluyari,
                                Toast.LENGTH_SHORT
                            )
                                .show()
                        }
                    }

                    if (gelenVeri == "Micro Henry") {
                        if (R != null && L != null && V != null && f != null) {
                            val XL = Math.round((2 * 3.14 * f * (L / 1000000)) * 100.0) / 100.0
                            val Z = Math.round((sqrt(R * R + XL * XL)) * 100.0) / 100.0
                            val i = Math.round((V / Z) * 100.0) / 100.0
                            val VL = Math.round((i * XL) * 100.0) / 100.0
                            val VR = Math.round((i * R) * 100.0) / 100.0

                            val XLtamSayi = XL.toInt()
                            val ZtamSayi = Z.toInt()
                            val itamSayi = i.toInt()
                            val VLtamSayi = VL.toInt()
                            val VRtamSayi = VR.toInt()

                            if (XL > XLtamSayi) {
                                binding.textViewXL.text = "XL: $XL Ω"
                            } else {
                                binding.textViewXL.text = "XL: $XLtamSayi Ω"
                            }

                            if (Z > ZtamSayi) {
                                binding.textViewZ.text = "Z: $Z Ω"
                            } else {
                                binding.textViewZ.text = "Z: $ZtamSayi Ω"
                            }

                            if (VL > VLtamSayi) {
                                binding.textViewVL.text = "VL: $VL V"
                            } else {
                                binding.textViewVL.text = "VL: $VLtamSayi V"
                            }

                            if (VR > VRtamSayi) {
                                binding.textViewVR.text = "VR: $VR V"
                            } else {
                                binding.textViewVR.text = "VR: $VRtamSayi V"
                            }

                            if (i > itamSayi) {
                                binding.textViewi.text = "I: $i A"
                            } else {
                                binding.textViewi.text = "I: $itamSayi A"
                            }
                        } else {
                            Toast.makeText(
                                applicationContext,
                                com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rluyari,
                                Toast.LENGTH_SHORT
                            )
                                .show()
                        }
                    }
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
    }
}