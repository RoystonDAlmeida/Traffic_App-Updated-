package com.example.app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button login;
    EditText  ID,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar top_toolbar=findViewById(R.id.top_toolbar);
        //etSupportActionBar(top_toolbar);
        //Toolbar mid_toolbar=findViewById(R.id.mid_toolbar);
        //setSupportActionBar(mid_toolbar);
        login=findViewById(R.id.login);
        ID = findViewById(R.id.ID);
        Password = findViewById(R.id.Password);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                openDialog();
            }
        });

    }
    public void openDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Alert");
        builder.setMessage("Login Successful!!");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent secondActivity=new Intent(MainActivity.this,UserLogin.class);
                startActivity(secondActivity);
            }
        });
        builder.create();
        builder.show();
    }
}



//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.util.Log;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
////        Log.d("Rathan","this is log msg");
//    }
//}