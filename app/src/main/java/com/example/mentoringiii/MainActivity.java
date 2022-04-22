package com.example.mentoringiii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
// comentário 1
// comentário 2
// comentário 3
// comentario 4

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("teste", "Olá teste");
        Log.d("teste", "Olá teste 2");
    }
}