package com.example.app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button login,admin;
    EditText  ID,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar top_toolbar=findViewById(R.id.top_toolbar);
        //etSupportActionBar(top_toolbar);
        //Toolbar mid_toolbar=findViewById(R.id.mid_toolbar);
        //setSupportActionBar(mid_toolbar);
        login=findViewById(R.id.loginAdmin);
        admin=findViewById(R.id.admin);
        ID = findViewById(R.id.username);
        Password = findViewById(R.id.Password);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openDialog();
            }
        });

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adminPage();
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


    public void adminPage()
    {
        Intent i=new Intent(this,adminLoginActivity.class);
        startActivity(i);
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
/////write for public register to direct to(activity_user_register.xml)
////"Admin" and "Login" Buttons are different."Admin" button directs to activity_admin_home.xml
////"Login" button should direct to user options which is in activity_user_challan.xml(3 options)
////Create "publicregister" function that directs to activity_user_register.xml