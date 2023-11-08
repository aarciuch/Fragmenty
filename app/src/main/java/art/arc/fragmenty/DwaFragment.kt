package art.arc.fragmenty

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import art.arc.fragmenty.databinding.FragmentDwaBinding


class DwaFragment : Fragment() {

    private lateinit var binding2 : FragmentDwaBinding
    private val args: DwaFragmentArgs by navArgs<DwaFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding2 = DataBindingUtil.inflate(inflater, R.layout.fragment_dwa, container, false)
        binding2.odebraneDane.text = "${args.obiekkt.getString1()} : ${args.obiekkt.getString2()}"
        return binding2.root
    }

}