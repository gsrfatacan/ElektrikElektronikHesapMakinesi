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
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.ActivitySeriRcBinding
import kotlin.math.sqrt

class SeriRC : AppCompatActivity() {

    private lateinit var binding: ActivitySeriRcBinding
    lateinit var mAdView : AdView

    private val kondansatorBirim = ArrayList<String>()
    private lateinit var veriAdaptoru: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeriRcBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MobileAds.initialize(this) {}

        mAdView = findViewById(com.gserifatacan.elektrikelektronikhesapmakinesi.R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val adView = AdView(this)

        adView.adSize

        adView.adUnitId = "ca-app-pub-1879393212966846/1948543313"

        kondansatorBirim.add("Kondansatör Birimi")
        kondansatorBirim.add("Farad")
        kondansatorBirim.add("Mili Farad")
        kondansatorBirim.add("Mikro Farad")
        kondansatorBirim.add("Nano Farad")
        kondansatorBirim.add("Piko Farad")

        veriAdaptoru =
            ArrayAdapter(this, R.layout.simple_list_item_1, R.id.text1, kondansatorBirim)

        binding.spinnerKond.adapter = veriAdaptoru

        binding.spinnerKond.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, indeks: Int, p3: Long) {

                val gelenVeri = kondansatorBirim[indeks]

                binding.buttonSeriRCHesapla.setOnClickListener() {
                    val R = binding.editTextR.text.toString().toFloatOrNull()
                    val C = binding.editTextC.text.toString().toFloatOrNull()
                    val V = binding.edittextV.text.toString().toFloatOrNull()
                    val f = binding.edittextf.text.toString().toFloatOrNull()

                    try {
                        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                        imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
                    } catch (_: Exception) {
                    }

                    if (gelenVeri == "Kondansatör Birimi") {
                        Toast.makeText(
                            applicationContext,
                            com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.paralelrcuyari,
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }

                    if (gelenVeri == "Farad") {
                        if (R != null && C != null && V != null && f != null) {
                            val XC = Math.round((1 / (2 * 3.14 * f * (C))) * 100.0) / 100.0
                            val Z = Math.round((sqrt(R * R + XC * XC)) * 100.0) / 100.0
                            val i = Math.round((V / Z) * 100.0) / 100.0
                            val VC = Math.round((i * XC) * 100.0) / 100.0
                            val VR = Math.round((i * R) * 100.0) / 100.0

                            val XCtamSayi = XC.toInt()
                            val ZtamSayi = Z.toInt()
                            val itamSayi = i.toInt()
                            val VCtamSayi = VC.toInt()
                            val VRtamSayi = VR.toInt()

                            if (XC > XCtamSayi) {
                                binding.textViewSeriXC.text = "XC: $XC Ω"
                            } else {
                                binding.textViewSeriXC.text = "XC: $XCtamSayi Ω"
                            }

                            if (Z > ZtamSayi) {
                                binding.textViewSeriRCZ.text = "Z: $Z Ω"
                            } else {
                                binding.textViewSeriRCZ.text = "Z: $ZtamSayi Ω"
                            }

                            if (VC > VCtamSayi) {
                                binding.textViewSeriRCVC.text = "VC: $VC V"
                            } else {
                                binding.textViewSeriRCVC.text = "VC: $VCtamSayi V"
                            }

                            if (VR > VRtamSayi) {
                                binding.textViewSeriRCVR.text = "VR: $VR V"
                            } else {
                                binding.textViewSeriRCVR.text = "VR: $VRtamSayi V"
                            }

                            if (i > itamSayi) {
                                binding.textViewSeriRCi.text = "I: $i A"
                            } else {
                                binding.textViewSeriRCi.text = "I: $itamSayi A"
                            }
                        } else {
                            Toast.makeText(
                                applicationContext,
                                com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rcuyari,
                                Toast.LENGTH_SHORT
                            )
                                .show()
                        }
                    }

                    if (gelenVeri == "Mili Farad") {
                        if (R != null && C != null && V != null && f != null) {
                            val XC = Math.round((1 / (2 * 3.14 * f * (C / 1000))) * 100.0) / 100.0
                            val Z = Math.round((sqrt(R * R + XC * XC)) * 100.0) / 100.0
                            val i = Math.round((V / Z) * 100.0) / 100.0
                            val VC = Math.round((i * XC) * 100.0) / 100.0
                            val VR = Math.round((i * R) * 100.0) / 100.0

                            val XCtamSayi = XC.toInt()
                            val ZtamSayi = Z.toInt()
                            val itamSayi = i.toInt()
                            val VCtamSayi = VC.toInt()
                            val VRtamSayi = VR.toInt()

                            if (XC > XCtamSayi) {
                                binding.textViewSeriXC.text = "XC: $XC Ω"
                            } else {
                                binding.textViewSeriXC.text = "XC: $XCtamSayi Ω"
                            }

                            if (Z > ZtamSayi) {
                                binding.textViewSeriRCZ.text = "Z: $Z Ω"
                            } else {
                                binding.textViewSeriRCZ.text = "Z: $ZtamSayi Ω"
                            }

                            if (VC > VCtamSayi) {
                                binding.textViewSeriRCVC.text = "VC: $VC V"
                            } else {
                                binding.textViewSeriRCVC.text = "VC: $VCtamSayi V"
                            }

                            if (VR > VRtamSayi) {
                                binding.textViewSeriRCVR.text = "VR: $VR V"
                            } else {
                                binding.textViewSeriRCVR.text = "VR: $VRtamSayi V"
                            }

                            if (i > itamSayi) {
                                binding.textViewSeriRCi.text = "I: $i A"
                            } else {
                                binding.textViewSeriRCi.text = "I: $itamSayi A"
                            }
                        } else {
                            Toast.makeText(
                                applicationContext,
                                com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rcuyari,
                                Toast.LENGTH_SHORT
                            )
                                .show()
                        }
                    }

                    if (gelenVeri == "Mikro Farad") {
                        if (R != null && C != null && V != null && f != null) {
                            val XC =
                                Math.round((1 / (2 * 3.14 * f * (C / 1000000))) * 100.0) / 100.0
                            val Z = Math.round((sqrt(R * R + XC * XC)) * 100.0) / 100.0
                            val i = Math.round((V / Z) * 100.0) / 100.0
                            val VC = Math.round((i * XC) * 100.0) / 100.0
                            val VR = Math.round((i * R) * 100.0) / 100.0

                            val XCtamSayi = XC.toInt()
                            val ZtamSayi = Z.toInt()
                            val itamSayi = i.toInt()
                            val VCtamSayi = VC.toInt()
                            val VRtamSayi = VR.toInt()

                            if (XC > XCtamSayi) {
                                binding.textViewSeriXC.text = "XC: $XC Ω"
                            } else {
                                binding.textViewSeriXC.text = "XC: $XCtamSayi Ω"
                            }

                            if (Z > ZtamSayi) {
                                binding.textViewSeriRCZ.text = "Z: $Z Ω"
                            } else {
                                binding.textViewSeriRCZ.text = "Z: $ZtamSayi Ω"
                            }

                            if (VC > VCtamSayi) {
                                binding.textViewSeriRCVC.text = "VC: $VC V"
                            } else {
                                binding.textViewSeriRCVC.text = "VC: $VCtamSayi V"
                            }

                            if (VR > VRtamSayi) {
                                binding.textViewSeriRCVR.text = "VR: $VR V"
                            } else {
                                binding.textViewSeriRCVR.text = "VR: $VRtamSayi V"
                            }

                            if (i > itamSayi) {
                                binding.textViewSeriRCi.text = "I: $i A"
                            } else {
                                binding.textViewSeriRCi.text = "I: $itamSayi A"
                            }
                        } else {
                            Toast.makeText(
                                applicationContext,
                                com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rcuyari,
                                Toast.LENGTH_SHORT
                            )
                                .show()
                        }
                    }

                    if (gelenVeri == "Nano Farad") {
                        if (R != null && C != null && V != null && f != null) {
                            val XC =
                                Math.round((1 / (2 * 3.14 * f * (C / 1000000000))) * 100.0) / 100.0
                            val Z = Math.round((sqrt(R * R + XC * XC)) * 100.0) / 100.0
                            val i = Math.round((V / Z) * 100.0) / 100.0
                            val VC = Math.round((i * XC) * 100.0) / 100.0
                            val VR = Math.round((i * R) * 100.0) / 100.0

                            val XCtamSayi = XC.toInt()
                            val ZtamSayi = Z.toInt()
                            val itamSayi = i.toInt()
                            val VCtamSayi = VC.toInt()
                            val VRtamSayi = VR.toInt()

                            if (XC > XCtamSayi) {
                                binding.textViewSeriXC.text = "XC: $XC Ω"
                            } else {
                                binding.textViewSeriXC.text = "XC: $XCtamSayi Ω"
                            }

                            if (Z > ZtamSayi) {
                                binding.textViewSeriRCZ.text = "Z: $Z Ω"
                            } else {
                                binding.textViewSeriRCZ.text = "Z: $ZtamSayi Ω"
                            }

                            if (VC > VCtamSayi) {
                                binding.textViewSeriRCVC.text = "VC: $VC V"
                            } else {
                                binding.textViewSeriRCVC.text = "VC: $VCtamSayi V"
                            }

                            if (VR > VRtamSayi) {
                                binding.textViewSeriRCVR.text = "VR: $VR V"
                            } else {
                                binding.textViewSeriRCVR.text = "VR: $VRtamSayi V"
                            }

                            if (i > itamSayi) {
                                binding.textViewSeriRCi.text = "I: $i A"
                            } else {
                                binding.textViewSeriRCi.text = "I: $itamSayi A"
                            }
                        } else {
                            Toast.makeText(
                                applicationContext,
                                com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rcuyari,
                                Toast.LENGTH_SHORT
                            )
                                .show()
                        }
                    }

                    if (gelenVeri == "Piko Farad") {
                        if (R != null && C != null && V != null && f != null) {
                            val XC =
                                Math.round((1 / (2 * 3.14 * f * (C / 1000000000000))) * 100.0) / 100.0
                            val Z = Math.round((sqrt(R * R + XC * XC)) * 100.0) / 100.0
                            val i = Math.round((V / Z) * 100.0) / 100.0
                            val VC = Math.round((i * XC) * 100.0) / 100.0
                            val VR = Math.round((i * R) * 100.0) / 100.0

                            val XCtamSayi = XC.toInt()
                            val ZtamSayi = Z.toInt()
                            val itamSayi = i.toInt()
                            val VCtamSayi = VC.toInt()
                            val VRtamSayi = VR.toInt()

                            if (XC > XCtamSayi) {
                                binding.textViewSeriXC.text = "XC: $XC Ω"
                            } else {
                                binding.textViewSeriXC.text = "XC: $XCtamSayi Ω"
                            }

                            if (Z > ZtamSayi) {
                                binding.textViewSeriRCZ.text = "Z: $Z Ω"
                            } else {
                                binding.textViewSeriRCZ.text = "Z: $ZtamSayi Ω"
                            }

                            if (VC > VCtamSayi) {
                                binding.textViewSeriRCVC.text = "VC: $VC V"
                            } else {
                                binding.textViewSeriRCVC.text = "VC: $VCtamSayi V"
                            }

                            if (VR > VRtamSayi) {
                                binding.textViewSeriRCVR.text = "VR: $VR V"
                            } else {
                                binding.textViewSeriRCVR.text = "VR: $VRtamSayi V"
                            }

                            if (i > itamSayi) {
                                binding.textViewSeriRCi.text = "I: $i A"
                            } else {
                                binding.textViewSeriRCi.text = "I: $itamSayi A"
                            }
                        } else {
                            Toast.makeText(
                                applicationContext,
                                com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rcuyari,
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