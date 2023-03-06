package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText= findViewById(R.id.editText);
        Button button= findViewById(R.id.button);
        TextView textView= findViewById(R.id.textView1);
        TextView textView2= findViewById(R.id.textView2);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kilograms= editText.getText().toString();
                float kg= Float.parseFloat(kilograms);
                float grams= (float) (kg * 1000);
                textView.setText(""+grams);
            }
        });

    }
}