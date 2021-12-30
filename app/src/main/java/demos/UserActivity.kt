package demos

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        val button = findViewById<Button>(R.id.button2)

        button.setOnClickListener {
            finish()
        }
    }
}