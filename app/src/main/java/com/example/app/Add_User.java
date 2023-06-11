package com.example.app;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Add_User extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_user);
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//                openDialog();
//            }
//        });

    }}
//    public void openDialog(){
//        AlertDialog.Builder builder=new AlertDialog.Builder(this);
//        builder.setTitle("Alert");
//        builder.setMessage("Created Successfully");
//        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//            @Override
//            public void Submit(DialogInterface dialogInterface, int i) {
//                Intent secondActivity=new Intent(Add_User.this,Police_Details.class);
//                startActivity(secondActivity);
//            }
//        });
//        builder.create();
//        builder.show();
//    }
//}
//////STOPPED TILL BEFORE POLICE DETAILS VIEWING