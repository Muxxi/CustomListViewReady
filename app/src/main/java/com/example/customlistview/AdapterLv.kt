package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.custom_list_row.view.*

class AdapterLv(var context: Context , var data : ArrayList<AllData>) : BaseAdapter() {

    lateinit var img : ImageView
    lateinit var name : TextView
    lateinit var age : TextView

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view = LayoutInflater.from(context).inflate(R.layout.custom_list_row,null,false)

        img = view.image
        name = view.name_tv
        age = view.age_tv

        img.setImageResource(data.get(position).img)
        name.text = data.get(position).name
        age.text = data.get(position).age.toString()

        return view

    }

    override fun getItem(position: Int): Any {
        return data.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.size
    }
}