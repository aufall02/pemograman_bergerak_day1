package com.aufal.praktikumday1;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inNama, inNIM, inAlamat;
    TextView viewNama, viewNIM, viewAlamat;
    Button btnTampil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inNama  = findViewById(R.id.inNama);
        inNIM  = findViewById(R.id.inNIM);
        inAlamat  = findViewById(R.id.inAlamat);
        btnTampil = findViewById(R.id.btnTampil);
        viewNama = findViewById(R.id.viewNama);
        viewNIM = findViewById(R.id.viewNIM);
        viewAlamat = findViewById(R.id.viewAlamat);


        btnTampil.setOnClickListener(v ->{
            String nama = inNama.getText().toString();
            String nim = inNIM.getText().toString();
            String alamat = inAlamat.getText().toString();
            viewNama.setText(nama);
            viewNIM.setText(nim);
            viewAlamat.setText(alamat);
        });


    }
}