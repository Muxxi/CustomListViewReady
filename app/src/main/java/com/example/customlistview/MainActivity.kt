package com.example.customlistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var listView : ListView
    private lateinit var arrayAdapter: AdapterLv
    private lateinit var data : ArrayList<AllData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data = ArrayList()

        listView = findViewById(R.id.listView)

        data.add(AllData(R.drawable.rating,"Rating",10))
        data.add(AllData(R.drawable.settings,"Settings",15))
        data.add(AllData(R.drawable.keyboard11,"Keyboard",32))

        arrayAdapter = AdapterLv(this,data)

        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { parent, view, position, id ->

            if(position == 0){
                Toast.makeText(this,"Rating Is Clicked",Toast.LENGTH_SHORT).show()
            }
            if(position == 1){
                Toast.makeText(this,"Settings Is Clicked",Toast.LENGTH_SHORT).show()
            }
            if(position == 2){
                Toast.makeText(this,"Keyboard Is Clicked",Toast.LENGTH_SHORT).show()
            }

        }

    }

}
