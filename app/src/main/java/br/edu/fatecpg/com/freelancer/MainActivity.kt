package br.edu.fatecpg.com.freelancer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val bntFree = findViewById<Button>(R.id.bnt_free)
        val bntUsu = findViewById<Button>(R.id.bnt_uso)
        val bntCadastrese = findViewById<Button>(R.id.bnt_cadastrese)

        bntFree.setOnClickListener {
            val loginFreeIntent = Intent(this, LoginFree::class.java)
            startActivity(loginFreeIntent)
        }
        bntUsu.setOnClickListener {
            val loginUsuIntent = Intent(this, LoginUsu::class.java)
            startActivity(loginUsuIntent)
        }
        bntCadastrese.setOnClickListener {
            val cadastroIntent = Intent(this, Cadastro::class.java)
            startActivity(cadastroIntent)
        }
    }
}