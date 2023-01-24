package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentOhmKanunuBinding
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentUcBantDirencBinding

fun Fragment.hideKeyboard() {
    val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(requireView().windowToken, 0)
}

class OhmKanunuFragment : Fragment() {

    private var _binding: FragmentOhmKanunuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentOhmKanunuBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonOhmHesapla.setOnClickListener() {
            val gerilim = binding.gerilimText.text.toString().toFloatOrNull()
            val akim = binding.akimText.text.toString().toFloatOrNull()
            val direnc = binding.direncText.text.toString().toFloatOrNull()

            hideKeyboard()

            if (direnc != null && akim != null && gerilim != null) {
                Toast.makeText(activity,"Lütfen en fazla iki adet değer giriniz.", Toast.LENGTH_SHORT).show()
            }
            else if(direnc == null && akim ==null || direnc == null && gerilim == null || akim == null && gerilim == null){
                Toast.makeText(activity,"Lütfen en az iki adet değer giriniz.", Toast.LENGTH_SHORT).show()
            }
            else if (gerilim != null && akim != null) {
                val direncSonuc = gerilim / akim

                val direncSonucTamSayi = direncSonuc.toInt()

                if(direncSonuc > direncSonucTamSayi){
                    binding.textViewOhmSonuc.text = "Direnç değeri: $direncSonuc Ω"
                }else{
                    binding.textViewOhmSonuc.text = "Direnç değeri: $direncSonucTamSayi Ω"
                }
            } else if (gerilim != null && direnc != null) {
                val akimSonuc = gerilim / direnc
                val akimSonucTamSayi = akimSonuc.toInt()

                if(akimSonuc > akimSonucTamSayi){
                    binding.textViewOhmSonuc.text = "Akım değeri: $akimSonuc A"
                }else{
                    binding.textViewOhmSonuc.text = "Akım değeri: $akimSonucTamSayi A"
                }
            } else if (akim != null && direnc != null) {
                val gerilimSonuc = direnc * akim

                val gerilimSonucTamSayi = gerilimSonuc.toInt()

                if(gerilimSonuc > gerilimSonucTamSayi){
                    binding.textViewOhmSonuc.text = "Gerilim değeri: $gerilimSonuc V"
                }else{
                    binding.textViewOhmSonuc.text = "Gerilim değeri: $gerilimSonucTamSayi V"
                }
            }
        }
    }
}