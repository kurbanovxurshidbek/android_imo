package com.example.android_imo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_imo.R
import com.example.android_imo.adapter.ChatAdapter
import com.example.android_imo.model.Chat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))

        refreshAdapter(recyclerView, getAllChats())
    }

    fun refreshAdapter(recyclerView: RecyclerView, chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    fun getAllChats(): ArrayList<Chat> {
        val chats: ArrayList<Chat> = ArrayList()
        chats.add(Chat(R.drawable.im_user_1, "Kurbanov Xurshidbek", 1))
        chats.add(Chat(R.drawable.im_user_2, "Kurbanov Begzodbek", 0))
        chats.add(Chat(R.drawable.im_user_3, "Kurbanov Sherzodbek", 3))
        chats.add(Chat(R.drawable.im_user_1, "Kurbanov Xurshidbek", 1))
        chats.add(Chat(R.drawable.im_user_2, "Kurbanov Begzodbek", 0))
        chats.add(Chat(R.drawable.im_user_3, "Kurbanov Sherzodbek", 3))
        chats.add(Chat(R.drawable.im_user_1, "Kurbanov Xurshidbek", 1))
        chats.add(Chat(R.drawable.im_user_2, "Kurbanov Begzodbek", 0))
        chats.add(Chat(R.drawable.im_user_3, "Kurbanov Sherzodbek", 3))
        chats.add(Chat(R.drawable.im_user_1, "Kurbanov Xurshidbek", 1))
        chats.add(Chat(R.drawable.im_user_2, "Kurbanov Begzodbek", 0))
        chats.add(Chat(R.drawable.im_user_3, "Kurbanov Sherzodbek", 3))
        return chats
    }

}