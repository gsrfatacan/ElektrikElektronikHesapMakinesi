package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentBesBantDirencBinding

class BesBantDirencFragment : Fragment() {

    private var _binding: FragmentBesBantDirencBinding? = null
    private val binding get() = _binding!!

    var gelenSayi1: Int? = null
    var gelenSayi2: Int? = null
    var gelenSayi3: Int? = null
    var gelenSayi4: Long? = null
    var gelenSayi5: Float? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBesBantDirencBinding.inflate(inflater, container, false)
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

        binding.buttonSiyah51.setOnClickListener() {
            gelenSayi1 = 0
        }

        binding.buttonKahve51.setOnClickListener() {
            gelenSayi1 = 100
        }

        binding.buttonKirmizi51.setOnClickListener() {
            gelenSayi1 = 200
        }

        binding.buttonTuruncu51.setOnClickListener() {
            gelenSayi1 = 300
        }

        binding.buttonSari51.setOnClickListener() {
            gelenSayi1 = 400
        }

        binding.buttonYesil51.setOnClickListener() {
            gelenSayi1 = 500
        }

        binding.buttonMavi51.setOnClickListener() {
            gelenSayi1 = 600
        }

        binding.buttonMor51.setOnClickListener() {
            gelenSayi1 = 700
        }

        binding.buttonGri51.setOnClickListener() {
            gelenSayi1 = 800
        }

        binding.buttonBeyaz51.setOnClickListener() {
            gelenSayi1 = 900
        }

        binding.buttonSiyah52.setOnClickListener() {
            gelenSayi2 = 0
        }

        binding.buttonKahve52.setOnClickListener() {
            gelenSayi2 = 10
        }

        binding.buttonKirmizi52.setOnClickListener() {
            gelenSayi2 = 20
        }

        binding.buttonTuruncu52.setOnClickListener() {
            gelenSayi2 = 30
        }

        binding.buttonSari52.setOnClickListener() {
            gelenSayi2 = 40
        }

        binding.buttonYesil52.setOnClickListener() {
            gelenSayi2 = 50
        }

        binding.buttonMavi52.setOnClickListener() {
            gelenSayi2 = 60
        }

        binding.buttonMor52.setOnClickListener() {
            gelenSayi2 = 70
        }

        binding.buttonGri52.setOnClickListener() {
            gelenSayi2 = 80
        }

        binding.buttonBeyaz52.setOnClickListener() {
            gelenSayi2 = 90
        }

        binding.buttonSiyah53.setOnClickListener() {
            gelenSayi3 = 0
        }

        binding.buttonKahve53.setOnClickListener() {
            gelenSayi3 = 1
        }

        binding.buttonKirmizi53.setOnClickListener() {
            gelenSayi3 = 2
        }

        binding.buttonTuruncu53.setOnClickListener() {
            gelenSayi3 = 3
        }

        binding.buttonSari53.setOnClickListener() {
            gelenSayi3 = 4
        }

        binding.buttonYesil53.setOnClickListener() {
            gelenSayi3 = 5
        }

        binding.buttonMavi53.setOnClickListener() {
            gelenSayi3 = 6
        }

        binding.buttonMor53.setOnClickListener() {
            gelenSayi3 = 7
        }

        binding.buttonGri53.setOnClickListener() {
            gelenSayi3 = 8
        }

        binding.buttonBeyaz53.setOnClickListener() {
            gelenSayi3 = 9
        }

        binding.buttonSiyah54.setOnClickListener() {
            gelenSayi4 = 1
        }

        binding.buttonKahve54.setOnClickListener() {
            gelenSayi4 = 10
        }

        binding.buttonKirmizi54.setOnClickListener() {
            gelenSayi4 = 100
        }

        binding.buttonTuruncu54.setOnClickListener() {
            gelenSayi4 = 1000
        }

        binding.buttonSari54.setOnClickListener() {
            gelenSayi4 = 10000
        }

        binding.buttonYesil54.setOnClickListener() {
            gelenSayi4 = 100000
        }

        binding.buttonMavi54.setOnClickListener() {
            gelenSayi4 = 1000000
        }

        binding.buttonMor54.setOnClickListener() {
            gelenSayi4 = 10000000
        }

        binding.buttonGri54.setOnClickListener() {
            gelenSayi4 = 100000000
        }

        binding.buttonBeyaz54.setOnClickListener() {
            gelenSayi4 = 1000000000
        }

        binding.buttonSiyah55.setOnClickListener() {
            gelenSayi5 = 0f
        }

        binding.buttonKahve55.setOnClickListener() {
            gelenSayi5 = 1f
        }

        binding.buttonKirmizi55.setOnClickListener() {
            gelenSayi5 = 2f
        }

        binding.buttonTuruncu55.setOnClickListener() {
            gelenSayi5 = 3f
        }

        binding.buttonSari55.setOnClickListener() {
            gelenSayi5 = 4f
        }

        binding.buttonYesil55.setOnClickListener() {
            gelenSayi5 = 0.5f
        }

        binding.buttonMavi55.setOnClickListener() {
            gelenSayi5 = 0.25f
        }

        binding.buttonMor55.setOnClickListener() {
            gelenSayi5 = 0.1f
        }

        binding.buttonGri55.setOnClickListener() {
            gelenSayi5 = 0.05f
        }

        binding.buttonBeyaz55.setOnClickListener() {
            gelenSayi5 = 0f
        }

        binding.buttonAltin5.setOnClickListener() {
            gelenSayi5 = 5f
        }

        binding.buttonGumus5.setOnClickListener() {
            gelenSayi5 = 10f
        }

        binding.buttonHesapla5.setOnClickListener(){
            if (gelenSayi1 != null && gelenSayi2 != null && gelenSayi3 != null && gelenSayi4 != null && gelenSayi5 != null) {

                val sonuc = (gelenSayi1!! + gelenSayi2!! + gelenSayi3!!) * gelenSayi4!!

                val sonucTamSayi = sonuc.toInt()

                val ToleransTamSayi = gelenSayi5!!.toInt()

                if(sonuc > sonucTamSayi){
                    if(gelenSayi5!! >= 1){
                        binding.textSonuc5bant.text = "$sonuc Ω ±%$ToleransTamSayi"
                    }else{
                        binding.textSonuc5bant.text = "$sonuc Ω ±%$gelenSayi5"
                    }
                }else{
                    if(gelenSayi5!! >=1 ){
                        binding.textSonuc5bant.text = "$sonucTamSayi Ω ±%$ToleransTamSayi"
                    }else{
                        binding.textSonuc5bant.text = "$sonucTamSayi Ω ±%$gelenSayi5"
                    }
                }

                if (sonuc >= 1000 || sonucTamSayi >= 1000) {
                    val cevir = sonuc / 1000.0
                    val cevirTamSayi = cevir.toInt()

                    if(cevir > cevirTamSayi){
                        if(gelenSayi5!! >= 1){
                            binding.textSonuc5bant.text = "$cevir KΩ ±%$ToleransTamSayi"
                        }else{
                            binding.textSonuc5bant.text = "$cevir KΩ ±%$gelenSayi5"
                        }
                    }else{
                        if(gelenSayi4!! >= 1){
                            binding.textSonuc5bant.text = "$cevirTamSayi KΩ ±%$ToleransTamSayi"
                        }else{
                            binding.textSonuc5bant.text = "$cevirTamSayi KΩ ±%$gelenSayi5"
                        }
                    }
                }

                if (sonuc >= 1000000 || sonucTamSayi >= 1000000) {
                    val cevir = sonuc / 1000000.0
                    val cevirTamSayi = cevir.toInt()

                    if(cevir > cevirTamSayi){
                        if(gelenSayi5!! >= 1){
                            binding.textSonuc5bant.text = "$cevir MΩ ±%$ToleransTamSayi"
                        }else{
                            binding.textSonuc5bant.text = "$cevir MΩ ±%$gelenSayi5"
                        }
                    }else{
                        if(gelenSayi5!! >=1){
                            binding.textSonuc5bant.text = "$cevirTamSayi MΩ ±%$ToleransTamSayi"
                        }else{
                            binding.textSonuc5bant.text = "$cevirTamSayi MΩ ±%$gelenSayi5"
                        }
                    }
                }
            }else if (gelenSayi1 == null && gelenSayi2 == null && gelenSayi3 == null && gelenSayi4 == null && gelenSayi5 == null){
                Toast.makeText(activity,"Lütfen sırayla beş renk seçimi yapınız", Toast.LENGTH_SHORT).show()
            }
            gelenSayi1 = 0
            gelenSayi2 = 0
            gelenSayi3 = 0
            gelenSayi4 = 0
            gelenSayi5 = 0f
        }
    }
}