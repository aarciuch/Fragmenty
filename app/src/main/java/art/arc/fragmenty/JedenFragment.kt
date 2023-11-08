package art.arc.fragmenty

import android.os.Binder
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import art.arc.fragmenty.databinding.FragmentJedenBinding

class JedenFragment : Fragment() {

    lateinit var binding: FragmentJedenBinding
    lateinit var daneFragmentu : DaneProgramu

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        daneFragmentu = DaneProgramu()
        daneFragmentu.setString1("Ala")
        daneFragmentu.setString2("Ola")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_jeden, container, false)
        binding.go2Fragment2Button.setOnClickListener {
            val action = JedenFragmentDirections.actionJedenFragmentToDwaFragment(daneFragmentu)
            findNavController().navigate(action)
        }
        binding.daneProgramu = daneFragmentu
        binding.s2EditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                daneFragmentu.setStringsLengths()
                binding.invalidateAll()
            }
        })
        binding.s1EditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                daneFragmentu.setStringsLengths()
                binding.invalidateAll()
            }
        })
        return binding.root
    }

}