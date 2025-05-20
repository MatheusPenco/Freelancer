import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.com.freelancer.R


class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val nameInput =  findViewById<EditText>(R.id.edt_nome)
        val emailInput = findViewById<EditText>(R.id.edt_email)
        val passwordInput = findViewById<EditText>(R.id.edt_senha)
        val loginButton = findViewById<Button>(R.id.bnt__cadastro)

        loginButton.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()


        }
    }
}
