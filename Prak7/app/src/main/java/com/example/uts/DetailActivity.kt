package com.example.uts

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val igksb = findViewById<Button>(R.id.button)
        igksb.setOnClickListener {
            val url = "https://www.instagram.com/ksb_ulm/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val gambar = intent.getParcelableExtra<KsbClass>(MainActivity.INTENT_PARCELABLE)

        val ksbimg = findViewById<ImageView>(R.id.image)
        val ksbname = findViewById<TextView>(R.id.tv_name)
        val ksbdate = findViewById<TextView>(R.id.tv_date)
        val ksbauthor = findViewById<TextView>(R.id.tv_author)
        val ksbdesc = findViewById<TextView>(R.id.tv_description)

        ksbimg.setImageResource(gambar?.ksbimg!!)
        ksbname.text = gambar.ksbname
        ksbdate.text = gambar.ksbdate
        ksbauthor.text = gambar.ksbauthor
        ksbdesc.text = gambar.ksbdesc
    }

    override fun onSupportNavigateUp(): Boolean {

        onBackPressed()
        return true
    }
}