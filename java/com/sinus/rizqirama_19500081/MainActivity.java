package com.sinus.rizqirama_19500081;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView; Button button; EditText editText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView_081);
        button = (Button) findViewById(R.id.button_081);
        editText = (EditText) findViewById(R.id.editText_081);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if  (v.getId() == button.getId()) {
            int angka = Integer.parseInt(editText.getText().toString());
            if (angka%2==0) {
                textView.setText("Bilangan Genap");
            } else {
                textView.setText("Bilangan Ganjil");
            }
        }
    }
}