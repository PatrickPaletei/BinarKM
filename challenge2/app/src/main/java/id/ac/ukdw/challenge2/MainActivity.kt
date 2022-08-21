package id.ac.ukdw.challenge2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val radiogroup = findViewById<RadioGroup>(R.id.radiogroup)
        val button = findViewById<Button>(R.id.button)
//        val switch = findViewById<Switch>(R.id.switch1)
//        val condition = null
        val total = findViewById<TextView>(R.id.total)

        button.setOnClickListener {
            //ambil radio & masukin ke text view
            val selectedOption: Int = radiogroup!!.checkedRadioButtonId
//            Toast.makeText(baseContext, selectedOption.toString(), Toast.LENGTH_SHORT).show()
            val selectedRadioButton = findViewById<RadioButton>(selectedOption)
            val buttonContainer:String = selectedRadioButton.text.toString()
//            Toast.makeText(baseContext, buttonContainer, Toast.LENGTH_SHORT).show()
            var hasil = countTip(buttonContainer)
//            if (switch.isChecked){
//                hasil?.toInt()
//            }
            total.setText(hasil.toString())
        }

    }
    fun countTip(selected:String): Double? {
        var totalSemua:Double? = null
        val cost = findViewById<EditText>(R.id.cost).getText().toString().toInt()
        if(selected == "Amazing (20%)"){
            var tip = cost * 0.2
            var total = tip + cost
            totalSemua = total
        }else if (selected == "Good (18%)"){
            var tip = cost * 0.18
            var total = tip + cost
            totalSemua = total
        }else{
            var tip = cost * 0.15
            var total = tip + cost
            totalSemua = total
        }
        return totalSemua
    }

}