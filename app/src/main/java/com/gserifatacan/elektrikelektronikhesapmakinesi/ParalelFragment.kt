package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentParalelBinding

class ParalelFragment : Fragment() {

    private var _binding: FragmentParalelBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentParalelBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonParalelHesapla.setOnClickListener(){
            val PR1 = binding.editTextPR1.text.toString().toFloatOrNull()
            val PR2 = binding.editTextPR2.text.toString().toFloatOrNull()
            val PR3 = binding.editTextPR3.text.toString().toFloatOrNull()

            hideKeyboard()

            if(PR1 != null && PR2 != null && PR3 != null){
                val sonuc = Math.round((PR1 * PR2 * PR3) / (PR2 * PR3 + PR1 * PR3 + PR1 * PR2)*100.0)/100.0

                val sonucTamSayi = sonuc.toInt()

                if(sonuc > sonucTamSayi){
                    binding.textViewParalel.text = "Eş değer direnç = $sonuc Ω"
                    binding.textViewResParalel.text = "Reş = $sonuc Ω"
                }else{
                    binding.textViewParalel.text = "Eş değer direnç = $sonucTamSayi Ω"
                    binding.textViewResParalel.text = "Reş = $sonucTamSayi Ω"
                }
            }else{
                Toast.makeText(activity,"R1, R2 ve R3 kutucuklarına direnç değerlerini giriniz", Toast.LENGTH_SHORT).show()
            }
        }
    }
}