package com.example.android_radiobutton_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButton;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.radiogroup);
    }

    public void onclickbutton(View view) {

        int selectId=radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(selectId);
        if (selectId==-1){
            Toast.makeText(MainActivity.this, "Noting Selected", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(MainActivity.this,radioButton.getText() , Toast.LENGTH_SHORT).show();
        }
    }
}