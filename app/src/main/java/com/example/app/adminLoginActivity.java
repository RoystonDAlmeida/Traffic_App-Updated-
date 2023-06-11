package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class adminLoginActivity extends AppCompatActivity {
    Button loginAdmin;
    EditText name,password;
    public  static final String UNAME="com.example.app.extra.NAME";
    public static final  String PASSWD="com.example.app.extra.passwd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        loginAdmin=findViewById(R.id.loginAdmin);
        name=findViewById(R.id.username);
        password=findViewById(R.id.Password);

        loginAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adminPageDierect();
            }
        });
    }

    public void adminPageDierect()
    {
        Intent intent=new Intent(this,AdminHomeActivity.class);
        intent.putExtra(UNAME, name.toString());
        intent.putExtra(PASSWD,password.toString());
        startActivity(intent);
    }
}