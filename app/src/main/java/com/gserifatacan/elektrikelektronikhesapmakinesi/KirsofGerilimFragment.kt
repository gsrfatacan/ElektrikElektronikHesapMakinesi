package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentKirsofGerilimBinding

class KirsofGerilimFragment : Fragment() {

    private var _binding: FragmentKirsofGerilimBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        _binding = FragmentKirsofGerilimBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonKirsofGerilimHesapla.setOnClickListener(){ mesaj->

            val R1 = binding.editTextKirsofR1.text.toString().toFloatOrNull()
            val R2 = binding.editTextKirsofR2.text.toString().toFloatOrNull()
            val R3 = binding.editTextKirsofR3.text.toString().toFloatOrNull()
            val V = binding.editTextKirsofGerilim.text.toString().toFloatOrNull()

            hideKeyboard()

            if (R1 != null && R2 != null && R3 != null && V != null){
                val Res = R1 + R2 + R3
                val I = Math.round((V / Res) * 100.0) / 100.0
                val I1 = Math.round((V / Res) * 100.0) / 100.0
                val I2 = Math.round((V / Res) * 100.0) / 100.0
                val I3 = Math.round((V / Res) * 100.0) / 100.0
                val V1 = Math.round((I1 * R1) * 100.0) / 100.0
                val V2 = Math.round((I2 * R2) * 100.0) / 100.0
                val V3 = Math.round((I3 * R3) * 100.0) / 100.0

                val resTamsayi = Res.toInt()
                if(Res > resTamsayi){
                    binding.textViewKirsofGerilimIRes.text = ("Reş = $Res Ω")
                }else{
                    binding.textViewKirsofGerilimIRes.text = ("Reş = $resTamsayi Ω")
                }

                val iTamSayi = I.toInt()
                if(I > iTamSayi){
                    binding.textViewKirsofGerilimI.text = ("Akım = $I A")
                }else{
                    binding.textViewKirsofGerilimI.text = ("Akım = $iTamSayi A")
                }

                val i1TamSayi = I1.toInt()
                if(I1 > i1TamSayi){
                    binding.textViewKirsofGerilimIR1.text = ("IR1 = $I1 A")
                }else{
                    binding.textViewKirsofGerilimIR1.text = ("IR1 = $i1TamSayi A")
                }

                val i2TamSayi = I2.toInt()
                if(I2 > i2TamSayi){
                    binding.textViewKirsofGerilimIR2.text = ("IR2 = $I2 A")
                }else{
                    binding.textViewKirsofGerilimIR2.text = ("IR2 = $i2TamSayi A")
                }

                val i3TamSayi = I3.toInt()
                if(I3 > i3TamSayi){
                    binding.textViewKirsofGerilimIR3.text = ("IR3 = $I3 A")
                }else{
                    binding.textViewKirsofGerilimIR3.text = ("IR3 = $i3TamSayi A")
                }

                val v1TamSayi = V1.toInt()
                if(V1 > v1TamSayi){
                    binding.textViewKirsofGerilimVR1.text = ("VR1 = $V1 V")
                    binding.textViewKirsofGerilimVR11.text = ("VR1=$V1 V")
                }else{
                    binding.textViewKirsofGerilimVR1.text = ("VR1 = $v1TamSayi V")
                    binding.textViewKirsofGerilimVR11.text = ("VR1=$v1TamSayi V")
                }

                val v2TamSayi = V2.toInt()
                if(V2 > v2TamSayi){
                    binding.textViewKirsofGerilimVR2.text = ("VR2 = $V2 V")
                    binding.textViewKirsofGerilimVR21.text = ("VR2=$V2 V")
                }else{
                    binding.textViewKirsofGerilimVR2.text = ("VR2 = $v2TamSayi V")
                    binding.textViewKirsofGerilimVR21.text = ("VR2=$v2TamSayi V")
                }

                val v3TamSayi = V3.toInt()
                if(V3 > v3TamSayi){
                    binding.textViewKirsofGerilimVR3.text = ("VR3 = $V3 V")
                    binding.textViewKirsofGerilimVR31.text = ("VR3=$V3 V")
                }else{
                    binding.textViewKirsofGerilimVR3.text = ("VR3 = $v3TamSayi V")
                    binding.textViewKirsofGerilimVR31.text = ("VR3=$v3TamSayi V")
                }

                val sb = Snackbar.make(mesaj, "V = VR1 + VR2 + VR3 olduğunu unutma!", Snackbar.LENGTH_INDEFINITE)

                sb.setAction("Tamam"){

                    }
                sb.setActionTextColor(Color.BLUE)
                sb.setTextColor(Color.BLACK)
                sb.setBackgroundTint(Color.WHITE)
                    .show()
            }else{
                Toast.makeText(activity, "R1, R2, R3 ve V kutucuklarına direnç değerlerini giriniz", Toast.LENGTH_SHORT).show()
            }
        }
    }
}