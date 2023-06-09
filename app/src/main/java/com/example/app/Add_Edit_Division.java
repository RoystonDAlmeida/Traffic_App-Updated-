package com.example.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Add_Edit_Division extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_edit_division);
        EditText DeptName=findViewById(R.id.DeptName);
        Button Create_Department=findViewById(R.id.Create_Department);
}
