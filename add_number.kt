package id.ac.polbeng.sinta.intentexxpilicit


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class add_number : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_number)
        var tvCounter : TextView = findViewById(R.id.tvCounter)
        var btnCount : Button = findViewById(R.id.btnAddNumber)

        btnCount.setOnClickListener{
            val currVal = tvCounter.text.toString().toInt()
            val nextVal = currVal + 1
            tvCounter.text = nextVal.toString()
            if (nextVal >= 30) {
                tvCounter.text = "0"
            }
        }
    }
}

