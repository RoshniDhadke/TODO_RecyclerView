package com.example.recyclerview

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(private val todo:List<Tododata_class>): RecyclerView.Adapter<TodoAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title:TextView = itemView.findViewById(R.id.tv)
        val checkbox:CheckBox= itemView.findViewById(R.id.cb)
        val container:LinearLayout=itemView.findViewById(R.id.container)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.item_list,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val todo=todo[position]
        holder.title.text=todo.title
        holder.checkbox.isChecked=todo.checkbox
        var color="#CCCCCC"
        if(position%2==0){
            color="#EEEEEE"
        }
        holder.container.setBackgroundColor(Color.parseColor(color))

        }
    override fun getItemCount(): Int {
        return todo.size
    }
}