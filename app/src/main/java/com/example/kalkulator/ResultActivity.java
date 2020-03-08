package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {

    TextView hasil;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        hasil = findViewById(R.id.textview_result);
        back = findViewById(R.id.button_back);
        back.setOnClickListener(this);
        Bundle bundle = getIntent().getExtras();
        hasil.setText(bundle.getString("hasil"));
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
