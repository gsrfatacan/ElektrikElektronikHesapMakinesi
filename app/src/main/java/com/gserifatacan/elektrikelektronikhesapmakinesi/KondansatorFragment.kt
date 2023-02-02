package com.gserifatacan.elektrikelektronikhesapmakinesi

//noinspection SuspiciousImport
import android.R
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentKondansatorBinding

class KondansatorFragment : Fragment() {

    @SuppressLint("SetTextI18n")
    fun Hesapla() {
        if (sayi1 != null && sayi2 != null && sayi3 != null) {
            val sonuc = (sayi1!! + sayi2!!) * sayi3!!
            binding.textViewKondansatorSonuc.text = "$sonuc pF"

            if(sonuc >= 1000){
                val cevir = sonuc / 1000
                binding.textViewKondansatorSonuc.text = "$cevir nF"
            }

            if(sonuc >= 1000000){
                val cevir = sonuc / 1000000
                binding.textViewKondansatorSonuc.text = "$cevir µF"
            }

            if(sonuc >= 1000000000){
                val cevir = sonuc / 1000000000
                binding.textViewKondansatorSonuc.text = "$cevir mF"
            }
        }else{
            Toast.makeText(activity, "Lütfen Kondansatör üzerinde yer alan rakamları sırasıyla seçiniz.", Toast.LENGTH_SHORT).show()
        }
    }

    private var _binding: FragmentKondansatorBinding? = null
    private val binding get() = _binding!!

    private val birinciDeger = ArrayList<String>()
    private lateinit var veriAdaptoru1: ArrayAdapter<String>

    private val ikinciDeger = ArrayList<String>()
    private lateinit var veriAdaptoru2: ArrayAdapter<String>

    private val ucuncuDeger = ArrayList<String>()
    private lateinit var veriAdaptoru3: ArrayAdapter<String>

    var sayi1: Int? = null
    var sayi2: Int? = null
    var sayi3: Long? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentKondansatorBinding.inflate(inflater, container, false)
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

        birinciDeger.add("Seçiniz")
        birinciDeger.add("0")
        birinciDeger.add("1")
        birinciDeger.add("2")
        birinciDeger.add("3")
        birinciDeger.add("4")
        birinciDeger.add("5")
        birinciDeger.add("6")
        birinciDeger.add("7")
        birinciDeger.add("8")
        birinciDeger.add("9")

        veriAdaptoru1 = ArrayAdapter(requireActivity(), R.layout.simple_list_item_1, R.id.text1, birinciDeger)

        binding.spinner1.adapter = veriAdaptoru1

        binding.spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, indeks: Int, p3: Long) {

                val gelenVeri1 = birinciDeger[indeks]

                if (gelenVeri1 == "0") {
                    sayi1 = 0
                }

                if (gelenVeri1 == "1") {
                    sayi1 = 10
                }

                if (gelenVeri1 == "2") {
                    sayi1 = 20
                }

                if (gelenVeri1 == "3") {
                    sayi1 = 30
                }

                if (gelenVeri1 == "4") {
                    sayi1 = 40
                }

                if (gelenVeri1 == "5") {
                    sayi1 = 50
                }

                if (gelenVeri1 == "6") {
                    sayi1 = 60
                }

                if (gelenVeri1 == "7") {
                    sayi1 = 70
                }

                if (gelenVeri1 == "8") {
                    sayi1 = 80
                }

                if (gelenVeri1 == "9") {
                    sayi1 = 90
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        ikinciDeger.add("Seçiniz")
        ikinciDeger.add("0")
        ikinciDeger.add("1")
        ikinciDeger.add("2")
        ikinciDeger.add("3")
        ikinciDeger.add("4")
        ikinciDeger.add("5")
        ikinciDeger.add("6")
        ikinciDeger.add("7")
        ikinciDeger.add("8")
        ikinciDeger.add("9")

        veriAdaptoru2 = ArrayAdapter(requireActivity(), R.layout.simple_list_item_1, R.id.text1, ikinciDeger)

        binding.spinner2.adapter = veriAdaptoru2

        binding.spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, indeks: Int, p3: Long) {

                val gelenVeri2 = ikinciDeger[indeks]

                if (gelenVeri2 == "0") {
                    sayi2 = 0
                }

                if (gelenVeri2 == "1") {
                    sayi2 = 1
                }

                if (gelenVeri2 == "2") {
                    sayi2 = 2
                }

                if (gelenVeri2 == "3") {
                    sayi2 = 3
                }

                if (gelenVeri2 == "4") {
                    sayi2 = 4
                }

                if (gelenVeri2 == "5") {
                    sayi2 = 5
                }

                if (gelenVeri2 == "6") {
                    sayi2 = 6
                }

                if (gelenVeri2 == "7") {
                    sayi2 = 7
                }

                if (gelenVeri2 == "8") {
                    sayi2 = 8
                }

                if (gelenVeri2 == "9") {
                    sayi2 = 9
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        ucuncuDeger.add("Seçiniz")
        ucuncuDeger.add("0")
        ucuncuDeger.add("1")
        ucuncuDeger.add("2")
        ucuncuDeger.add("3")
        ucuncuDeger.add("4")
        ucuncuDeger.add("5")
        ucuncuDeger.add("6")
        ucuncuDeger.add("7")
        ucuncuDeger.add("8")
        ucuncuDeger.add("9")

        veriAdaptoru3 = ArrayAdapter(requireActivity(), R.layout.simple_list_item_1, R.id.text1, ucuncuDeger)

        binding.spinner3.adapter = veriAdaptoru3

        binding.spinner3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, indeks: Int, p3: Long) {

                val gelenVeri3 = ucuncuDeger[indeks]

                if (gelenVeri3 == "0") {
                    sayi3 = 1
                }

                if (gelenVeri3 == "1") {
                    sayi3 = 10
                }

                if (gelenVeri3 == "2") {
                    sayi3 = 100
                }

                if (gelenVeri3 == "3") {
                    sayi3 = 1000
                }

                if (gelenVeri3 == "4") {
                    sayi3 = 10000
                }

                if (gelenVeri3 == "5") {
                    sayi3 = 100000
                }

                if (gelenVeri3 == "6") {
                    sayi3 = 1000000
                }

                if (gelenVeri3 == "7") {
                    sayi3 = 10000000
                }

                if (gelenVeri3 == "8") {
                    sayi3 = 100000000
                }

                if (gelenVeri3 == "9") {
                    sayi3 = 1000000000
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        binding.buttonKondansatorHesapla.setOnClickListener() {
            Hesapla()
        }
    }
}