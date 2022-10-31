package id.ac.polbeng.sinta.intentexxpilicit

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAddNumb : Button = findViewById(R.id.btn_addnumb)
        btnAddNumb.setOnClickListener(this)
        val btnAddText : Button = findViewById(R.id.btn_addtext)
        btnAddText.setOnClickListener(this)
        val btnCalc : Button = findViewById(R.id.btn_calc)
        btnCalc.setOnClickListener(this)

    }
    override fun onClick(v: View?){
        when (v?.id){
            R.id.btn_addnumb -> {
                val moveIntent = Intent(this@MainActivity, add_number::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_addtext -> {
                val moveIntent2 = Intent(this@MainActivity, add_text::class.java)
                startActivity(moveIntent2)
            }

            R.id.btn_calc -> {
                val moveIntent = Intent(this@MainActivity, calc::class.java)
                startActivity(moveIntent)
            }

        }
    }
}

