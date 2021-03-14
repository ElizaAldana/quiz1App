package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mainBtn;
    private TextView strNombre, intId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainBtn = findViewById(R.id.mainBtn);
        strNombre = findViewById(R.id.strNombre);
        intId = findViewById(R.id.ptos);

        //Para el sharepreferences
        String nombre = getSharedPreferences("user", MODE_PRIVATE).getString("uname", "NO_USER");
        strNombre.setText(nombre);

        mainBtn.setOnClickListener(this);

    }


    public void onClick(View v) {
        Intent a = new Intent(this, Registro.class);
        startActivity(a);
    }
}