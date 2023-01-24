package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentSeriBinding

class SeriFragment : Fragment() {

    private var _binding: FragmentSeriBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSeriBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSeriHesapla.setOnClickListener(){
            val SR1 = binding.editTextSR1.text.toString().toIntOrNull()
            val SR2 = binding.editTextSR2.text.toString().toIntOrNull()
            val SR3 = binding.editTextSR3.text.toString().toIntOrNull()

            hideKeyboard()

            if(SR1 != null && SR2 != null && SR3 != null){
                val sonuc = SR1 + SR2 + SR3

                val sonucTamSayi = sonuc.toInt()

                if(sonuc > sonucTamSayi){
                    binding.textViewSeri.text = "Eş değer direnç = $sonuc Ω"
                    binding.textViewResSeri.text = "Reş = $sonuc Ω"
                }else{
                    binding.textViewSeri.text = "Eş değer direnç = $sonuc Ω"
                    binding.textViewResSeri.text = "Reş = $sonucTamSayi Ω"
                }
            }else{
                Toast.makeText(activity,"R1, R2 ve R3 kutucuklarına direnç değerlerini giriniz", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
