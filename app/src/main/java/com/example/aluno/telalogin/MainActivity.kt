package com.example.aluno.telalogin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            btnLogin.setOnClickListener{
                  var status: String=if(txtLogin.text.toString().equals("Administrador")
                      && txtSenha.text.toString().equals("123456")) "Usuário Correto!" else "Usuário ou senha incorretos!"
                Toast.makeText(this, status, Toast.LENGTH_SHORT).show()
        }
    }
}
