package com.example.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Add_Edit_City extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_edit_city);
        EditText City=findViewById(R.id.City);
        Button CreateCity=findViewById(R.id.CreateCity);

    }

}
