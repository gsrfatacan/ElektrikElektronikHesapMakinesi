package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentUcBantDirencBinding

class UcBantDirencFragment : Fragment() {

    private var _binding: FragmentUcBantDirencBinding? = null
    private val binding get() = _binding!!

    var gelenSayi1: Int? = null
    var gelenSayi2: Int? = null
    var gelenSayi3: Long? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentUcBantDirencBinding.inflate(inflater, container, false)
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

        binding.buttonSiyah1.setOnClickListener() {
            gelenSayi1 = 0
        }

        binding.buttonKahverengi1.setOnClickListener() {
            gelenSayi1 = 10
        }

        binding.buttonKirmizi1.setOnClickListener() {
            gelenSayi1 = 20
        }

        binding.buttonTuruncu1.setOnClickListener() {
            gelenSayi1 = 30
        }

        binding.buttonSari1.setOnClickListener() {
            gelenSayi1 = 40
        }

        binding.buttonYesil1.setOnClickListener() {
            gelenSayi1 = 50
        }

        binding.buttonMavi1.setOnClickListener() {
            gelenSayi1 = 60
        }

        binding.buttonMor1.setOnClickListener() {
            gelenSayi1 = 70
        }

        binding.buttonGri1.setOnClickListener() {
            gelenSayi1 = 80
        }

        binding.buttonBeyaz1.setOnClickListener() {
            gelenSayi1 = 90
        }

        binding.buttonSiyah2.setOnClickListener() {
            gelenSayi2 = 0
        }

        binding.buttonKahverengi2.setOnClickListener() {
            gelenSayi2 = 1
        }

        binding.buttonKirmizi2.setOnClickListener() {
            gelenSayi2 = 2
        }

        binding.buttonTuruncu2.setOnClickListener() {
            gelenSayi2 = 3
        }

        binding.buttonSari2.setOnClickListener() {
            gelenSayi2 = 4
        }

        binding.buttonYesil2.setOnClickListener() {
            gelenSayi2 = 5
        }

        binding.buttonMavi2.setOnClickListener() {
            gelenSayi2 = 6
        }

        binding.buttonMor2.setOnClickListener() {
            gelenSayi2 = 7
        }

        binding.buttonGri2.setOnClickListener() {
            gelenSayi2 = 8
        }

        binding.buttonBeyaz2.setOnClickListener() {
            gelenSayi2 = 9
        }

        binding.buttonSiyah3.setOnClickListener() {
            gelenSayi3 = 1
        }

        binding.buttonKahverengi3.setOnClickListener() {
            gelenSayi3 = 10
        }

        binding.buttonKirmizi3.setOnClickListener() {
            gelenSayi3 = 100
        }

        binding.buttonTuruncu3.setOnClickListener() {
            gelenSayi3 = 1000
        }

        binding.buttonSari3.setOnClickListener() {
            gelenSayi3 = 10000
        }

        binding.buttonYesil3.setOnClickListener() {
            gelenSayi3 = 100000
        }

        binding.buttonMavi3.setOnClickListener() {
            gelenSayi3 = 1000000
        }

        binding.buttonMor3.setOnClickListener() {
            gelenSayi3 = 10000000
        }

        binding.buttonGri3.setOnClickListener() {
            gelenSayi3 = 100000000
        }

        binding.buttonBeyaz3.setOnClickListener() {
            gelenSayi3 = 1000000000
        }

        binding.buttonHesapla.setOnClickListener() {
            if (gelenSayi1 != null && gelenSayi2 != null && gelenSayi3 != null) {

                val sonuc = (gelenSayi1!! + gelenSayi2!!) * gelenSayi3!!

                val sonucTamSayi = sonuc.toInt()

                if(sonuc > sonucTamSayi){
                    binding.textSonuc3bant.text = "$sonuc Ω"
                }else{
                    binding.textSonuc3bant.text = "$sonucTamSayi Ω"
                }

                if (sonuc >= 1000 || sonucTamSayi >= 1000) {
                    val cevir = sonuc / 1000.0
                    val cevirTamSayi = cevir.toInt()

                    if(cevir > cevirTamSayi){
                        binding.textSonuc3bant.text = "$cevir KΩ"
                    }else{
                        binding.textSonuc3bant.text = "$cevirTamSayi KΩ"
                    }
                }

                if (sonuc >= 1000000 || sonucTamSayi >= 1000000) {
                    val cevir = sonuc / 1000000.0
                    val cevirTamSayi = cevir.toInt()

                    if(cevir > cevirTamSayi){
                        binding.textSonuc3bant.text = "$cevir MΩ"
                    }else{
                        binding.textSonuc3bant.text = "$cevirTamSayi MΩ"
                    }
                }
            } else if (gelenSayi1 == null && gelenSayi2 == null && gelenSayi3 == null){
                Toast.makeText(activity,"Lütfen sırayla üç renk seçimi yapınız", Toast.LENGTH_SHORT).show()
            }
            gelenSayi1 = 0
            gelenSayi2 = 0
            gelenSayi3 = 0
        }
    }
}