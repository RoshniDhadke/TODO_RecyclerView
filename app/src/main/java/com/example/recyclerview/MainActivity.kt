package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rv:RecyclerView
    lateinit var ed:EditText
    lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv=findViewById(R.id.rv)
        ed=findViewById(R.id.editText)
        button=findViewById(R.id.button)
        val todoObject= mutableListOf<Tododata_class>()
       todoObject.add(Tododata_class("Android",true))
       todoObject.add(Tododata_class("Python",false))
       todoObject.add(Tododata_class("JavaScript",true))
       todoObject.add(Tododata_class("ReactNative",false))
       todoObject.add(Tododata_class("Kotlin",true))
       todoObject.add(Tododata_class("Asp.Net",true))
       todoObject.add(Tododata_class("MongoDB",false))
       todoObject.add(Tododata_class("java",false))
       todoObject.add(Tododata_class("Flutter",true))
       todoObject.add(Tododata_class("Swift",false))
       todoObject.add(Tododata_class("Ios",true))
       todoObject.add(Tododata_class("Ruby",true))
       todoObject.add(Tododata_class("C",false))
       todoObject.add(Tododata_class("Dart",true))
        rv.adapter=TodoAdapter(todoObject)
        rv.layoutManager=LinearLayoutManager(this)
        button.setOnClickListener {
            val input=ed.text.toString()
            todoObject.add(Tododata_class(input,false))
            TodoAdapter(todoObject).notifyItemInserted(todoObject.size-1)
        }
    }
}