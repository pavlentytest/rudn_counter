package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    private int counter = 0;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
        tv = findViewById(R.id.textView);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button) {
            counter++;
            tv.setText(Integer.toString(counter)); // !!! Error !!!
        } else {
            // логика 2
        }

    }
}