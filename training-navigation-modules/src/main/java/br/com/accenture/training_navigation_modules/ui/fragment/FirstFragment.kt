package br.com.accenture.training_navigation_modules.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.com.accenture.training_navigation_modules.databinding.FragmentFirstBinding
import br.com.accenture.training_navigation_modules.models.User

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textViewFirst.setOnClickListener {
            val action = FirstFragmentDirections.fromFirstFragmentToSecondFragment(
                User(name = "Endryl Fiorotti", age = 19)
            )
            findNavController().navigate(action)
        }
    }
}