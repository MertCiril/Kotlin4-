package com.mertciril.kotlin4_context

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //applicationContext => uygulamanın contexti
        //this ya da this@MainActivity => aktivitenin contexti
        //Toast
        Toast.makeText(this,"Hoş geldin!",Toast.LENGTH_SHORT).show()
    }
    fun showMassage(view: View){
        //Alert
        val alertMassage = AlertDialog.Builder(this)

        alertMassage.setTitle("Şifre Hatası")
        alertMassage.setMessage("Şifrenizi girmediniz, baştan denemek ister misiniz?")
        alertMassage.setPositiveButton("Evet",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this,"Evet'e tıklandı",Toast.LENGTH_LONG).show()
        })
        alertMassage.setNegativeButton("Hayır",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this,"Hayır'a tıklandı",Toast.LENGTH_LONG).show()
        })
        alertMassage.show()

    }
}