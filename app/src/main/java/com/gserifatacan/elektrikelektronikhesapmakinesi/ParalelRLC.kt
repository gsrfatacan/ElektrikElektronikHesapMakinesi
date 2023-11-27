package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.ActivityParalelRlcBinding
import kotlin.math.sqrt

class ParalelRLC : AppCompatActivity() {

    private lateinit var binding: ActivityParalelRlcBinding
    lateinit var mAdView : AdView

    private val bobinBirim = ArrayList<String>()
    private lateinit var veriAdaptoru1: ArrayAdapter<String>

    private val kondansatorBirim = ArrayList<String>()
    private lateinit var veriAdaptoru2: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParalelRlcBinding.inflate(layoutInflater)
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

        binding.spinnerB.adapter = veriAdaptoru1

        kondansatorBirim.add("Kondansatör Birimi")
        kondansatorBirim.add("Farad")
        kondansatorBirim.add("Mili Farad")
        kondansatorBirim.add("Mikro Farad")
        kondansatorBirim.add("Nano Farad")
        kondansatorBirim.add("Piko Farad")

        veriAdaptoru2 =
            ArrayAdapter(this, R.layout.simple_list_item_1, R.id.text1, kondansatorBirim)

        binding.spinnerK.adapter = veriAdaptoru2

        binding.buttonParalelRLCHesapla.setOnClickListener() {
            val R = binding.editTextParalelRLCR.text.toString().toFloatOrNull()
            val L = binding.editTextParalelRLCL.text.toString().toFloatOrNull()
            val C = binding.editTextParalelRLCC.text.toString().toFloatOrNull()
            val V = binding.editTextParalelRLCV.text.toString().toFloatOrNull()
            val f = binding.editTextParalelRLCf.text.toString().toFloatOrNull()

            try {
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
            } catch (_: Exception) {
            }

            val secilenBobinBirim = binding.spinnerB.selectedItem.toString()

            val secilenKondansatorBirim = binding.spinnerK.selectedItem.toString()

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
                    val XL = Math.round((2*3.14* f *(L))*100.0)/100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C))) * 100.0) / 100.0
                    val iL = Math.round((V / XL)* 100.0) / 100.0
                    val iC = Math.round((V / XC) * 100.0) / 100.0
                    val iR = Math.round((V / R) * 100.0) / 100.0
                    val i = Math.round(sqrt(iR * iR + ((iL-iC)*(iL-iC))) * 100.0) / 100.0
                    val Z = Math.round((V / i) * 100.0) / 100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val iLtamSayi = iL.toInt()
                    val iCtamSayi = iC.toInt()
                    val iRtamSayi = iR.toInt()

                    if(XL > XLtamSayi){
                        binding.textViewParalelRLCXL.text = "XL: $XL Ω"
                    }else{
                        binding.textViewParalelRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewParalelRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewParalelRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if(iR > iRtamSayi){
                        binding.textViewParalelRLCiR.text = "IR: $iR A"
                    }else{
                        binding.textViewParalelRLCiR.text = "IR: $iRtamSayi A"
                    }

                    if(iL > iLtamSayi){
                        binding.textViewParalelRLCiL.text = "IL: $iL A"
                    }else{
                        binding.textViewParalelRLCiL.text = "IL: $iLtamSayi A"
                    }

                    if (iC > iCtamSayi) {
                        binding.textViewParalelRLCiC.text = "IC: $iC A"
                    } else {
                        binding.textViewParalelRLCiC.text = "IC: $iCtamSayi A"
                    }

                    if (i > itamSayi) {
                        binding.textViewParalelRLCi.text = "I: $i A"
                    } else {
                        binding.textViewParalelRLCi.text = "I: $itamSayi A"
                    }

                    if(Z > ZtamSayi){
                        binding.textViewParalelRLCZ.text = "Z: $Z Ω"
                    }else{
                        binding.textViewParalelRLCZ.text = "Z: $ZtamSayi Ω"
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
                    val XL = Math.round((2*3.14* f *(L))*100.0)/100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000))) * 100.0) / 100.0
                    val iL = Math.round((V / XL)* 100.0) / 100.0
                    val iC = Math.round((V / XC) * 100.0) / 100.0
                    val iR = Math.round((V / R) * 100.0) / 100.0
                    val i = Math.round(sqrt(iR * iR + ((iL-iC)*(iL-iC))) * 100.0) / 100.0
                    val Z = Math.round((V / i) * 100.0) / 100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val iLtamSayi = iL.toInt()
                    val iCtamSayi = iC.toInt()
                    val iRtamSayi = iR.toInt()

                    if(XL > XLtamSayi){
                        binding.textViewParalelRLCXL.text = "XL: $XL Ω"
                    }else{
                        binding.textViewParalelRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewParalelRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewParalelRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if(iR > iRtamSayi){
                        binding.textViewParalelRLCiR.text = "IR: $iR A"
                    }else{
                        binding.textViewParalelRLCiR.text = "IR: $iRtamSayi A"
                    }

                    if(iL > iLtamSayi){
                        binding.textViewParalelRLCiL.text = "IL: $iL A"
                    }else{
                        binding.textViewParalelRLCiL.text = "IL: $iLtamSayi A"
                    }

                    if (iC > iCtamSayi) {
                        binding.textViewParalelRLCiC.text = "IC: $iC A"
                    } else {
                        binding.textViewParalelRLCiC.text = "IC: $iCtamSayi A"
                    }

                    if (i > itamSayi) {
                        binding.textViewParalelRLCi.text = "I: $i A"
                    } else {
                        binding.textViewParalelRLCi.text = "I: $itamSayi A"
                    }

                    if(Z > ZtamSayi){
                        binding.textViewParalelRLCZ.text = "Z: $Z Ω"
                    }else{
                        binding.textViewParalelRLCZ.text = "Z: $ZtamSayi Ω"
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
                    val XL = Math.round((2*3.14* f *(L))*100.0)/100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000))) * 100.0) / 100.0
                    val iL = Math.round((V / XL)* 100.0) / 100.0
                    val iC = Math.round((V / XC) * 100.0) / 100.0
                    val iR = Math.round((V / R) * 100.0) / 100.0
                    val i = Math.round(sqrt(iR * iR + ((iL-iC)*(iL-iC))) * 100.0) / 100.0
                    val Z = Math.round((V / i) * 100.0) / 100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val iLtamSayi = iL.toInt()
                    val iCtamSayi = iC.toInt()
                    val iRtamSayi = iR.toInt()

                    if(XL > XLtamSayi){
                        binding.textViewParalelRLCXL.text = "XL: $XL Ω"
                    }else{
                        binding.textViewParalelRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewParalelRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewParalelRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if(iR > iRtamSayi){
                        binding.textViewParalelRLCiR.text = "IR: $iR A"
                    }else{
                        binding.textViewParalelRLCiR.text = "IR: $iRtamSayi A"
                    }

                    if(iL > iLtamSayi){
                        binding.textViewParalelRLCiL.text = "IL: $iL A"
                    }else{
                        binding.textViewParalelRLCiL.text = "IL: $iLtamSayi A"
                    }

                    if (iC > iCtamSayi) {
                        binding.textViewParalelRLCiC.text = "IC: $iC A"
                    } else {
                        binding.textViewParalelRLCiC.text = "IC: $iCtamSayi A"
                    }

                    if (i > itamSayi) {
                        binding.textViewParalelRLCi.text = "I: $i A"
                    } else {
                        binding.textViewParalelRLCi.text = "I: $itamSayi A"
                    }

                    if(Z > ZtamSayi){
                        binding.textViewParalelRLCZ.text = "Z: $Z Ω"
                    }else{
                        binding.textViewParalelRLCZ.text = "Z: $ZtamSayi Ω"
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

            if (secilenBobinBirim == "Henry" && secilenKondansatorBirim == "Nano Farad") {
                if (R != null && L != null && C != null && V != null && f != null) {
                    val XL = Math.round((2*3.14* f *(L))*100.0)/100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000000))) * 100.0) / 100.0
                    val iL = Math.round((V / XL)* 100.0) / 100.0
                    val iC = Math.round((V / XC) * 100.0) / 100.0
                    val iR = Math.round((V / R) * 100.0) / 100.0
                    val i = Math.round(sqrt(iR * iR + ((iL-iC)*(iL-iC))) * 100.0) / 100.0
                    val Z = Math.round((V / i) * 100.0) / 100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val iLtamSayi = iL.toInt()
                    val iCtamSayi = iC.toInt()
                    val iRtamSayi = iR.toInt()

                    if(XL > XLtamSayi){
                        binding.textViewParalelRLCXL.text = "XL: $XL Ω"
                    }else{
                        binding.textViewParalelRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewParalelRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewParalelRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if(iR > iRtamSayi){
                        binding.textViewParalelRLCiR.text = "IR: $iR A"
                    }else{
                        binding.textViewParalelRLCiR.text = "IR: $iRtamSayi A"
                    }

                    if(iL > iLtamSayi){
                        binding.textViewParalelRLCiL.text = "IL: $iL A"
                    }else{
                        binding.textViewParalelRLCiL.text = "IL: $iLtamSayi A"
                    }

                    if (iC > iCtamSayi) {
                        binding.textViewParalelRLCiC.text = "IC: $iC A"
                    } else {
                        binding.textViewParalelRLCiC.text = "IC: $iCtamSayi A"
                    }

                    if (i > itamSayi) {
                        binding.textViewParalelRLCi.text = "I: $i A"
                    } else {
                        binding.textViewParalelRLCi.text = "I: $itamSayi A"
                    }

                    if(Z > ZtamSayi){
                        binding.textViewParalelRLCZ.text = "Z: $Z Ω"
                    }else{
                        binding.textViewParalelRLCZ.text = "Z: $ZtamSayi Ω"
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
                    val XL = Math.round((2*3.14* f *(L))*100.0)/100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000000000))) * 100.0) / 100.0
                    val iL = Math.round((V / XL)* 100.0) / 100.0
                    val iC = Math.round((V / XC) * 100.0) / 100.0
                    val iR = Math.round((V / R) * 100.0) / 100.0
                    val i = Math.round(sqrt(iR * iR + ((iL-iC)*(iL-iC))) * 100.0) / 100.0
                    val Z = Math.round((V / i) * 100.0) / 100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val iLtamSayi = iL.toInt()
                    val iCtamSayi = iC.toInt()
                    val iRtamSayi = iR.toInt()

                    if(XL > XLtamSayi){
                        binding.textViewParalelRLCXL.text = "XL: $XL Ω"
                    }else{
                        binding.textViewParalelRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewParalelRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewParalelRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if(iR > iRtamSayi){
                        binding.textViewParalelRLCiR.text = "IR: $iR A"
                    }else{
                        binding.textViewParalelRLCiR.text = "IR: $iRtamSayi A"
                    }

                    if(iL > iLtamSayi){
                        binding.textViewParalelRLCiL.text = "IL: $iL A"
                    }else{
                        binding.textViewParalelRLCiL.text = "IL: $iLtamSayi A"
                    }

                    if (iC > iCtamSayi) {
                        binding.textViewParalelRLCiC.text = "IC: $iC A"
                    } else {
                        binding.textViewParalelRLCiC.text = "IC: $iCtamSayi A"
                    }

                    if (i > itamSayi) {
                        binding.textViewParalelRLCi.text = "I: $i A"
                    } else {
                        binding.textViewParalelRLCi.text = "I: $itamSayi A"
                    }

                    if(Z > ZtamSayi){
                        binding.textViewParalelRLCZ.text = "Z: $Z Ω"
                    }else{
                        binding.textViewParalelRLCZ.text = "Z: $ZtamSayi Ω"
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
                    val XL = Math.round((2*3.14* f *(L/1000))*100.0)/100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C))) * 100.0) / 100.0
                    val iL = Math.round((V / XL)* 100.0) / 100.0
                    val iC = Math.round((V / XC) * 100.0) / 100.0
                    val iR = Math.round((V / R) * 100.0) / 100.0
                    val i = Math.round(sqrt(iR * iR + ((iL-iC)*(iL-iC))) * 100.0) / 100.0
                    val Z = Math.round((V / i) * 100.0) / 100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val iLtamSayi = iL.toInt()
                    val iCtamSayi = iC.toInt()
                    val iRtamSayi = iR.toInt()

                    if(XL > XLtamSayi){
                        binding.textViewParalelRLCXL.text = "XL: $XL Ω"
                    }else{
                        binding.textViewParalelRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewParalelRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewParalelRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if(iR > iRtamSayi){
                        binding.textViewParalelRLCiR.text = "IR: $iR A"
                    }else{
                        binding.textViewParalelRLCiR.text = "IR: $iRtamSayi A"
                    }

                    if(iL > iLtamSayi){
                        binding.textViewParalelRLCiL.text = "IL: $iL A"
                    }else{
                        binding.textViewParalelRLCiL.text = "IL: $iLtamSayi A"
                    }

                    if (iC > iCtamSayi) {
                        binding.textViewParalelRLCiC.text = "IC: $iC A"
                    } else {
                        binding.textViewParalelRLCiC.text = "IC: $iCtamSayi A"
                    }

                    if (i > itamSayi) {
                        binding.textViewParalelRLCi.text = "I: $i A"
                    } else {
                        binding.textViewParalelRLCi.text = "I: $itamSayi A"
                    }

                    if(Z > ZtamSayi){
                        binding.textViewParalelRLCZ.text = "Z: $Z Ω"
                    }else{
                        binding.textViewParalelRLCZ.text = "Z: $ZtamSayi Ω"
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
                    val XL = Math.round((2*3.14* f *(L/1000))*100.0)/100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000))) * 100.0) / 100.0
                    val iL = Math.round((V / XL)* 100.0) / 100.0
                    val iC = Math.round((V / XC) * 100.0) / 100.0
                    val iR = Math.round((V / R) * 100.0) / 100.0
                    val i = Math.round(sqrt(iR * iR + ((iL-iC)*(iL-iC))) * 100.0) / 100.0
                    val Z = Math.round((V / i) * 100.0) / 100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val iLtamSayi = iL.toInt()
                    val iCtamSayi = iC.toInt()
                    val iRtamSayi = iR.toInt()

                    if(XL > XLtamSayi){
                        binding.textViewParalelRLCXL.text = "XL: $XL Ω"
                    }else{
                        binding.textViewParalelRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewParalelRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewParalelRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if(iR > iRtamSayi){
                        binding.textViewParalelRLCiR.text = "IR: $iR A"
                    }else{
                        binding.textViewParalelRLCiR.text = "IR: $iRtamSayi A"
                    }

                    if(iL > iLtamSayi){
                        binding.textViewParalelRLCiL.text = "IL: $iL A"
                    }else{
                        binding.textViewParalelRLCiL.text = "IL: $iLtamSayi A"
                    }

                    if (iC > iCtamSayi) {
                        binding.textViewParalelRLCiC.text = "IC: $iC A"
                    } else {
                        binding.textViewParalelRLCiC.text = "IC: $iCtamSayi A"
                    }

                    if (i > itamSayi) {
                        binding.textViewParalelRLCi.text = "I: $i A"
                    } else {
                        binding.textViewParalelRLCi.text = "I: $itamSayi A"
                    }

                    if(Z > ZtamSayi){
                        binding.textViewParalelRLCZ.text = "Z: $Z Ω"
                    }else{
                        binding.textViewParalelRLCZ.text = "Z: $ZtamSayi Ω"
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
                    val XL = Math.round((2*3.14* f *(L/1000))*100.0)/100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000))) * 100.0) / 100.0
                    val iL = Math.round((V / XL)* 100.0) / 100.0
                    val iC = Math.round((V / XC) * 100.0) / 100.0
                    val iR = Math.round((V / R) * 100.0) / 100.0
                    val i = Math.round(sqrt(iR * iR + ((iL-iC)*(iL-iC))) * 100.0) / 100.0
                    val Z = Math.round((V / i) * 100.0) / 100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val iLtamSayi = iL.toInt()
                    val iCtamSayi = iC.toInt()
                    val iRtamSayi = iR.toInt()

                    if(XL > XLtamSayi){
                        binding.textViewParalelRLCXL.text = "XL: $XL Ω"
                    }else{
                        binding.textViewParalelRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewParalelRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewParalelRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if(iR > iRtamSayi){
                        binding.textViewParalelRLCiR.text = "IR: $iR A"
                    }else{
                        binding.textViewParalelRLCiR.text = "IR: $iRtamSayi A"
                    }

                    if(iL > iLtamSayi){
                        binding.textViewParalelRLCiL.text = "IL: $iL A"
                    }else{
                        binding.textViewParalelRLCiL.text = "IL: $iLtamSayi A"
                    }

                    if (iC > iCtamSayi) {
                        binding.textViewParalelRLCiC.text = "IC: $iC A"
                    } else {
                        binding.textViewParalelRLCiC.text = "IC: $iCtamSayi A"
                    }

                    if (i > itamSayi) {
                        binding.textViewParalelRLCi.text = "I: $i A"
                    } else {
                        binding.textViewParalelRLCi.text = "I: $itamSayi A"
                    }

                    if(Z > ZtamSayi){
                        binding.textViewParalelRLCZ.text = "Z: $Z Ω"
                    }else{
                        binding.textViewParalelRLCZ.text = "Z: $ZtamSayi Ω"
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
                    val XL = Math.round((2*3.14* f *(L/1000))*100.0)/100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000000))) * 100.0) / 100.0
                    val iL = Math.round((V / XL)* 100.0) / 100.0
                    val iC = Math.round((V / XC) * 100.0) / 100.0
                    val iR = Math.round((V / R) * 100.0) / 100.0
                    val i = Math.round(sqrt(iR * iR + ((iL-iC)*(iL-iC))) * 100.0) / 100.0
                    val Z = Math.round((V / i) * 100.0) / 100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val iLtamSayi = iL.toInt()
                    val iCtamSayi = iC.toInt()
                    val iRtamSayi = iR.toInt()

                    if(XL > XLtamSayi){
                        binding.textViewParalelRLCXL.text = "XL: $XL Ω"
                    }else{
                        binding.textViewParalelRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewParalelRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewParalelRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if(iR > iRtamSayi){
                        binding.textViewParalelRLCiR.text = "IR: $iR A"
                    }else{
                        binding.textViewParalelRLCiR.text = "IR: $iRtamSayi A"
                    }

                    if(iL > iLtamSayi){
                        binding.textViewParalelRLCiL.text = "IL: $iL A"
                    }else{
                        binding.textViewParalelRLCiL.text = "IL: $iLtamSayi A"
                    }

                    if (iC > iCtamSayi) {
                        binding.textViewParalelRLCiC.text = "IC: $iC A"
                    } else {
                        binding.textViewParalelRLCiC.text = "IC: $iCtamSayi A"
                    }

                    if (i > itamSayi) {
                        binding.textViewParalelRLCi.text = "I: $i A"
                    } else {
                        binding.textViewParalelRLCi.text = "I: $itamSayi A"
                    }

                    if(Z > ZtamSayi){
                        binding.textViewParalelRLCZ.text = "Z: $Z Ω"
                    }else{
                        binding.textViewParalelRLCZ.text = "Z: $ZtamSayi Ω"
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
                    val XL = Math.round((2*3.14* f *(L/1000))*100.0)/100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000000000))) * 100.0) / 100.0
                    val iL = Math.round((V / XL)* 100.0) / 100.0
                    val iC = Math.round((V / XC) * 100.0) / 100.0
                    val iR = Math.round((V / R) * 100.0) / 100.0
                    val i = Math.round(sqrt(iR * iR + ((iL-iC)*(iL-iC))) * 100.0) / 100.0
                    val Z = Math.round((V / i) * 100.0) / 100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val iLtamSayi = iL.toInt()
                    val iCtamSayi = iC.toInt()
                    val iRtamSayi = iR.toInt()

                    if(XL > XLtamSayi){
                        binding.textViewParalelRLCXL.text = "XL: $XL Ω"
                    }else{
                        binding.textViewParalelRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewParalelRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewParalelRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if(iR > iRtamSayi){
                        binding.textViewParalelRLCiR.text = "IR: $iR A"
                    }else{
                        binding.textViewParalelRLCiR.text = "IR: $iRtamSayi A"
                    }

                    if(iL > iLtamSayi){
                        binding.textViewParalelRLCiL.text = "IL: $iL A"
                    }else{
                        binding.textViewParalelRLCiL.text = "IL: $iLtamSayi A"
                    }

                    if (iC > iCtamSayi) {
                        binding.textViewParalelRLCiC.text = "IC: $iC A"
                    } else {
                        binding.textViewParalelRLCiC.text = "IC: $iCtamSayi A"
                    }

                    if (i > itamSayi) {
                        binding.textViewParalelRLCi.text = "I: $i A"
                    } else {
                        binding.textViewParalelRLCi.text = "I: $itamSayi A"
                    }

                    if(Z > ZtamSayi){
                        binding.textViewParalelRLCZ.text = "Z: $Z Ω"
                    }else{
                        binding.textViewParalelRLCZ.text = "Z: $ZtamSayi Ω"
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
                    val XL = Math.round((2*3.14* f *(L/1000000))*100.0)/100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C))) * 100.0) / 100.0
                    val iL = Math.round((V / XL)* 100.0) / 100.0
                    val iC = Math.round((V / XC) * 100.0) / 100.0
                    val iR = Math.round((V / R) * 100.0) / 100.0
                    val i = Math.round(sqrt(iR * iR + ((iL-iC)*(iL-iC))) * 100.0) / 100.0
                    val Z = Math.round((V / i) * 100.0) / 100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val iLtamSayi = iL.toInt()
                    val iCtamSayi = iC.toInt()
                    val iRtamSayi = iR.toInt()

                    if(XL > XLtamSayi){
                        binding.textViewParalelRLCXL.text = "XL: $XL Ω"
                    }else{
                        binding.textViewParalelRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewParalelRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewParalelRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if(iR > iRtamSayi){
                        binding.textViewParalelRLCiR.text = "IR: $iR A"
                    }else{
                        binding.textViewParalelRLCiR.text = "IR: $iRtamSayi A"
                    }

                    if(iL > iLtamSayi){
                        binding.textViewParalelRLCiL.text = "IL: $iL A"
                    }else{
                        binding.textViewParalelRLCiL.text = "IL: $iLtamSayi A"
                    }

                    if (iC > iCtamSayi) {
                        binding.textViewParalelRLCiC.text = "IC: $iC A"
                    } else {
                        binding.textViewParalelRLCiC.text = "IC: $iCtamSayi A"
                    }

                    if (i > itamSayi) {
                        binding.textViewParalelRLCi.text = "I: $i A"
                    } else {
                        binding.textViewParalelRLCi.text = "I: $itamSayi A"
                    }

                    if(Z > ZtamSayi){
                        binding.textViewParalelRLCZ.text = "Z: $Z Ω"
                    }else{
                        binding.textViewParalelRLCZ.text = "Z: $ZtamSayi Ω"
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
                    val XL = Math.round((2*3.14* f *(L/1000000))*100.0)/100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000))) * 100.0) / 100.0
                    val iL = Math.round((V / XL)* 100.0) / 100.0
                    val iC = Math.round((V / XC) * 100.0) / 100.0
                    val iR = Math.round((V / R) * 100.0) / 100.0
                    val i = Math.round(sqrt(iR * iR + ((iL-iC)*(iL-iC))) * 100.0) / 100.0
                    val Z = Math.round((V / i) * 100.0) / 100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val iLtamSayi = iL.toInt()
                    val iCtamSayi = iC.toInt()
                    val iRtamSayi = iR.toInt()

                    if(XL > XLtamSayi){
                        binding.textViewParalelRLCXL.text = "XL: $XL Ω"
                    }else{
                        binding.textViewParalelRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewParalelRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewParalelRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if(iR > iRtamSayi){
                        binding.textViewParalelRLCiR.text = "IR: $iR A"
                    }else{
                        binding.textViewParalelRLCiR.text = "IR: $iRtamSayi A"
                    }

                    if(iL > iLtamSayi){
                        binding.textViewParalelRLCiL.text = "IL: $iL A"
                    }else{
                        binding.textViewParalelRLCiL.text = "IL: $iLtamSayi A"
                    }

                    if (iC > iCtamSayi) {
                        binding.textViewParalelRLCiC.text = "IC: $iC A"
                    } else {
                        binding.textViewParalelRLCiC.text = "IC: $iCtamSayi A"
                    }

                    if (i > itamSayi) {
                        binding.textViewParalelRLCi.text = "I: $i A"
                    } else {
                        binding.textViewParalelRLCi.text = "I: $itamSayi A"
                    }

                    if(Z > ZtamSayi){
                        binding.textViewParalelRLCZ.text = "Z: $Z Ω"
                    }else{
                        binding.textViewParalelRLCZ.text = "Z: $ZtamSayi Ω"
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
                    val XL = Math.round((2*3.14* f *(L/1000000))*100.0)/100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000))) * 100.0) / 100.0
                    val iL = Math.round((V / XL)* 100.0) / 100.0
                    val iC = Math.round((V / XC) * 100.0) / 100.0
                    val iR = Math.round((V / R) * 100.0) / 100.0
                    val i = Math.round(sqrt(iR * iR + ((iL-iC)*(iL-iC))) * 100.0) / 100.0
                    val Z = Math.round((V / i) * 100.0) / 100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val iLtamSayi = iL.toInt()
                    val iCtamSayi = iC.toInt()
                    val iRtamSayi = iR.toInt()

                    if(XL > XLtamSayi){
                        binding.textViewParalelRLCXL.text = "XL: $XL Ω"
                    }else{
                        binding.textViewParalelRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewParalelRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewParalelRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if(iR > iRtamSayi){
                        binding.textViewParalelRLCiR.text = "IR: $iR A"
                    }else{
                        binding.textViewParalelRLCiR.text = "IR: $iRtamSayi A"
                    }

                    if(iL > iLtamSayi){
                        binding.textViewParalelRLCiL.text = "IL: $iL A"
                    }else{
                        binding.textViewParalelRLCiL.text = "IL: $iLtamSayi A"
                    }

                    if (iC > iCtamSayi) {
                        binding.textViewParalelRLCiC.text = "IC: $iC A"
                    } else {
                        binding.textViewParalelRLCiC.text = "IC: $iCtamSayi A"
                    }

                    if (i > itamSayi) {
                        binding.textViewParalelRLCi.text = "I: $i A"
                    } else {
                        binding.textViewParalelRLCi.text = "I: $itamSayi A"
                    }

                    if(Z > ZtamSayi){
                        binding.textViewParalelRLCZ.text = "Z: $Z Ω"
                    }else{
                        binding.textViewParalelRLCZ.text = "Z: $ZtamSayi Ω"
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
                    val XL = Math.round((2*3.14* f *(L/1000000))*100.0)/100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000000))) * 100.0) / 100.0
                    val iL = Math.round((V / XL)* 100.0) / 100.0
                    val iC = Math.round((V / XC) * 100.0) / 100.0
                    val iR = Math.round((V / R) * 100.0) / 100.0
                    val i = Math.round(sqrt(iR * iR + ((iL-iC)*(iL-iC))) * 100.0) / 100.0
                    val Z = Math.round((V / i) * 100.0) / 100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val iLtamSayi = iL.toInt()
                    val iCtamSayi = iC.toInt()
                    val iRtamSayi = iR.toInt()

                    if(XL > XLtamSayi){
                        binding.textViewParalelRLCXL.text = "XL: $XL Ω"
                    }else{
                        binding.textViewParalelRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewParalelRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewParalelRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if(iR > iRtamSayi){
                        binding.textViewParalelRLCiR.text = "IR: $iR A"
                    }else{
                        binding.textViewParalelRLCiR.text = "IR: $iRtamSayi A"
                    }

                    if(iL > iLtamSayi){
                        binding.textViewParalelRLCiL.text = "IL: $iL A"
                    }else{
                        binding.textViewParalelRLCiL.text = "IL: $iLtamSayi A"
                    }

                    if (iC > iCtamSayi) {
                        binding.textViewParalelRLCiC.text = "IC: $iC A"
                    } else {
                        binding.textViewParalelRLCiC.text = "IC: $iCtamSayi A"
                    }

                    if (i > itamSayi) {
                        binding.textViewParalelRLCi.text = "I: $i A"
                    } else {
                        binding.textViewParalelRLCi.text = "I: $itamSayi A"
                    }

                    if(Z > ZtamSayi){
                        binding.textViewParalelRLCZ.text = "Z: $Z Ω"
                    }else{
                        binding.textViewParalelRLCZ.text = "Z: $ZtamSayi Ω"
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
                    val XL = Math.round((2*3.14* f *(L/1000000))*100.0)/100.0
                    val XC = Math.round((1 / (2 * 3.14 * f * (C/1000000000000))) * 100.0) / 100.0
                    val iL = Math.round((V / XL)* 100.0) / 100.0
                    val iC = Math.round((V / XC) * 100.0) / 100.0
                    val iR = Math.round((V / R) * 100.0) / 100.0
                    val i = Math.round(sqrt(iR * iR + ((iL-iC)*(iL-iC))) * 100.0) / 100.0
                    val Z = Math.round((V / i) * 100.0) / 100.0

                    val XLtamSayi = XL.toInt()
                    val XCtamSayi = XC.toInt()
                    val ZtamSayi = Z.toInt()
                    val itamSayi = i.toInt()
                    val iLtamSayi = iL.toInt()
                    val iCtamSayi = iC.toInt()
                    val iRtamSayi = iR.toInt()

                    if(XL > XLtamSayi){
                        binding.textViewParalelRLCXL.text = "XL: $XL Ω"
                    }else{
                        binding.textViewParalelRLCXL.text = "XL: $XLtamSayi Ω"
                    }

                    if (XC > XCtamSayi) {
                        binding.textViewParalelRLCXC.text = "XC: $XC Ω"
                    } else {
                        binding.textViewParalelRLCXC.text = "XC: $XCtamSayi Ω"
                    }

                    if(iR > iRtamSayi){
                        binding.textViewParalelRLCiR.text = "IR: $iR A"
                    }else{
                        binding.textViewParalelRLCiR.text = "IR: $iRtamSayi A"
                    }

                    if(iL > iLtamSayi){
                        binding.textViewParalelRLCiL.text = "IL: $iL A"
                    }else{
                        binding.textViewParalelRLCiL.text = "IL: $iLtamSayi A"
                    }

                    if (iC > iCtamSayi) {
                        binding.textViewParalelRLCiC.text = "IC: $iC A"
                    } else {
                        binding.textViewParalelRLCiC.text = "IC: $iCtamSayi A"
                    }

                    if (i > itamSayi) {
                        binding.textViewParalelRLCi.text = "I: $i A"
                    } else {
                        binding.textViewParalelRLCi.text = "I: $itamSayi A"
                    }

                    if(Z > ZtamSayi){
                        binding.textViewParalelRLCZ.text = "Z: $Z Ω"
                    }else{
                        binding.textViewParalelRLCZ.text = "Z: $ZtamSayi Ω"
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