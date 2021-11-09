package com.olayg.nekos.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.olayg.nekos.databinding.ItemCategoryBinding
import com.olayg.nekos.model.Category
import com.olayg.nekos.util.layoutInflater

class CategoryAdapter(
    private val categories: List<Category>,
    private val categorySelected: (Category) -> Unit
) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ) = CategoryViewHolder.getInstance(parent)

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        categories[position].let { category ->
            holder.itemView.setOnClickListener { categorySelected(category) }
            holder.bind(category)
        }
    }

    override fun getItemCount() = categories.size

    class CategoryViewHolder(
        private val binding: ItemCategoryBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(category: Category) = with(binding) {
            tvTitle.text = category.title
        }

        companion object {
            fun getInstance(parent: ViewGroup) = ItemCategoryBinding.inflate(
                parent.layoutInflater, parent, false
            ).run { CategoryViewHolder(this) }
        }
    }
}
