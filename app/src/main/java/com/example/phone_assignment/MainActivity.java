package com.example.phone_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Iphone iphone;
    Galaxy galaxy;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);

        iphone = new Iphone("iphone 11", 100, "hotmobile", "Ring Ring");
        galaxy = new Galaxy("s3", 88, "cellcom", "Trn Trn");
        //iphone.displayInfo();
        editText.setText(iphone.displayInfo());




    }
}