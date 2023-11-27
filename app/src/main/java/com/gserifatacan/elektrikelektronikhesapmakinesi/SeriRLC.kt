package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.R
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.ActivitySeriRlcBinding
import kotlin.math.sqrt

class SeriRLC : AppCompatActivity() {

    private lateinit var binding: ActivitySeriRlcBinding
    lateinit var mAdView : AdView

    private val bobinBirim = ArrayList<String>()
    private lateinit var veriAdaptoru1: ArrayAdapter<String>

    private val kondansatorBirim = ArrayList<String>()
    private lateinit var veriAdaptoru2: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeriRlcBinding.inflate(layoutInflater)
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
        bobinBirim.add("Mikro Henry")

        veriAdaptoru1 =
            ArrayAdapter(this, R.layout.simple_list_item_1, R.id.text1, bobinBirim)

        binding.spinnerBobinBirim.adapter = veriAdaptoru1

        kondansatorBirim.add("Kondansatör Birimi")
        kondansatorBirim.add("Farad")
        kondansatorBirim.add("Mili Farad")
        kondansatorBirim.add("Mikro Farad")
        kondansatorBirim.add("Nano Farad")
        kondansatorBirim.add("Piko Farad")

        veriAdaptoru2 =
            ArrayAdapter(this, R.layout.simple_list_item_1, R.id.text1, kondansatorBirim)

        binding.spinnerKondansatorBirim.adapter = veriAdaptoru2

        binding.buttonSeriRLCHesapla.setOnClickListener(){
            val R = binding.editTextSeriRLCR.text.toString().toFloatOrNull()
            val L = binding.editTextSeriRLCL.text.toString().toFloatOrNull()
            val C = binding.editTextSeriRLCC.text.toString().toFloatOrNull()
            val V = binding.editTextSeriRLCV.text.toString().toFloatOrNull()
            val f = binding.editTextSeriRLCf.text.toString().toFloatOrNull()

            try {
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
            } catch (_: Exception) {
            }

            val secilenBobinBirim = binding.spinnerBobinBirim.selectedItem.toString()

            val secilenKondansatorBirim = binding.spinnerKondansatorBirim.selectedItem.toString()

            if (secilenBobinBirim == "Bobin Birimi"){
                Toast.makeText(
                    applicationContext,
                    com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.paralelrluyari,
                    Toast.LENGTH_SHORT
                )
                    .show()
            }
            if (secilenKondansatorBirim == "Kondansatör Birimi"){
                Toast.makeText(
                    applicationContext,
                    com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.paralelrcuyari,
                    Toast.LENGTH_SHORT
                )
                    .show()
            }

            if (secilenBobinBirim == "Henry" && secilenKondansatorBirim == "Farad") {
                if (R != null && L != null && C != null && V != null && f != null) {
                    val XL = Math.round(((2 * 3.14 * f * (L))) * 100.0) / 100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C))) * 100.0) / 100.0
                    val Z = Math.round((sqrt(R * R + ((XL - XC)*(XL - XC))) * 100.0)) / 100.0
                    val i = Math.round((V / Z) * 100.0) / 100.0
                    val VL = Math.round((i * XL)*100.0)/100.0
                    val VC = Math.round((i * XC)*100.0)/100.0
                    val VR = Math.round((i * R)*100.0)/100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val VLtamSayi = VL.toInt()
                    val VCtamSayi = VC.toInt()
                    val VRtamSayi = VR.toInt()

                    if (XL > XLtamSayi) {
                        binding.textViewSeriRLCXL.text = "XL: $XL Ω"
                    } else {
                        binding.textViewSeriRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewSeriRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewSeriRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if (Z > ZtamSayi) {
                        binding.textViewSeriRLCZ.text = "Z: $Z Ω"
                    } else {
                        binding.textViewSeriRLCZ.text = "Z: $ZtamSayi Ω"
                    }

                    if (VL > VLtamSayi) {
                        binding.textViewSeriRLCVL.text = "VL: $VL V"
                    } else {
                        binding.textViewSeriRLCVL.text = "VL: $VLtamSayi V"
                    }

                    if (VC > VCtamSayi) {
                        binding.textViewSeriRLCVC.text = "VC: $VC V"
                    } else {
                        binding.textViewSeriRLCVC.text = "VC: $VCtamSayi V"
                    }

                    if (VR > VRtamSayi) {
                        binding.textViewSeriRLCVR.text = "VR: $VR V"
                    } else {
                        binding.textViewSeriRLCVR.text = "VR: $VRtamSayi V"
                    }

                    if (i > itamSayi) {
                        binding.textViewSeriRLCi.text = "I: $i A"
                    } else {
                        binding.textViewSeriRLCi.text = "I: $itamSayi A"
                    }
                }else {
                    Toast.makeText(
                        applicationContext,
                        com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rlcuyari,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            if (secilenBobinBirim == "Henry" && secilenKondansatorBirim == "Mili Farad") {
                if (R != null && L != null && C != null && V != null && f != null) {
                    val XL = Math.round(((2 * 3.14 * f * (L))) * 100.0) / 100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000))) * 100.0) / 100.0
                    val Z = Math.round((sqrt(R * R + ((XL - XC)*(XL - XC))) * 100.0)) / 100.0
                    val i = Math.round((V / Z) * 100.0) / 100.0
                    val VL = Math.round((i * XL)*100.0)/100.0
                    val VC = Math.round((i * XC)*100.0)/100.0
                    val VR = Math.round((i * R)*100.0)/100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val VLtamSayi = VL.toInt()
                    val VCtamSayi = VC.toInt()
                    val VRtamSayi = VR.toInt()

                    if (XL > XLtamSayi) {
                        binding.textViewSeriRLCXL.text = "XL: $XL Ω"
                    } else {
                        binding.textViewSeriRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewSeriRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewSeriRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if (Z > ZtamSayi) {
                        binding.textViewSeriRLCZ.text = "Z: $Z Ω"
                    } else {
                        binding.textViewSeriRLCZ.text = "Z: $ZtamSayi Ω"
                    }

                    if (VL > VLtamSayi) {
                        binding.textViewSeriRLCVL.text = "VL: $VL V"
                    } else {
                        binding.textViewSeriRLCVL.text = "VL: $VLtamSayi V"
                    }

                    if (VC > VCtamSayi) {
                        binding.textViewSeriRLCVC.text = "VC: $VC V"
                    } else {
                        binding.textViewSeriRLCVC.text = "VC: $VCtamSayi V"
                    }

                    if (VR > VRtamSayi) {
                        binding.textViewSeriRLCVR.text = "VR: $VR V"
                    } else {
                        binding.textViewSeriRLCVR.text = "VR: $VRtamSayi V"
                    }

                    if (i > itamSayi) {
                        binding.textViewSeriRLCi.text = "I: $i A"
                    } else {
                        binding.textViewSeriRLCi.text = "I: $itamSayi A"
                    }
                }else {
                    Toast.makeText(
                        applicationContext,
                        com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rlcuyari,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            if (secilenBobinBirim == "Henry" && secilenKondansatorBirim == "Mikro Farad") {
                if (R != null && L != null && C != null && V != null && f != null) {
                    val XL = Math.round(((2 * 3.14 * f * (L))) * 100.0) / 100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000))) * 100.0) / 100.0
                    val Z = Math.round((sqrt(R * R + ((XL - XC)*(XL - XC))) * 100.0)) / 100.0
                    val i = Math.round((V / Z) * 100.0) / 100.0
                    val VL = Math.round((i * XL)*100.0)/100.0
                    val VC = Math.round((i * XC)*100.0)/100.0
                    val VR = Math.round((i * R)*100.0)/100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val VLtamSayi = VL.toInt()
                    val VCtamSayi = VC.toInt()
                    val VRtamSayi = VR.toInt()

                    if (XL > XLtamSayi) {
                        binding.textViewSeriRLCXL.text = "XL: $XL Ω"
                    } else {
                        binding.textViewSeriRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewSeriRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewSeriRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if (Z > ZtamSayi) {
                        binding.textViewSeriRLCZ.text = "Z: $Z Ω"
                    } else {
                        binding.textViewSeriRLCZ.text = "Z: $ZtamSayi Ω"
                    }

                    if (VL > VLtamSayi) {
                        binding.textViewSeriRLCVL.text = "VL: $VL V"
                    } else {
                        binding.textViewSeriRLCVL.text = "VL: $VLtamSayi V"
                    }

                    if (VC > VCtamSayi) {
                        binding.textViewSeriRLCVC.text = "VC: $VC V"
                    } else {
                        binding.textViewSeriRLCVC.text = "VC: $VCtamSayi V"
                    }

                    if (VR > VRtamSayi) {
                        binding.textViewSeriRLCVR.text = "VR: $VR V"
                    } else {
                        binding.textViewSeriRLCVR.text = "VR: $VRtamSayi V"
                    }

                    if (i > itamSayi) {
                        binding.textViewSeriRLCi.text = "I: $i A"
                    } else {
                        binding.textViewSeriRLCi.text = "I: $itamSayi A"
                    }
                }else {
                    Toast.makeText(
                        applicationContext,
                        com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rlcuyari,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            if (secilenBobinBirim == "Henry" && secilenKondansatorBirim == " Nano Farad") {
                if (R != null && L != null && C != null && V != null && f != null) {
                    val XL = Math.round(((2 * 3.14 * f * (L))) * 100.0) / 100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000000))) * 100.0) / 100.0
                    val Z = Math.round((sqrt(R * R + ((XL - XC)*(XL - XC))) * 100.0)) / 100.0
                    val i = Math.round((V / Z) * 100.0) / 100.0
                    val VL = Math.round((i * XL)*100.0)/100.0
                    val VC = Math.round((i * XC)*100.0)/100.0
                    val VR = Math.round((i * R)*100.0)/100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val VLtamSayi = VL.toInt()
                    val VCtamSayi = VC.toInt()
                    val VRtamSayi = VR.toInt()

                    if (XL > XLtamSayi) {
                        binding.textViewSeriRLCXL.text = "XL: $XL Ω"
                    } else {
                        binding.textViewSeriRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewSeriRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewSeriRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if (Z > ZtamSayi) {
                        binding.textViewSeriRLCZ.text = "Z: $Z Ω"
                    } else {
                        binding.textViewSeriRLCZ.text = "Z: $ZtamSayi Ω"
                    }

                    if (VL > VLtamSayi) {
                        binding.textViewSeriRLCVL.text = "VL: $VL V"
                    } else {
                        binding.textViewSeriRLCVL.text = "VL: $VLtamSayi V"
                    }

                    if (VC > VCtamSayi) {
                        binding.textViewSeriRLCVC.text = "VC: $VC V"
                    } else {
                        binding.textViewSeriRLCVC.text = "VC: $VCtamSayi V"
                    }

                    if (VR > VRtamSayi) {
                        binding.textViewSeriRLCVR.text = "VR: $VR V"
                    } else {
                        binding.textViewSeriRLCVR.text = "VR: $VRtamSayi V"
                    }

                    if (i > itamSayi) {
                        binding.textViewSeriRLCi.text = "I: $i A"
                    } else {
                        binding.textViewSeriRLCi.text = "I: $itamSayi A"
                    }
                }else {
                    Toast.makeText(
                        applicationContext,
                        com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rlcuyari,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            if (secilenBobinBirim == "Henry" && secilenKondansatorBirim == "Piko Farad") {
                if (R != null && L != null && C != null && V != null && f != null) {
                    val XL = Math.round(((2 * 3.14 * f * (L))) * 100.0) / 100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000000000))) * 100.0) / 100.0
                    val Z = Math.round((sqrt(R * R + ((XL - XC)*(XL - XC))) * 100.0)) / 100.0
                    val i = Math.round((V / Z) * 100.0) / 100.0
                    val VL = Math.round((i * XL)*100.0)/100.0
                    val VC = Math.round((i * XC)*100.0)/100.0
                    val VR = Math.round((i * R)*100.0)/100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val VLtamSayi = VL.toInt()
                    val VCtamSayi = VC.toInt()
                    val VRtamSayi = VR.toInt()

                    if (XL > XLtamSayi) {
                        binding.textViewSeriRLCXL.text = "XL: $XL Ω"
                    } else {
                        binding.textViewSeriRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewSeriRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewSeriRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if (Z > ZtamSayi) {
                        binding.textViewSeriRLCZ.text = "Z: $Z Ω"
                    } else {
                        binding.textViewSeriRLCZ.text = "Z: $ZtamSayi Ω"
                    }

                    if (VL > VLtamSayi) {
                        binding.textViewSeriRLCVL.text = "VL: $VL V"
                    } else {
                        binding.textViewSeriRLCVL.text = "VL: $VLtamSayi V"
                    }

                    if (VC > VCtamSayi) {
                        binding.textViewSeriRLCVC.text = "VC: $VC V"
                    } else {
                        binding.textViewSeriRLCVC.text = "VC: $VCtamSayi V"
                    }

                    if (VR > VRtamSayi) {
                        binding.textViewSeriRLCVR.text = "VR: $VR V"
                    } else {
                        binding.textViewSeriRLCVR.text = "VR: $VRtamSayi V"
                    }

                    if (i > itamSayi) {
                        binding.textViewSeriRLCi.text = "I: $i A"
                    } else {
                        binding.textViewSeriRLCi.text = "I: $itamSayi A"
                    }
                }else {
                    Toast.makeText(
                        applicationContext,
                        com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rlcuyari,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            if (secilenBobinBirim == "Mili Henry" && secilenKondansatorBirim == "Farad") {
                if (R != null && L != null && C != null && V != null && f != null) {
                    val XL = Math.round(((2 * 3.14 * f * (L/1000))) * 100.0) / 100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C))) * 100.0) / 100.0
                    val Z = Math.round((sqrt(R * R + ((XL - XC)*(XL - XC))) * 100.0)) / 100.0
                    val i = Math.round((V / Z) * 100.0) / 100.0
                    val VL = Math.round((i * XL)*100.0)/100.0
                    val VC = Math.round((i * XC)*100.0)/100.0
                    val VR = Math.round((i * R)*100.0)/100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val VLtamSayi = VL.toInt()
                    val VCtamSayi = VC.toInt()
                    val VRtamSayi = VR.toInt()

                    if (XL > XLtamSayi) {
                        binding.textViewSeriRLCXL.text = "XL: $XL Ω"
                    } else {
                        binding.textViewSeriRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewSeriRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewSeriRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if (Z > ZtamSayi) {
                        binding.textViewSeriRLCZ.text = "Z: $Z Ω"
                    } else {
                        binding.textViewSeriRLCZ.text = "Z: $ZtamSayi Ω"
                    }

                    if (VL > VLtamSayi) {
                        binding.textViewSeriRLCVL.text = "VL: $VL V"
                    } else {
                        binding.textViewSeriRLCVL.text = "VL: $VLtamSayi V"
                    }

                    if (VC > VCtamSayi) {
                        binding.textViewSeriRLCVC.text = "VC: $VC V"
                    } else {
                        binding.textViewSeriRLCVC.text = "VC: $VCtamSayi V"
                    }

                    if (VR > VRtamSayi) {
                        binding.textViewSeriRLCVR.text = "VR: $VR V"
                    } else {
                        binding.textViewSeriRLCVR.text = "VR: $VRtamSayi V"
                    }

                    if (i > itamSayi) {
                        binding.textViewSeriRLCi.text = "I: $i A"
                    } else {
                        binding.textViewSeriRLCi.text = "I: $itamSayi A"
                    }
                }else {
                    Toast.makeText(
                        applicationContext,
                        com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rlcuyari,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            if (secilenBobinBirim == "Mili Henry" && secilenKondansatorBirim == "Mili Farad") {
                if (R != null && L != null && C != null && V != null && f != null) {
                    val XL = Math.round(((2 * 3.14 * f * (L/1000))) * 100.0) / 100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000))) * 100.0) / 100.0
                    val Z = Math.round((sqrt(R * R + ((XL - XC)*(XL - XC))) * 100.0)) / 100.0
                    val i = Math.round((V / Z) * 100.0) / 100.0
                    val VL = Math.round((i * XL)*100.0)/100.0
                    val VC = Math.round((i * XC)*100.0)/100.0
                    val VR = Math.round((i * R)*100.0)/100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val VLtamSayi = VL.toInt()
                    val VCtamSayi = VC.toInt()
                    val VRtamSayi = VR.toInt()

                    if (XL > XLtamSayi) {
                        binding.textViewSeriRLCXL.text = "XL: $XL Ω"
                    } else {
                        binding.textViewSeriRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewSeriRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewSeriRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if (Z > ZtamSayi) {
                        binding.textViewSeriRLCZ.text = "Z: $Z Ω"
                    } else {
                        binding.textViewSeriRLCZ.text = "Z: $ZtamSayi Ω"
                    }

                    if (VL > VLtamSayi) {
                        binding.textViewSeriRLCVL.text = "VL: $VL V"
                    } else {
                        binding.textViewSeriRLCVL.text = "VL: $VLtamSayi V"
                    }

                    if (VC > VCtamSayi) {
                        binding.textViewSeriRLCVC.text = "VC: $VC V"
                    } else {
                        binding.textViewSeriRLCVC.text = "VC: $VCtamSayi V"
                    }

                    if (VR > VRtamSayi) {
                        binding.textViewSeriRLCVR.text = "VR: $VR V"
                    } else {
                        binding.textViewSeriRLCVR.text = "VR: $VRtamSayi V"
                    }

                    if (i > itamSayi) {
                        binding.textViewSeriRLCi.text = "I: $i A"
                    } else {
                        binding.textViewSeriRLCi.text = "I: $itamSayi A"
                    }
                }else {
                    Toast.makeText(
                        applicationContext,
                        com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rlcuyari,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            if (secilenBobinBirim == "Mili Henry" && secilenKondansatorBirim == "Mikro Farad") {
                if (R != null && L != null && C != null && V != null && f != null) {
                    val XL = Math.round(((2 * 3.14 * f * (L/1000))) * 100.0) / 100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000))) * 100.0) / 100.0
                    val Z = Math.round((sqrt(R * R + ((XL - XC)*(XL - XC))) * 100.0)) / 100.0
                    val i = Math.round((V / Z) * 100.0) / 100.0
                    val VL = Math.round((i * XL)*100.0)/100.0
                    val VC = Math.round((i * XC)*100.0)/100.0
                    val VR = Math.round((i * R)*100.0)/100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val VLtamSayi = VL.toInt()
                    val VCtamSayi = VC.toInt()
                    val VRtamSayi = VR.toInt()

                    if (XL > XLtamSayi) {
                        binding.textViewSeriRLCXL.text = "XL: $XL Ω"
                    } else {
                        binding.textViewSeriRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewSeriRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewSeriRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if (Z > ZtamSayi) {
                        binding.textViewSeriRLCZ.text = "Z: $Z Ω"
                    } else {
                        binding.textViewSeriRLCZ.text = "Z: $ZtamSayi Ω"
                    }

                    if (VL > VLtamSayi) {
                        binding.textViewSeriRLCVL.text = "VL: $VL V"
                    } else {
                        binding.textViewSeriRLCVL.text = "VL: $VLtamSayi V"
                    }

                    if (VC > VCtamSayi) {
                        binding.textViewSeriRLCVC.text = "VC: $VC V"
                    } else {
                        binding.textViewSeriRLCVC.text = "VC: $VCtamSayi V"
                    }

                    if (VR > VRtamSayi) {
                        binding.textViewSeriRLCVR.text = "VR: $VR V"
                    } else {
                        binding.textViewSeriRLCVR.text = "VR: $VRtamSayi V"
                    }

                    if (i > itamSayi) {
                        binding.textViewSeriRLCi.text = "I: $i A"
                    } else {
                        binding.textViewSeriRLCi.text = "I: $itamSayi A"
                    }
                }else {
                    Toast.makeText(
                        applicationContext,
                        com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rlcuyari,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            if (secilenBobinBirim == "Mili Henry" && secilenKondansatorBirim == "Nano Farad") {
                if (R != null && L != null && C != null && V != null && f != null) {
                    val XL = Math.round(((2 * 3.14 * f * (L/1000))) * 100.0) / 100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000000))) * 100.0) / 100.0
                    val Z = Math.round((sqrt(R * R + ((XL - XC)*(XL - XC))) * 100.0)) / 100.0
                    val i = Math.round((V / Z) * 100.0) / 100.0
                    val VL = Math.round((i * XL)*100.0)/100.0
                    val VC = Math.round((i * XC)*100.0)/100.0
                    val VR = Math.round((i * R)*100.0)/100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val VLtamSayi = VL.toInt()
                    val VCtamSayi = VC.toInt()
                    val VRtamSayi = VR.toInt()

                    if (XL > XLtamSayi) {
                        binding.textViewSeriRLCXL.text = "XL: $XL Ω"
                    } else {
                        binding.textViewSeriRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewSeriRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewSeriRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if (Z > ZtamSayi) {
                        binding.textViewSeriRLCZ.text = "Z: $Z Ω"
                    } else {
                        binding.textViewSeriRLCZ.text = "Z: $ZtamSayi Ω"
                    }

                    if (VL > VLtamSayi) {
                        binding.textViewSeriRLCVL.text = "VL: $VL V"
                    } else {
                        binding.textViewSeriRLCVL.text = "VL: $VLtamSayi V"
                    }

                    if (VC > VCtamSayi) {
                        binding.textViewSeriRLCVC.text = "VC: $VC V"
                    } else {
                        binding.textViewSeriRLCVC.text = "VC: $VCtamSayi V"
                    }

                    if (VR > VRtamSayi) {
                        binding.textViewSeriRLCVR.text = "VR: $VR V"
                    } else {
                        binding.textViewSeriRLCVR.text = "VR: $VRtamSayi V"
                    }

                    if (i > itamSayi) {
                        binding.textViewSeriRLCi.text = "I: $i A"
                    } else {
                        binding.textViewSeriRLCi.text = "I: $itamSayi A"
                    }
                }else {
                    Toast.makeText(
                        applicationContext,
                        com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rlcuyari,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            if (secilenBobinBirim == "Mili Henry" && secilenKondansatorBirim == "Piko Farad") {
                if (R != null && L != null && C != null && V != null && f != null) {
                    val XL = Math.round(((2 * 3.14 * f * (L/1000))) * 100.0) / 100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000000000))) * 100.0) / 100.0
                    val Z = Math.round((sqrt(R * R + ((XL - XC)*(XL - XC))) * 100.0)) / 100.0
                    val i = Math.round((V / Z) * 100.0) / 100.0
                    val VL = Math.round((i * XL)*100.0)/100.0
                    val VC = Math.round((i * XC)*100.0)/100.0
                    val VR = Math.round((i * R)*100.0)/100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val VLtamSayi = VL.toInt()
                    val VCtamSayi = VC.toInt()
                    val VRtamSayi = VR.toInt()

                    if (XL > XLtamSayi) {
                        binding.textViewSeriRLCXL.text = "XL: $XL Ω"
                    } else {
                        binding.textViewSeriRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewSeriRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewSeriRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if (Z > ZtamSayi) {
                        binding.textViewSeriRLCZ.text = "Z: $Z Ω"
                    } else {
                        binding.textViewSeriRLCZ.text = "Z: $ZtamSayi Ω"
                    }

                    if (VL > VLtamSayi) {
                        binding.textViewSeriRLCVL.text = "VL: $VL V"
                    } else {
                        binding.textViewSeriRLCVL.text = "VL: $VLtamSayi V"
                    }

                    if (VC > VCtamSayi) {
                        binding.textViewSeriRLCVC.text = "VC: $VC V"
                    } else {
                        binding.textViewSeriRLCVC.text = "VC: $VCtamSayi V"
                    }

                    if (VR > VRtamSayi) {
                        binding.textViewSeriRLCVR.text = "VR: $VR V"
                    } else {
                        binding.textViewSeriRLCVR.text = "VR: $VRtamSayi V"
                    }

                    if (i > itamSayi) {
                        binding.textViewSeriRLCi.text = "I: $i A"
                    } else {
                        binding.textViewSeriRLCi.text = "I: $itamSayi A"
                    }
                }else {
                    Toast.makeText(
                        applicationContext,
                        com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rlcuyari,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            if (secilenBobinBirim == "Mikro Henry" && secilenKondansatorBirim == "Farad") {
                if (R != null && L != null && C != null && V != null && f != null) {
                    val XL = Math.round(((2 * 3.14 * f * (L/1000000))) * 100.0) / 100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C))) * 100.0) / 100.0
                    val Z = Math.round((sqrt(R * R + ((XL - XC)*(XL - XC))) * 100.0)) / 100.0
                    val i = Math.round((V / Z) * 100.0) / 100.0
                    val VL = Math.round((i * XL)*100.0)/100.0
                    val VC = Math.round((i * XC)*100.0)/100.0
                    val VR = Math.round((i * R)*100.0)/100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val VLtamSayi = VL.toInt()
                    val VCtamSayi = VC.toInt()
                    val VRtamSayi = VR.toInt()

                    if (XL > XLtamSayi) {
                        binding.textViewSeriRLCXL.text = "XL: $XL Ω"
                    } else {
                        binding.textViewSeriRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewSeriRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewSeriRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if (Z > ZtamSayi) {
                        binding.textViewSeriRLCZ.text = "Z: $Z Ω"
                    } else {
                        binding.textViewSeriRLCZ.text = "Z: $ZtamSayi Ω"
                    }

                    if (VL > VLtamSayi) {
                        binding.textViewSeriRLCVL.text = "VL: $VL V"
                    } else {
                        binding.textViewSeriRLCVL.text = "VL: $VLtamSayi V"
                    }

                    if (VC > VCtamSayi) {
                        binding.textViewSeriRLCVC.text = "VC: $VC V"
                    } else {
                        binding.textViewSeriRLCVC.text = "VC: $VCtamSayi V"
                    }

                    if (VR > VRtamSayi) {
                        binding.textViewSeriRLCVR.text = "VR: $VR V"
                    } else {
                        binding.textViewSeriRLCVR.text = "VR: $VRtamSayi V"
                    }

                    if (i > itamSayi) {
                        binding.textViewSeriRLCi.text = "I: $i A"
                    } else {
                        binding.textViewSeriRLCi.text = "I: $itamSayi A"
                    }
                }else {
                    Toast.makeText(
                        applicationContext,
                        com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rlcuyari,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            if (secilenBobinBirim == "Mikro Henry" && secilenKondansatorBirim == "Mili Farad") {
                if (R != null && L != null && C != null && V != null && f != null) {
                    val XL = Math.round(((2 * 3.14 * f * (L/1000000))) * 100.0) / 100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000))) * 100.0) / 100.0
                    val Z = Math.round((sqrt(R * R + ((XL - XC)*(XL - XC))) * 100.0)) / 100.0
                    val i = Math.round((V / Z) * 100.0) / 100.0
                    val VL = Math.round((i * XL)*100.0)/100.0
                    val VC = Math.round((i * XC)*100.0)/100.0
                    val VR = Math.round((i * R)*100.0)/100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val VLtamSayi = VL.toInt()
                    val VCtamSayi = VC.toInt()
                    val VRtamSayi = VR.toInt()

                    if (XL > XLtamSayi) {
                        binding.textViewSeriRLCXL.text = "XL: $XL Ω"
                    } else {
                        binding.textViewSeriRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewSeriRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewSeriRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if (Z > ZtamSayi) {
                        binding.textViewSeriRLCZ.text = "Z: $Z Ω"
                    } else {
                        binding.textViewSeriRLCZ.text = "Z: $ZtamSayi Ω"
                    }

                    if (VL > VLtamSayi) {
                        binding.textViewSeriRLCVL.text = "VL: $VL V"
                    } else {
                        binding.textViewSeriRLCVL.text = "VL: $VLtamSayi V"
                    }

                    if (VC > VCtamSayi) {
                        binding.textViewSeriRLCVC.text = "VC: $VC V"
                    } else {
                        binding.textViewSeriRLCVC.text = "VC: $VCtamSayi V"
                    }

                    if (VR > VRtamSayi) {
                        binding.textViewSeriRLCVR.text = "VR: $VR V"
                    } else {
                        binding.textViewSeriRLCVR.text = "VR: $VRtamSayi V"
                    }

                    if (i > itamSayi) {
                        binding.textViewSeriRLCi.text = "I: $i A"
                    } else {
                        binding.textViewSeriRLCi.text = "I: $itamSayi A"
                    }
                }else {
                    Toast.makeText(
                        applicationContext,
                        com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rlcuyari,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            if (secilenBobinBirim == "Mikro Henry" && secilenKondansatorBirim == "Mikro Farad") {
                if (R != null && L != null && C != null && V != null && f != null) {
                    val XL = Math.round(((2 * 3.14 * f * (L/1000000))) * 100.0) / 100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000))) * 100.0) / 100.0
                    val Z = Math.round((sqrt(R * R + ((XL - XC)*(XL - XC))) * 100.0)) / 100.0
                    val i = Math.round((V / Z) * 100.0) / 100.0
                    val VL = Math.round((i * XL)*100.0)/100.0
                    val VC = Math.round((i * XC)*100.0)/100.0
                    val VR = Math.round((i * R)*100.0)/100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val VLtamSayi = VL.toInt()
                    val VCtamSayi = VC.toInt()
                    val VRtamSayi = VR.toInt()

                    if (XL > XLtamSayi) {
                        binding.textViewSeriRLCXL.text = "XL: $XL Ω"
                    } else {
                        binding.textViewSeriRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewSeriRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewSeriRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if (Z > ZtamSayi) {
                        binding.textViewSeriRLCZ.text = "Z: $Z Ω"
                    } else {
                        binding.textViewSeriRLCZ.text = "Z: $ZtamSayi Ω"
                    }

                    if (VL > VLtamSayi) {
                        binding.textViewSeriRLCVL.text = "VL: $VL V"
                    } else {
                        binding.textViewSeriRLCVL.text = "VL: $VLtamSayi V"
                    }

                    if (VC > VCtamSayi) {
                        binding.textViewSeriRLCVC.text = "VC: $VC V"
                    } else {
                        binding.textViewSeriRLCVC.text = "VC: $VCtamSayi V"
                    }

                    if (VR > VRtamSayi) {
                        binding.textViewSeriRLCVR.text = "VR: $VR V"
                    } else {
                        binding.textViewSeriRLCVR.text = "VR: $VRtamSayi V"
                    }

                    if (i > itamSayi) {
                        binding.textViewSeriRLCi.text = "I: $i A"
                    } else {
                        binding.textViewSeriRLCi.text = "I: $itamSayi A"
                    }
                }else {
                    Toast.makeText(
                        applicationContext,
                        com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rlcuyari,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            if (secilenBobinBirim == "Mikro Henry" && secilenKondansatorBirim == "Nano Farad") {
                if (R != null && L != null && C != null && V != null && f != null) {
                    val XL = Math.round(((2 * 3.14 * f * (L/1000000))) * 100.0) / 100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000000))) * 100.0) / 100.0
                    val Z = Math.round((sqrt(R * R + ((XL - XC)*(XL - XC))) * 100.0)) / 100.0
                    val i = Math.round((V / Z) * 100.0) / 100.0
                    val VL = Math.round((i * XL)*100.0)/100.0
                    val VC = Math.round((i * XC)*100.0)/100.0
                    val VR = Math.round((i * R)*100.0)/100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val VLtamSayi = VL.toInt()
                    val VCtamSayi = VC.toInt()
                    val VRtamSayi = VR.toInt()

                    if (XL > XLtamSayi) {
                        binding.textViewSeriRLCXL.text = "XL: $XL Ω"
                    } else {
                        binding.textViewSeriRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewSeriRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewSeriRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if (Z > ZtamSayi) {
                        binding.textViewSeriRLCZ.text = "Z: $Z Ω"
                    } else {
                        binding.textViewSeriRLCZ.text = "Z: $ZtamSayi Ω"
                    }

                    if (VL > VLtamSayi) {
                        binding.textViewSeriRLCVL.text = "VL: $VL V"
                    } else {
                        binding.textViewSeriRLCVL.text = "VL: $VLtamSayi V"
                    }

                    if (VC > VCtamSayi) {
                        binding.textViewSeriRLCVC.text = "VC: $VC V"
                    } else {
                        binding.textViewSeriRLCVC.text = "VC: $VCtamSayi V"
                    }

                    if (VR > VRtamSayi) {
                        binding.textViewSeriRLCVR.text = "VR: $VR V"
                    } else {
                        binding.textViewSeriRLCVR.text = "VR: $VRtamSayi V"
                    }

                    if (i > itamSayi) {
                        binding.textViewSeriRLCi.text = "I: $i A"
                    } else {
                        binding.textViewSeriRLCi.text = "I: $itamSayi A"
                    }
                }else {
                    Toast.makeText(
                        applicationContext,
                        com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rlcuyari,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            if (secilenBobinBirim == "Mikro Henry" && secilenKondansatorBirim == "Piko Farad") {
                if (R != null && L != null && C != null && V != null && f != null) {
                    val XL = Math.round(((2 * 3.14 * f * (L/1000000))) * 100.0) / 100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000000000))) * 100.0) / 100.0
                    val Z = Math.round((sqrt(R * R + ((XL - XC)*(XL - XC))) * 100.0)) / 100.0
                    val i = Math.round((V / Z) * 100.0) / 100.0
                    val VL = Math.round((i * XL)*100.0)/100.0
                    val VC = Math.round((i * XC)*100.0)/100.0
                    val VR = Math.round((i * R)*100.0)/100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val VLtamSayi = VL.toInt()
                    val VCtamSayi = VC.toInt()
                    val VRtamSayi = VR.toInt()

                    if (XL > XLtamSayi) {
                        binding.textViewSeriRLCXL.text = "XL: $XL Ω"
                    } else {
                        binding.textViewSeriRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewSeriRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewSeriRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if (Z > ZtamSayi) {
                        binding.textViewSeriRLCZ.text = "Z: $Z Ω"
                    } else {
                        binding.textViewSeriRLCZ.text = "Z: $ZtamSayi Ω"
                    }

                    if (VL > VLtamSayi) {
                        binding.textViewSeriRLCVL.text = "VL: $VL V"
                    } else {
                        binding.textViewSeriRLCVL.text = "VL: $VLtamSayi V"
                    }

                    if (VC > VCtamSayi) {
                        binding.textViewSeriRLCVC.text = "VC: $VC V"
                    } else {
                        binding.textViewSeriRLCVC.text = "VC: $VCtamSayi V"
                    }

                    if (VR > VRtamSayi) {
                        binding.textViewSeriRLCVR.text = "VR: $VR V"
                    } else {
                        binding.textViewSeriRLCVR.text = "VR: $VRtamSayi V"
                    }

                    if (i > itamSayi) {
                        binding.textViewSeriRLCi.text = "I: $i A"
                    } else {
                        binding.textViewSeriRLCi.text = "I: $itamSayi A"
                    }
                }else {
                    Toast.makeText(
                        applicationContext,
                        com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.rlcuyari,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }
        }
    }
}