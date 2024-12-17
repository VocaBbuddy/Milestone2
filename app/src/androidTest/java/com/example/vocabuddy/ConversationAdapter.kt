package com.example.vocabuddy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ConversationAdapter(private val conversationList: List<String>) :
    RecyclerView.Adapter<ConversationAdapter.ConversationViewHolder>() {

    // ViewHolder class for each item in the RecyclerView
    class ConversationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.textViewConversation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConversationViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_conversation, parent, false)
        return ConversationViewHolder(view)
    }

    override fun onBindViewHolder(holder: ConversationViewHolder, position: Int) {
        holder.textView.text = conversationList[position]
    }

    override fun getItemCount(): Int = conversationList.size
}
