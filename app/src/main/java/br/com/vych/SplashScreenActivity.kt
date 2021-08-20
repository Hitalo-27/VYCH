package br.com.vych

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        //Classe que pausa o processamento
        Handler().postDelayed({
            //ação para mudar de tela
            val intent = Intent(this,MainActivity::class.java)
            //executando a intent
            startActivity(intent)
        },5000)
    }
}
