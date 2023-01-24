package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentDortBantDirencBinding

class DortBantDirencFragment : Fragment() {

    private var _binding: FragmentDortBantDirencBinding? = null
    private val binding get() = _binding!!

    var gelenSayi1: Int? = null
    var gelenSayi2: Int? = null
    var gelenSayi3: Long? = null
    var gelenSayi4: Float? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDortBantDirencBinding.inflate(inflater, container, false)
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

        binding.buttonSiyah41.setOnClickListener() {
            gelenSayi1 = 0
        }

        binding.buttonKahverengi41.setOnClickListener() {
            gelenSayi1 = 10
        }

        binding.buttonKirmizi41.setOnClickListener() {
            gelenSayi1 = 20
        }

        binding.buttonTuruncu41.setOnClickListener() {
            gelenSayi1 = 30
        }

        binding.buttonSari41.setOnClickListener() {
            gelenSayi1 = 40
        }

        binding.buttonYesil41.setOnClickListener() {
            gelenSayi1 = 50
        }

        binding.buttonMavi41.setOnClickListener() {
            gelenSayi1 = 60
        }

        binding.buttonMor41.setOnClickListener() {
            gelenSayi1 = 70
        }

        binding.buttonGri41.setOnClickListener() {
            gelenSayi1 = 80
        }

        binding.buttonBeyaz41.setOnClickListener() {
            gelenSayi1 = 90
        }

        binding.buttonSiyah42.setOnClickListener() {
            gelenSayi2 = 0
        }

        binding.buttonKahverengi42.setOnClickListener() {
            gelenSayi2 = 1
        }

        binding.buttonKirmizi42.setOnClickListener() {
            gelenSayi2 = 2
        }

        binding.buttonTuruncu42.setOnClickListener() {
            gelenSayi2 = 3
        }

        binding.buttonSari42.setOnClickListener() {
            gelenSayi2 = 4
        }

        binding.buttonYesil42.setOnClickListener() {
            gelenSayi2 = 5
        }

        binding.buttonMavi42.setOnClickListener() {
            gelenSayi2 = 6
        }

        binding.buttonMor42.setOnClickListener() {
            gelenSayi2 = 7
        }

        binding.buttonGri42.setOnClickListener() {
            gelenSayi2 = 8
        }

        binding.buttonBeyaz42.setOnClickListener() {
            gelenSayi2 = 9
        }

        binding.buttonSiyah43.setOnClickListener() {
            gelenSayi3 = 1
        }

        binding.buttonKahverengi43.setOnClickListener() {
            gelenSayi3 = 10
        }

        binding.buttonKirmizi43.setOnClickListener() {
            gelenSayi3 = 100
        }

        binding.buttonTuruncu43.setOnClickListener() {
            gelenSayi3 = 1000
        }

        binding.buttonSari43.setOnClickListener() {
            gelenSayi3 = 10000
        }

        binding.buttonYesil43.setOnClickListener() {
            gelenSayi3 = 100000
        }

        binding.buttonMavi43.setOnClickListener() {
            gelenSayi3 = 1000000
        }

        binding.buttonMor43.setOnClickListener() {
            gelenSayi3 = 10000000
        }

        binding.buttonGri43.setOnClickListener() {
            gelenSayi3 = 100000000
        }

        binding.buttonBeyaz43.setOnClickListener() {
            gelenSayi3 = 1000000000
        }

        binding.buttonSiyah44.setOnClickListener() {
            gelenSayi4 = 0f
        }

        binding.buttonKahverengi44.setOnClickListener() {
            gelenSayi4 = 1f
        }

        binding.buttonKirmizi44.setOnClickListener() {
            gelenSayi4 = 2f
        }

        binding.buttonTuruncu44.setOnClickListener() {
            gelenSayi4 = 3f
        }

        binding.buttonSari44.setOnClickListener() {
            gelenSayi4 = 4f
        }

        binding.buttonYesil44.setOnClickListener() {
            gelenSayi4 = 0.5f
        }

        binding.buttonMavi44.setOnClickListener() {
            gelenSayi4 = 0.25f
        }

        binding.buttonMor44.setOnClickListener() {
            gelenSayi4 = 0.1f
        }

        binding.buttonGri44.setOnClickListener() {
            gelenSayi4 = 0.05f
        }

        binding.buttonBeyaz44.setOnClickListener() {
            gelenSayi4 = 0f
        }

        binding.buttonAltin4.setOnClickListener() {
            gelenSayi4 = 5f
        }

        binding.buttonGumus4.setOnClickListener() {
            gelenSayi4 = 10f
        }

        binding.buttonHesapla4.setOnClickListener() {
            if (gelenSayi1 != null && gelenSayi2 != null && gelenSayi3 != null && gelenSayi4 != null) {

                val sonuc = (gelenSayi1!! + gelenSayi2!!) * gelenSayi3!!

                val sonucTamSayi = sonuc.toInt()

                val ToleransTamSayi = gelenSayi4!!.toInt()

                /*val tolerans = (sonuc * gelenSayi4!!) / 100

                val ustDeger = sonuc + tolerans
                val altDeger = sonuc - tolerans*/

                if(sonuc > sonucTamSayi){
                    if(gelenSayi4!! >= 1){
                        binding.textsonuc4bant.text = "$sonuc Ω ±%$ToleransTamSayi"
                    }else{
                        binding.textsonuc4bant.text = "$sonuc Ω ±%$gelenSayi4"
                    }
                }else{
                    if(gelenSayi4!! >= 1){
                        binding.textsonuc4bant.text = "$sonucTamSayi Ω ±%$ToleransTamSayi"
                    }else{
                        binding.textsonuc4bant.text = "$sonucTamSayi Ω ±%$gelenSayi4"
                    }
                }

                if (sonuc >= 1000 || sonucTamSayi >= 1000) {
                    val cevir = sonuc / 1000.0
                    val cevirTamSayi = cevir.toInt()

                    if(cevir > cevirTamSayi){
                        if(gelenSayi4!! >= 1){
                            binding.textsonuc4bant.text = "$cevir KΩ ±%$ToleransTamSayi"
                        }else{
                            binding.textsonuc4bant.text = "$cevir KΩ ±%$gelenSayi4"
                        }
                    }else{
                        if(gelenSayi4!! >= 1){
                            binding.textsonuc4bant.text = "$cevirTamSayi KΩ ±%$ToleransTamSayi"
                        }else{
                            binding.textsonuc4bant.text = "$cevirTamSayi KΩ ±%$gelenSayi4"
                        }
                    }
                }
                if (sonuc >= 1000000 || sonucTamSayi >= 1000000) {
                    val cevir = sonuc / 1000000.0
                    val cevirTamSayi = cevir.toInt()

                    if(cevir > cevirTamSayi){
                        if(gelenSayi4!! >= 1){
                            binding.textsonuc4bant.text = "$cevir MΩ ±%$ToleransTamSayi"
                        }else{
                            binding.textsonuc4bant.text = "$cevir MΩ ±%$gelenSayi4"
                        }
                    }else{
                        if(gelenSayi4!! >=1){
                            binding.textsonuc4bant.text = "$cevirTamSayi MΩ ±%$ToleransTamSayi"
                        }else{
                            binding.textsonuc4bant.text = "$cevirTamSayi MΩ ±%$gelenSayi4"
                        }
                    }
                }
            }else if (gelenSayi1 == null && gelenSayi2 == null && gelenSayi3 == null && gelenSayi4 == null){
                Toast.makeText(activity,"Lütfen sırayla dört renk seçimi yapınız", Toast.LENGTH_SHORT).show()
            }
            gelenSayi1 = 0
            gelenSayi2 = 0
            gelenSayi3 = 0
            gelenSayi4 = 0f
        }
    }
}
