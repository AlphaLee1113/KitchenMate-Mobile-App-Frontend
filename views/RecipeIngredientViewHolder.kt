package com.example.kitchenmate.views

import com.example.kitchenmate.R
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecipeIngredientViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val recycler_LinearLayout: LinearLayout = itemView.findViewById(R.id.recyclerLinearLayout)
    val ingredient_name: TextView = itemView.findViewById(R.id.item_recipe_ingredient)
    val ingredient_amount: TextView = itemView.findViewById(R.id.item_recipe_amount)
}