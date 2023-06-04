package com.example.app;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class UserLogin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_login);
        Button AllTrafficSquad=findViewById(R.id.AllTrafficSquad);
        Button UpdateUser=findViewById(R.id.UpdateUser);
        Button Add_EditDivision=findViewById(R.id.Add_EditDivision;
        Button Add_EditCity=findViewById(R.id.Add_EditCity);
        Button Add_EditStreet=findViewById(R.id.Add_EditStreet);
        Button AddUser=findViewById(R.id.AddUser);
        Button Category=findViewById(R.id.Category;
        @Override
        public void onClick1(DialogInterface dialogInterface, int i) {
            Intent secondActivity=new Intent(UserLogin.this,All_Traffic_Squad.class);
            startActivity(secondActivity);
        }
        @Override
        public void onClick2(DialogInterface dialogInterface, int i) {
            Intent secondActivity=new Intent(UserLogin.this,Update_User.class);
            startActivity(secondActivity);
        }
        @Override
        public void onClick3(DialogInterface dialogInterface, int i) {
            Intent secondActivity=new Intent(UserLogin.this,Add_Edit_Division.class);
            startActivity(secondActivity);
        }
        @Override
        public void onClick4(DialogInterface dialogInterface, int i) {
            Intent secondActivity=new Intent(UserLogin.this,Add_Edit_City.class);
            startActivity(secondActivity);
        }
        @Override
        public void onClick5(DialogInterface dialogInterface, int i) {
            Intent secondActivity=new Intent(UserLogin.this,Add_Edit_Street.class);
            startActivity(secondActivity);
        }
        @Override
        public void onClick6(DialogInterface dialogInterface, int i) {
            Intent secondActivity=new Intent(UserLogin.this,Add_User.class);
            startActivity(secondActivity);
        }
        @Override
        public void onClick7(DialogInterface dialogInterface, int i) {
            Intent secondActivity=new Intent(UserLogin.this,Category.class);
            startActivity(secondActivity);
        }

    }
}
