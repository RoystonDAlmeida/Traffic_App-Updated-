package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminHomeActivity extends AppCompatActivity {
    Button allTrafficSquad,updateUser,addEditDivision,addEditCity,addEditStreet,addUser,category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);


        allTrafficSquad=findViewById(R.id.AllTrafficSquad);
        updateUser=findViewById(R.id.UpdateUser);
        addEditDivision=findViewById(R.id.Add_EditDivision);
        addEditCity=findViewById(R.id.Add_EditCity);
        addEditStreet=findViewById(R.id.Add_EditStreet);
        addUser=findViewById(R.id.AddUser);
        category=findViewById(R.id.Category);




        allTrafficSquad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                allTrafficSquadActivityFunction();
            }
        });


        updateUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateUserActivityFunction();
            }
        });




        addEditDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addEditDivisionActivityFunction();
            }
        });





        addEditCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addEditCityActivityFunction();
            }
        });



        addEditStreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addEditStreetActivityFunction();
            }
        });




        addUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUserActivityFunction();
            }
        });





        category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                categoryActivityFunction();
            }
        });

    }



    public void allTrafficSquadActivityFunction()
    {
        Intent intent=new Intent(this,All_Traffic_Squad.class);
        startActivity(intent);
    }

    public void updateUserActivityFunction()
    {
        Intent intent=new Intent(this,Update_User.class);
        startActivity(intent);
    }

    public void addEditDivisionActivityFunction()
    {
        Intent intent=new Intent(this,Add_Edit_Division.class);
        startActivity(intent);
    }

    public void addEditCityActivityFunction()
    {
        Intent intent=new Intent(this,Add_Edit_City.class);
        startActivity(intent);
    }

    public void addEditStreetActivityFunction()
    {
        Intent intent=new Intent(this,Add_Edit_Street.class);
        startActivity(intent);
    }

    public void addUserActivityFunction()
    {
        Intent intent=new Intent(this,Add_User.class);
        startActivity(intent);
    }

    public void categoryActivityFunction()
    {
        Intent intent=new Intent(this,Category.class);
        startActivity(intent);
    }
}