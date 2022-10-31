package id.ac.polbeng.sinta.intentexxpilicit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class add_text : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_text)
        var txtview : TextView = findViewById(R.id.tvHello)
        var etNama : TextView = findViewById(R.id.etNama)
        var etNim : TextView = findViewById(R.id.etNim)
        var etProdi : TextView = findViewById(R.id.etProdi)
        var btnSub : TextView = findViewById(R.id.btnSub)
        btnSub.setOnClickListener{
            val nama=etNama.text.toString()
            val nim=etNim.text.toString()
            val prodi=etProdi.text.toString()
            txtview.text="""Nama : $nama |Nim : $nim |Prodi : $prodi""".trimMargin()
        }
    }
}

