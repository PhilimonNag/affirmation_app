package com.philimonnag.affirmation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.philimonnag.affirmation.adapter.ItemAdapter
import com.philimonnag.affirmation.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDatasource=Datasource().loadAffirmations()
        val recyclerView=findViewById<RecyclerView>(R.id.recycle_view)
        recyclerView.adapter=ItemAdapter(this,myDatasource)
        recyclerView.setHasFixedSize(true)
    }
}