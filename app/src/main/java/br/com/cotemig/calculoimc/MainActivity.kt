package br.com.cotemig.calculoimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcular.setOnClickListener {
            calcularClick()
        }

    }

    fun calcularClick() {

        var alt = altura.text.toString().toDouble()
        var pes = peso.text.toString().toDouble()

        var imc = pes / (alt*alt)

        //Toast.makeText(this, "O IMC é " + imc, Toast.LENGTH_LONG).show()

        var intent = Intent(this, ResultadoActivity::class.java)
        intent.putExtra("imc",imc)
        startActivity(intent)

    }

}