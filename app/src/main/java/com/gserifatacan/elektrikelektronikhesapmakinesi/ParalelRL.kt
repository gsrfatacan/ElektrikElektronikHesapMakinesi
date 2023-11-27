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
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.ActivityParalelRlBinding
import kotlin.math.sqrt

class ParalelRL : AppCompatActivity() {

    private lateinit var binding: ActivityParalelRlBinding
    lateinit var mAdView : AdView

    private val bobinBirim = ArrayList<String>()
    private lateinit var veriAdaptoru: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParalelRlBinding.inflate(layoutInflater)
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

        binding.spinnerBobin.adapter = veriAdaptoru

        binding.spinnerBobin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, indeks: Int, p3: Long) {

                val gelenVeri = bobinBirim[indeks]

                binding.buttonParalelRLHesapla.setOnClickListener() {
                    val R = binding.editTextParalelRLR.text.toString().toFloatOrNull()
                    val L = binding.editTextParalelRLL.text.toString().toFloatOrNull()
                    val V = binding.editTextParalelRLV.text.toString().toFloatOrNull()
                    val f = binding.editTextParalelRLf.text.toString().toFloatOrNull()

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
                            val iL = Math.round((V / XL) * 100.0) / 100.0
                            val iR = Math.round((V / R) * 100.0) / 100.0
                            val i = Math.round(sqrt(iR * iR + iL * iL) * 100.0) / 100.0
                            val Z = Math.round((V / i) * 100.0) / 100.0

                            val XLtamSayi = XL.toInt()
                            val ZtamSayi = Z.toInt()
                            val itamSayi = i.toInt()
                            val iLtamSayi = iL.toInt()
                            val iRtamSayi = iR.toInt()

                            if (XL > XLtamSayi) {
                                binding.textViewParalelRLXL.text = "XL: $XL Ω"
                            } else {
                                binding.textViewParalelRLXL.text = "XL: $XLtamSayi Ω"
                            }

                            if (Z > ZtamSayi) {
                                binding.textViewParalelRLZ.text = "Z: $Z Ω"
                            } else {
                                binding.textViewParalelRLZ.text = "Z: $ZtamSayi Ω"
                            }

                            if (iL > iLtamSayi) {
                                binding.textViewParelelRLiL.text = "IL: $iL A"
                            } else {
                                binding.textViewParelelRLiL.text = "IL: $iLtamSayi A"
                            }

                            if (iR > iRtamSayi) {
                                binding.textViewParalelRLiR.text = "IR: $iR A"
                            } else {
                                binding.textViewParalelRLiR.text = "IR: $iRtamSayi A"
                            }

                            if (i > itamSayi) {
                                binding.textViewParalelRLi.text = "I: $i A"
                            } else {
                                binding.textViewParalelRLi.text = "I: $itamSayi A"
                            }
                        }else {
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
                            val iL = Math.round((V / XL) * 100.0) / 100.0
                            val iR = Math.round((V / R) * 100.0) / 100.0
                            val i = Math.round(sqrt(iR * iR + iL * iL) * 100.0) / 100.0
                            val Z = Math.round((V / i) * 100.0) / 100.0

                            val XLtamSayi = XL.toInt()
                            val ZtamSayi = Z.toInt()
                            val itamSayi = i.toInt()
                            val iLtamSayi = iL.toInt()
                            val iRtamSayi = iR.toInt()

                            if (XL > XLtamSayi) {
                                binding.textViewParalelRLXL.text = "XL: $XL Ω"
                            } else {
                                binding.textViewParalelRLXL.text = "XL: $XLtamSayi Ω"
                            }

                            if (Z > ZtamSayi) {
                                binding.textViewParalelRLZ.text = "Z: $Z Ω"
                            } else {
                                binding.textViewParalelRLZ.text = "Z: $ZtamSayi Ω"
                            }

                            if (iL > iLtamSayi) {
                                binding.textViewParelelRLiL.text = "IL: $iL A"
                            } else {
                                binding.textViewParelelRLiL.text = "IL: $iLtamSayi A"
                            }

                            if (iR > iRtamSayi) {
                                binding.textViewParalelRLiR.text = "IR: $iR A"
                            } else {
                                binding.textViewParalelRLiR.text = "IR: $iRtamSayi A"
                            }

                            if (i > itamSayi) {
                                binding.textViewParalelRLi.text = "I: $i A"
                            } else {
                                binding.textViewParalelRLi.text = "I: $itamSayi A"
                            }
                        }else {
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
                            val iL = Math.round((V / XL) * 100.0) / 100.0
                            val iR = Math.round((V / R) * 100.0) / 100.0
                            val i = Math.round(sqrt(iR * iR + iL * iL) * 100.0) / 100.0
                            val Z = Math.round((V / i) * 100.0) / 100.0

                            val XLtamSayi = XL.toInt()
                            val ZtamSayi = Z.toInt()
                            val itamSayi = i.toInt()
                            val iLtamSayi = iL.toInt()
                            val iRtamSayi = iR.toInt()

                            if (XL > XLtamSayi) {
                                binding.textViewParalelRLXL.text = "XL: $XL Ω"
                            } else {
                                binding.textViewParalelRLXL.text = "XL: $XLtamSayi Ω"
                            }

                            if (Z > ZtamSayi) {
                                binding.textViewParalelRLZ.text = "Z: $Z Ω"
                            } else {
                                binding.textViewParalelRLZ.text = "Z: $ZtamSayi Ω"
                            }

                            if (iL > iLtamSayi) {
                                binding.textViewParelelRLiL.text = "IL: $iL A"
                            } else {
                                binding.textViewParelelRLiL.text = "IL: $iLtamSayi A"
                            }

                            if (iR > iRtamSayi) {
                                binding.textViewParalelRLiR.text = "IR: $iR A"
                            } else {
                                binding.textViewParalelRLiR.text = "IR: $iRtamSayi A"
                            }

                            if (i > itamSayi) {
                                binding.textViewParalelRLi.text = "I: $i A"
                            } else {
                                binding.textViewParalelRLi.text = "I: $itamSayi A"
                            }
                        }else {
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