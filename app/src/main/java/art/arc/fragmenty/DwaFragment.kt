package art.arc.fragmenty

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import art.arc.fragmenty.databinding.FragmentDwaBinding


class DwaFragment : Fragment() {

    private lateinit var binding2 : FragmentDwaBinding
    private val args: DwaFragmentArgs by navArgs<DwaFragmentArgs>()
    private lateinit var lista: ArrayList<String>
    private lateinit var listaAdapter : DataAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        lista = ArrayList()
        binding2 = DataBindingUtil.inflate(inflater, R.layout.fragment_dwa, container, false)
        lista.add(args.obiekkt.getString1())
        lista.add(args.obiekkt.getString2())

        binding2.odebraneDane.text = "${args.obiekkt.getString1()} : ${args.obiekkt.getString2()}"
        val lista = DataAdapter(lista)
        binding2.wczytanieListyButton.setOnClickListener {
            binding2.recyclerList.adapter = lista

        }

        return binding2.root
    }
}