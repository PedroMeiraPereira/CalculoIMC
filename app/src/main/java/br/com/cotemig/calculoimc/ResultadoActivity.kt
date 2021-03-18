package br.com.cotemig.calculoimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var imc = intent.getDoubleExtra("imc", 0.0)

        resultado.text = String.format(resources.getString(R.string.resultadoimc), imc)

        if(imc<17){
            situacao.text = resources.getString(R.string.imc1)
        } else if(imc<=18.49){
            situacao.text = resources.getString(R.string.imc2)
        } else if(imc<=24.99){
            situacao.text = resources.getString(R.string.imc3)
        } else if(imc<=29.99){
            situacao.text = resources.getString(R.string.imc4)
        } else if(imc<=34.99){
            situacao.text = resources.getString(R.string.imc5)
        } else if(imc<=39.99){
            situacao.text = resources.getString(R.string.imc6)
        } else{
            situacao.text = resources.getString(R.string.imc7)
        }

    }
}