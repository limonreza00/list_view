package com.coderscastle.listview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class Adapter (private val context: Context,private val usersList: List<Users>) :BaseAdapter() {
    override fun getCount(): Int = usersList.size

    override fun getItem(position: Int): Any {

        return usersList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("SetTextI18n")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view = convertView?:LayoutInflater.from(context).inflate(R.layout.list_item_layout,parent,false)

        val user = usersList[position]

        val tvName = view.findViewById<TextView>(R.id.nameTextView)
        val tvAge = view.findViewById<TextView>(R.id.ageTextView)
        val tvPhone = view.findViewById<TextView>(R.id.phoneNumberTextView)

        tvName.text=user.name
        tvAge.text="Age: ${user.age}"
        tvPhone.text= "Phone: ${user.phone}"

        return view
    }
}