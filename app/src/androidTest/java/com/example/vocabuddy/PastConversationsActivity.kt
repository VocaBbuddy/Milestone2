package com.example.vocabuddy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PastConversationsActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ConversationAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_past_conversations)

        // Sample conversation data
        val conversationList = listOf(
            "Hello! How are you?",
            "Where is the library?",
            "Can you help me with this?",
            "What time is the meeting?",
            "Thank you for your help!"
        )

        // Set up RecyclerView
        recyclerView = findViewById(R.id.recyclerViewConversations)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ConversationAdapter(conversationList)
        recyclerView.adapter = adapter
    }
}
