package com.example.androidbasicscourse

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

//главный экран приложения
class MainActivity : AppCompatActivity() { //объявление главного экрана наследуя функционал аппКомпатАктивити
    //метод вызывается при создании активности
    // bundle -
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //переопределение метода который вызывается при создании экрана
        enableEdgeToEdge()
        setContentView(R.layout.activity_main) //использовать лейаут из мейн активити
    }
}