package com.com.famoussaying

import android.annotation.SuppressLint
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuotesPagerAdapter(
        private val quotes: List<Quote>,
        private val isNameRevealed: Boolean
): RecyclerView.Adapter<QuotesPagerAdapter.QuoteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            QuoteViewHolder(
                    LayoutInflater.from(parent.context)
                            .inflate(R.layout.item_guote, parent, false)
            )

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {
        val actualPosition = position % quotes.size
        holder.bind(quotes[actualPosition], isNameRevealed)
    }

    override fun getItemCount() = Int.MAX_VALUE

    class QuoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val quoteTextView: TextView = itemView.findViewById(R.id.quoteTextVIew)
        private val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)

        @SuppressLint("SetTextI18n")
        fun bind(quote: Quote, isNameRevealed: Boolean) {
            quoteTextView.text = "\"${quote.quote}\""

            if(isNameRevealed) {
                nameTextView.text = "- ${quote.name}"
                nameTextView.visibility = View.VISIBLE
            }else {
                nameTextView.visibility = View.GONE
            }
        }
    }
}

