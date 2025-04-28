package ru.fefu.activitiesfefu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.fefu.activitiesfefu.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Обработчик кнопки "назад"
        binding.btnBack.setOnClickListener {
            // Возвращаемся на предыдущую активность (или WelcomeActivity)
            finish() // Завершаем текущую активность и возвращаемся на предыдущую
        }
    }

}
