package com.example.ntw_sarbajeet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNumber;
    TextView tvWords;
    Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber= findViewById(R.id.etNumber);
        tvWords= findViewById(R.id.tvWords);
        btnConvert= findViewById(R.id.btnConvert);


        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int num;
                num= Integer.parseInt(etNumber.getText().toString());

                NumbertoWords numbertoWords= new NumbertoWords(num);
                tvWords.setText(numbertoWords.Words());

            }
        });
    }
}
