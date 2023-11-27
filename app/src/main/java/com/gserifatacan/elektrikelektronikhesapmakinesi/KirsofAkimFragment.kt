package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentKirsofAkimBinding


class KirsofAkimFragment : Fragment() {

    private var _binding: FragmentKirsofAkimBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentKirsofAkimBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    @SuppressLint("StringFormatInvalid")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonKirsofAkimHesapla.setOnClickListener() { mesaj->

            val R1 = binding.editTextKirsofAkimR1.text.toString().toFloatOrNull()
            val R2 = binding.editTextKirsofAkimR2.text.toString().toFloatOrNull()
            val R3 = binding.editTextKirsofAkimR3.text.toString().toFloatOrNull()
            val V = binding.editTextKirsofAkimV.text.toString().toFloatOrNull()

            hideKeyboard()

            if (R1 != null && R2 != null && R3 != null && V != null) {
                val Res = Math.round((R1 * R2 * R3) / (R2 * R3 + R1 * R3 + R1 * R2)*100.0)/100.0
                val I = Math.round((V / Res) * 100.0) / 100.0
                val I1 = Math.round((V / R1) * 100.0) / 100.0
                val I2 = Math.round((V / R2) * 100.0) / 100.0
                val I3 = Math.round((V / R3) * 100.0) / 100.0
                val V1 = Math.round((I1 * R1) * 100.0) / 100.0
                val V2 = Math.round((I2 * R2) * 100.0) / 100.0
                val V3 = Math.round((I3 * R3) * 100.0) / 100.0

                val resTamSayi = Res.toInt()
                if(Res > resTamSayi){
                    binding.textViewKirsofAkimRes.text = "Reş: $Res Ω"
                }
                else{
                    binding.textViewKirsofAkimRes.text = "Reş: $resTamSayi Ω"
                }

                val iTamSayi = I.toInt()
                if(I > iTamSayi){
                    binding.textViewKirsifAkimI.text = "Akım: $I A"
                }
                else{
                    binding.textViewKirsifAkimI.text = "Akım: $iTamSayi A"
                }

                val i1TamSayi = I1.toInt()
                if(I1 > i1TamSayi){
                    binding.textViewKirsifAkimIR1.text = "IR1: $I1 A"
                }
                else{
                    binding.textViewKirsifAkimIR1.text = "IR1: $i1TamSayi A"
                }

                val i2TamSayi = I2.toInt()
                if(I2 > i2TamSayi){
                    binding.textViewKirsifAkimIR2.text = ("IR2 = $I2 A")
                }
                else{
                    binding.textViewKirsifAkimIR2.text = ("IR2 = $i2TamSayi A")
                }

                val i3TamSayi = I3.toInt()
                if(I3 > i3TamSayi){
                    binding.textViewKirsifAkimIR3.text = ("IR3 = $I3 A")
                }
                else{
                    binding.textViewKirsifAkimIR3.text = ("IR3 = $i3TamSayi A")
                }

                val v1TamSayi = V1.toInt()
                if(V1 > v1TamSayi){
                    binding.textViewKirsifAkimvR1.text = ("VR1 = $V1 V")
                }
                else{
                    binding.textViewKirsifAkimvR1.text = ("VR1 = $v1TamSayi V")
                }

                val v2TamSayi = V2.toInt()
                if(V2 > v2TamSayi){
                    binding.textViewKirsifAkimvR2.text = ("VR2 = $V2 V")
                }
                else{
                    binding.textViewKirsifAkimvR2.text = ("VR2 = $v2TamSayi V")
                }

                val v3TamSayi = V3.toInt()
                if(V3 > v3TamSayi){
                    binding.textViewKirsifAkimvR3.text = ("VR3 = $V3 V")
                }
                else{
                    binding.textViewKirsifAkimvR3.text = ("VR3 = $v3TamSayi V")
                }

                val sb = Snackbar.make(mesaj, R.string.kirsofakimhatirlatma, Snackbar.LENGTH_INDEFINITE)

                sb.setAction(R.string.tamam){

                }
                sb.setActionTextColor(Color.BLUE)
                sb.setTextColor(Color.BLACK)
                sb.setBackgroundTint(Color.WHITE)
                    .show()
            } else {
                Toast.makeText(activity, R.string.kirsofakimuyari , Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}