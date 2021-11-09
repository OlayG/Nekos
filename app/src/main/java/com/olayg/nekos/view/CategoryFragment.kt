package com.olayg.nekos.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.olayg.nekos.adapter.CategoryAdapter
import com.olayg.nekos.databinding.FragmentCategoryBinding
import com.olayg.nekos.model.Category
import com.olayg.nekos.util.logMe
import com.olayg.nekos.viewmodel.NekosViewModel

class CategoryFragment : Fragment() {

    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!
    private val nekosVM by activityViewModels<NekosViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentCategoryBinding.inflate(
        inflater, container, false
    ).also { _binding = it }.root


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeObservables()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun observeObservables() = with(nekosVM) {
        categories.observe(viewLifecycleOwner) { categories ->
            binding.rvCategories.adapter = CategoryAdapter(categories, ::categoryClicked)
        }
    }

    private fun categoryClicked(category: Category) = with(findNavController()) {
        category.toString().logMe()
        val action = CategoryFragmentDirections.goToImageFragment(category)
        navigate(action)
    }
}