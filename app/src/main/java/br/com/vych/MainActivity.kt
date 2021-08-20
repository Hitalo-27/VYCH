package br.com.vych

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        wvNavegador.goBack()
        wvNavegador.webViewClient = WebViewClient()
        wvNavegador.settings.javaScriptEnabled = true


        btnPesquisar.setOnClickListener{
            wvNavegador.loadUrl(edtUrl.text.toString())
        }

        btnHome.setOnClickListener{
            wvNavegador.loadUrl("https://www.google.com.br")
        }
        btnVoltar.setOnClickListener{
            wvNavegador.goBack()
        }
        btnAvancar.setOnClickListener{
            wvNavegador.goForward()
        }
        btnReload.setOnClickListener{
            wvNavegador.reload()
        }

    }
}

