package com.kennethmwenda.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.lv_List1)
        var list = mutableListOf<Model>()
        list.add(Model("Facebook","Facebook description",R.drawable.facebook))
        list.add(Model("YouTube","YouTube description",R.drawable.utube))
        list.add(Model("Instagram","Instagram description",R.drawable.insta))
        list.add(Model("LinkedIn","LinkedIn description",R.drawable.linkedin))
        list.add(Model("Pinterest","Pinterest description",R.drawable.pinterest))
        list.add(Model("Skype","Skype description",R.drawable.skype))
        list.add(Model("Behance","Behance description",R.drawable.behance))
        list.add(Model("Blogger","Blogger description",R.drawable.blogger))
        list.add(Model("Flickr","Flickr description",R.drawable.flickr))

        listView.adapter = Adapter(this,R.layout.row,list)

        listView.setOnItemClickListener { parent:AdapterView< *>, view:View, position:Int, id:Long ->
            if (position==0){
                Toast.makeText(this, "Clicked on Facebook", Toast.LENGTH_LONG).show()
            }
            if (position==1){
            Toast.makeText(this, "Clicked on YouTube", Toast.LENGTH_LONG).show()
            }
            if (position==2){
                Toast.makeText(this, "Clicked on Instagram", Toast.LENGTH_LONG).show()
            }
            if (position==3){
                Toast.makeText(this, "Clicked on LinkedIn", Toast.LENGTH_LONG).show()
            }
            if (position==4){
                Toast.makeText(this, "Clicked on Pinterest", Toast.LENGTH_LONG).show()
            }
            if (position==5){
                Toast.makeText(this, "Clicked on Skype", Toast.LENGTH_LONG).show()
            }
            if (position==6){
                Toast.makeText(this, "Clicked on Behance", Toast.LENGTH_LONG).show()
            }
            if (position==7){
                Toast.makeText(this, "Clicked on Blogger", Toast.LENGTH_LONG).show()
            }
            if (position==8){
                Toast.makeText(this, "Clicked on Flickr", Toast.LENGTH_LONG).show()
            }
        }

    }
}