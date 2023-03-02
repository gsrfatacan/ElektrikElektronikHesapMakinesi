package com.gserifatacan.elektrikelektronikhesapmakinesi

//noinspection SuspiciousImport
import android.R
import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentLedOnDirencBinding

class LedOnDirenc : Fragment() {

    private var _binding: FragmentLedOnDirencBinding? = null
    private val binding get() = _binding!!

    private val ledRenkleri = ArrayList<String>()

    private lateinit var veriAdaptoru: ArrayAdapter<String>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLedOnDirencBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ledRenkleri.add("Seçiniz")
        ledRenkleri.add("Kırmızı")
        ledRenkleri.add("Turuncu")
        ledRenkleri.add("Sarı")
        ledRenkleri.add("Yeşil")
        ledRenkleri.add("Mavi")
        ledRenkleri.add("Beyaz")

        veriAdaptoru = ArrayAdapter(requireActivity(), R.layout.simple_list_item_1, R.id.text1, ledRenkleri)

        binding.spinner.adapter = veriAdaptoru

        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            @SuppressLint("SetTextI18n")
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, indeks: Int, p3: Long) {

                val gelenVeri = ledRenkleri[indeks]

                if (gelenVeri == "Seçiniz"){
                    binding.imageViewLed.setColorFilter(ContextCompat.getColor(requireContext(), com.gserifatacan.elektrikelektronikhesapmakinesi.R.color.yazi), android.graphics.PorterDuff.Mode.SRC_IN);
                }

                if (gelenVeri == "Kırmızı"){
                    (binding.spinner.getChildAt(0) as TextView).setBackgroundColor(ContextCompat.getColor(requireContext(), com.gserifatacan.elektrikelektronikhesapmakinesi.R.color.butonkirmizi))

                    (binding.spinner.getChildAt(0) as TextView).setTextColor(Color.WHITE)

                    binding.imageViewLed.setColorFilter(ContextCompat.getColor(requireContext(), com.gserifatacan.elektrikelektronikhesapmakinesi.R.color.butonkirmizi), android.graphics.PorterDuff.Mode.SRC_IN);
                }

                if (gelenVeri == "Turuncu"){
                    (binding.spinner.getChildAt(0) as TextView).setBackgroundColor(ContextCompat.getColor(requireContext(), com.gserifatacan.elektrikelektronikhesapmakinesi.R.color.butonturuncu))

                    (binding.spinner.getChildAt(0) as TextView).setTextColor(Color.BLACK)

                    binding.imageViewLed.setColorFilter(ContextCompat.getColor(requireContext(), com.gserifatacan.elektrikelektronikhesapmakinesi.R.color.butonturuncu), android.graphics.PorterDuff.Mode.SRC_IN);

                }

                if (gelenVeri == "Sarı"){
                    (binding.spinner.getChildAt(0) as TextView).setBackgroundColor(ContextCompat.getColor(requireContext(), com.gserifatacan.elektrikelektronikhesapmakinesi.R.color.butonsari))

                    (binding.spinner.getChildAt(0) as TextView).setTextColor(Color.BLACK)

                    binding.imageViewLed.setColorFilter(ContextCompat.getColor(requireContext(), com.gserifatacan.elektrikelektronikhesapmakinesi.R.color.butonsari), android.graphics.PorterDuff.Mode.SRC_IN);

                }

                if (gelenVeri == "Yeşil"){
                    (binding.spinner.getChildAt(0) as TextView).setBackgroundColor(ContextCompat.getColor(requireContext(), com.gserifatacan.elektrikelektronikhesapmakinesi.R.color.butonyesil))

                    (binding.spinner.getChildAt(0) as TextView).setTextColor(Color.WHITE)

                    binding.imageViewLed.setColorFilter(ContextCompat.getColor(requireContext(), com.gserifatacan.elektrikelektronikhesapmakinesi.R.color.butonyesil), android.graphics.PorterDuff.Mode.SRC_IN);

                }

                if (gelenVeri == "Mavi"){
                    (binding.spinner.getChildAt(0) as TextView).setBackgroundColor(ContextCompat.getColor(requireContext(), com.gserifatacan.elektrikelektronikhesapmakinesi.R.color.butonmavi))

                    (binding.spinner.getChildAt(0) as TextView).setTextColor(Color.WHITE)

                    binding.imageViewLed.setColorFilter(ContextCompat.getColor(requireContext(), com.gserifatacan.elektrikelektronikhesapmakinesi.R.color.butonmavi), android.graphics.PorterDuff.Mode.SRC_IN);

                }

                if (gelenVeri == "Beyaz"){
                    (binding.spinner.getChildAt(0) as TextView).setBackgroundColor(Color.WHITE)

                    (binding.spinner.getChildAt(0) as TextView).setTextColor(Color.BLACK)

                    binding.imageViewLed.setColorFilter(ContextCompat.getColor(requireContext(), com.gserifatacan.elektrikelektronikhesapmakinesi.R.color.butongumus), android.graphics.PorterDuff.Mode.SRC_IN);

                }

                binding.buttonLEDHesapla.setOnClickListener() {

                    val girisGerilim = binding.editTextGirisGerilimi.text.toString().toFloatOrNull()

                    hideKeyboard()

                    if (gelenVeri == "Seçiniz") {

                        Toast.makeText(activity, "Lütfen LED rengini seçiniz", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if (gelenVeri == "Kırmızı") {

                        val akim = 0.015
                        val gerilim = 1.8

                        if (girisGerilim != null) {
                            val sonuc = (girisGerilim - (gerilim)) / akim
                            val sonucTamsayi = sonuc.toInt()

                            binding.textVievSonuc.text = "$sonucTamsayi Ω"
                            binding.textViewAciklama.text = "ve üzerinde en yakın direnç değerini kullanabilirsiniz"

                        } else {
                            Toast.makeText(
                                activity,
                                "Lütfen kaynak gerilimini giriniz",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }

                    if (gelenVeri == "Turuncu") {
                        val akim = 0.015
                        val gerilim = 1.8

                        if (girisGerilim != null) {
                            val sonuc = (girisGerilim - (gerilim)) / akim
                            val sonucTamsayi = sonuc.toInt()

                            binding.textVievSonuc.text = "$sonucTamsayi Ω"
                            binding.textViewAciklama.text = "ve üzerinde en yakın direnç değerini kullanabilirsiniz"

                        } else {
                            Toast.makeText(
                                activity,
                                "Lütfen kaynak gerilimini giriniz",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }

                    if (gelenVeri == "Sarı") {
                        val akim = 0.015
                        val gerilim = 2.1

                        if (girisGerilim != null) {
                            val sonuc = (girisGerilim - (gerilim)) / akim
                            val sonucTamsayi = sonuc.toInt()

                            binding.textVievSonuc.text = "$sonucTamsayi Ω"
                            binding.textViewAciklama.text = "ve üzerinde en yakın direnç değerini kullanabilirsiniz"

                        } else {
                            Toast.makeText(
                                activity,
                                "Lütfen kaynak gerilimini giriniz",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }

                    if (gelenVeri == "Yeşil") {
                        val akim = 0.015
                        val gerilim = 2.2

                        if (girisGerilim != null) {
                            val sonuc = (girisGerilim - (gerilim)) / akim
                            val sonucTamsayi = sonuc.toInt()

                            binding.textVievSonuc.text = "$sonucTamsayi Ω"
                            binding.textViewAciklama.text = "ve üzerinde en yakın direnç değerini kullanabilirsiniz"

                        } else {
                            Toast.makeText(
                                activity,
                                "Lütfen kaynak gerilimini giriniz",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }

                    if (gelenVeri == "Mavi") {
                        val akim = 0.03
                        val gerilim = 3.3

                        if (girisGerilim != null) {
                            val sonuc = (girisGerilim - (gerilim)) / akim
                            val sonucTamsayi = sonuc.toInt()

                            binding.textVievSonuc.text = "$sonucTamsayi Ω"
                            binding.textViewAciklama.text = "ve üzerinde en yakın direnç değerini kullanabilirsiniz"

                        } else {
                            Toast.makeText(
                                activity,
                                "Lütfen kaynak gerilimini giriniz",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }

                    if (gelenVeri == "Beyaz") {
                        val akim = 0.03
                        val gerilim = 3.3

                        if (girisGerilim != null) {
                            val sonuc = (girisGerilim - (gerilim)) / akim
                            val sonucTamsayi = sonuc.toInt()

                            binding.textVievSonuc.text = "$sonucTamsayi Ω"
                            binding.textViewAciklama.text = "ve üzerinde en yakın direnç değerini kullanabilirsiniz"

                        } else {
                            Toast.makeText(
                                activity,
                                "Lütfen kaynak gerilimini giriniz",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }
}