package com.gserifatacan.elektrikelektronikhesapmakinesi

//noinspection SuspiciousImport
import android.R
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.ActivityParalelRcBinding
import kotlin.math.sqrt


class ParalelRC : AppCompatActivity() {

    private lateinit var binding: ActivityParalelRcBinding
    lateinit var mAdView : AdView

    private val kondansatorBirim = ArrayList<String>()
    private lateinit var veriAdaptoru1: ArrayAdapter<String>

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParalelRcBinding.inflate(layoutInflater)
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

        veriAdaptoru1 =
            ArrayAdapter(this, R.layout.simple_list_item_1, R.id.text1, kondansatorBirim)

        binding.spinnerKondansator.adapter = veriAdaptoru1

        binding.spinnerKondansator.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, indeks: Int, p3: Long) {

                val gelenVeri = kondansatorBirim[indeks]

                binding.buttonParalelRCHesapla.setOnClickListener() {

                    val R = binding.editTextParalelRCR.text.toString().toFloatOrNull()
                    val C = binding.editTextParalelRCC.text.toString().toFloatOrNull()
                    val V = binding.editTextParalelRCV.text.toString().toFloatOrNull()
                    val f = binding.editTextParalelRCf.text.toString().toFloatOrNull()

                    try {
                        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                        imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
                    } catch (_: Exception) {
                    }

                    if (gelenVeri == "Kondansatör Birimi") {
                        Toast.makeText(
                            applicationContext, com.gserifatacan.elektrikelektronikhesapmakinesi.R.string.paralelrcuyari,
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }

                    if (gelenVeri == "Farad") {
                        if (R != null && C != null && V != null && f != null) {
                            val XC = Math.round((1 / (2 * 3.14 * f * (C))) * 100.0) / 100.0
                            val iC = Math.round((V / XC) * 100.0) / 100.0
                            val iR = Math.round((V / R) * 100.0) / 100.0
                            val i = Math.round(sqrt(iR * iR + iC * iC) * 100.0) / 100.0
                            val Z = Math.round((V / i) * 100.0) / 100.0

                            val XCtamSayi = XC.toInt()
                            val ZtamSayi = Z.toInt()
                            val itamSayi = i.toInt()
                            val iCtamSayi = iC.toInt()
                            val iRtamSayi = iR.toInt()

                            if (XC > XCtamSayi) {
                                binding.textViewParalelRCXC.text = "XC: $XC Ω"
                            } else {
                                binding.textViewParalelRCXC.text = "XC: $XCtamSayi Ω"
                            }

                            if (Z > ZtamSayi) {
                                binding.textViewParalelRCZ.text = "Z: $Z Ω"
                            } else {
                                binding.textViewParalelRCZ.text = "Z: $ZtamSayi Ω"
                            }

                            if (iC > iCtamSayi) {
                                binding.textViewParelelRCiC.text = "IC: $iC A"
                            } else {
                                binding.textViewParelelRCiC.text = "IC: $iCtamSayi A"
                            }

                            if (iR > iRtamSayi) {
                                binding.textViewParalelRCiR.text = "IR: $iR A"
                            } else {
                                binding.textViewParalelRCiR.text = "IR: $iRtamSayi A"
                            }

                            if (i > itamSayi) {
                                binding.textViewParalelRCi.text = "I: $i A"
                            } else {
                                binding.textViewParalelRCi.text = "I: $itamSayi A"
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
                            val iC = Math.round((V / XC) * 100.0) / 100.0
                            val iR = Math.round((V / R) * 100.0) / 100.0
                            val i = Math.round(sqrt(iR * iR + iC * iC) * 100.0) / 100.0
                            val Z = Math.round((V / i) * 100.0) / 100.0

                            val XCtamSayi = XC.toInt()
                            val ZtamSayi = Z.toInt()
                            val itamSayi = i.toInt()
                            val iCtamSayi = iC.toInt()
                            val iRtamSayi = iR.toInt()

                            if (XC > XCtamSayi) {
                                binding.textViewParalelRCXC.text = "XC: $XC Ω"
                            } else {
                                binding.textViewParalelRCXC.text = "XC: $XCtamSayi Ω"
                            }

                            if (Z > ZtamSayi) {
                                binding.textViewParalelRCZ.text = "Z: $Z Ω"
                            } else {
                                binding.textViewParalelRCZ.text = "Z: $ZtamSayi Ω"
                            }

                            if (iC > iCtamSayi) {
                                binding.textViewParelelRCiC.text = "IC: $iC A"
                            } else {
                                binding.textViewParelelRCiC.text = "IC: $iCtamSayi A"
                            }

                            if (iR > iRtamSayi) {
                                binding.textViewParalelRCiR.text = "IR: $iR A"
                            } else {
                                binding.textViewParalelRCiR.text = "IR: $iRtamSayi A"
                            }

                            if (i > itamSayi) {
                                binding.textViewParalelRCi.text = "I: $i A"
                            } else {
                                binding.textViewParalelRCi.text = "I: $itamSayi A"
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
                            val iC = Math.round((V / XC) * 100.0) / 100.0
                            val iR = Math.round((V / R) * 100.0) / 100.0
                            val i = Math.round(sqrt(iR * iR + iC * iC) * 100.0) / 100.0
                            val Z = Math.round((V / i) * 100.0) / 100.0

                            val XCtamSayi = XC.toInt()
                            val ZtamSayi = Z.toInt()
                            val itamSayi = i.toInt()
                            val iCtamSayi = iC.toInt()
                            val iRtamSayi = iR.toInt()

                            if (XC > XCtamSayi) {
                                binding.textViewParalelRCXC.text = "XC: $XC Ω"
                            } else {
                                binding.textViewParalelRCXC.text = "XC: $XCtamSayi Ω"
                            }

                            if (Z > ZtamSayi) {
                                binding.textViewParalelRCZ.text = "Z: $Z Ω"
                            } else {
                                binding.textViewParalelRCZ.text = "Z: $ZtamSayi Ω"
                            }

                            if (iC > iCtamSayi) {
                                binding.textViewParelelRCiC.text = "IC: $iC A"
                            } else {
                                binding.textViewParelelRCiC.text = "IC: $iCtamSayi A"
                            }

                            if (iR > iRtamSayi) {
                                binding.textViewParalelRCiR.text = "IR: $iR A"
                            } else {
                                binding.textViewParalelRCiR.text = "IR: $iRtamSayi A"
                            }

                            if (i > itamSayi) {
                                binding.textViewParalelRCi.text = "I: $i A"
                            } else {
                                binding.textViewParalelRCi.text = "I: $itamSayi A"
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
                            val iC = Math.round((V / XC) * 100.0) / 100.0
                            val iR = Math.round((V / R) * 100.0) / 100.0
                            val i = Math.round(sqrt(iR * iR + iC * iC) * 100.0) / 100.0
                            val Z = Math.round((V / i) * 100.0) / 100.0

                            val XCtamSayi = XC.toInt()
                            val ZtamSayi = Z.toInt()
                            val itamSayi = i.toInt()
                            val iCtamSayi = iC.toInt()
                            val iRtamSayi = iR.toInt()

                            if (XC > XCtamSayi) {
                                binding.textViewParalelRCXC.text = "XC: $XC Ω"
                            } else {
                                binding.textViewParalelRCXC.text = "XC: $XCtamSayi Ω"
                            }

                            if (Z > ZtamSayi) {
                                binding.textViewParalelRCZ.text = "Z: $Z Ω"
                            } else {
                                binding.textViewParalelRCZ.text = "Z: $ZtamSayi Ω"
                            }

                            if (iC > iCtamSayi) {
                                binding.textViewParelelRCiC.text = "IC: $iC A"
                            } else {
                                binding.textViewParelelRCiC.text = "IC: $iCtamSayi A"
                            }

                            if (iR > iRtamSayi) {
                                binding.textViewParalelRCiR.text = "IR: $iR A"
                            } else {
                                binding.textViewParalelRCiR.text = "IR: $iRtamSayi A"
                            }

                            if (i > itamSayi) {
                                binding.textViewParalelRCi.text = "I: $i A"
                            } else {
                                binding.textViewParalelRCi.text = "I: $itamSayi A"
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
                            val iC = Math.round((V / XC) * 100.0) / 100.0
                            val iR = Math.round((V / R) * 100.0) / 100.0
                            val i = Math.round(sqrt(iR * iR + iC * iC) * 100.0) / 100.0
                            val Z = Math.round((V / i) * 100.0) / 100.0

                            val XCtamSayi = XC.toInt()
                            val ZtamSayi = Z.toInt()
                            val itamSayi = i.toInt()
                            val iCtamSayi = iC.toInt()
                            val iRtamSayi = iR.toInt()

                            if (XC > XCtamSayi) {
                                binding.textViewParalelRCXC.text = "XC: $XC Ω"
                            } else {
                                binding.textViewParalelRCXC.text = "XC: $XCtamSayi Ω"
                            }

                            if (Z > ZtamSayi) {
                                binding.textViewParalelRCZ.text = "Z: $Z Ω"
                            } else {
                                binding.textViewParalelRCZ.text = "Z: $ZtamSayi Ω"
                            }

                            if (iC > iCtamSayi) {
                                binding.textViewParelelRCiC.text = "IC: $iC A"
                            } else {
                                binding.textViewParelelRCiC.text = "IC: $iCtamSayi A"
                            }

                            if (iR > iRtamSayi) {
                                binding.textViewParalelRCiR.text = "IR: $iR A"
                            } else {
                                binding.textViewParalelRCiR.text = "IR: $iRtamSayi A"
                            }

                            if (i > itamSayi) {
                                binding.textViewParalelRCi.text = "I: $i A"
                            } else {
                                binding.textViewParalelRCi.text = "I: $itamSayi A"
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