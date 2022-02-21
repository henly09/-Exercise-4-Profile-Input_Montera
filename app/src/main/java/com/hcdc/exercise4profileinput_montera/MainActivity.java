package com.hcdc.exercise4profileinput_montera;

// Author: John Henly A. Montera
// BSIT-3rd Year
// CC106 [01527] - Application Development and Emerging Technologies
// [Exercise 4] Profile Input

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameinputmain;
    Spinner genderinputmain,statusinputmain;
    Button displaybutton;
    String honorifics = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        nameinputmain = findViewById(R.id.nameinput);
        genderinputmain = findViewById(R.id.genderinput);
        statusinputmain = findViewById(R.id.statusinput);
        displaybutton = findViewById(R.id.display);

        displaybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(genderinputmain.getSelectedItem().toString().equals("Male")){
                    honorifics = "Mr.";
                }
                if(genderinputmain.getSelectedItem().toString().equals("Others..")){
                    honorifics = "Mx.";
                }
                else if((genderinputmain.getSelectedItem().toString().equals("Female")) && (statusinputmain.getSelectedItem().toString().equals("Domestic Partnership"))){
                    honorifics = "Ms.";
                }
                else if((genderinputmain.getSelectedItem().toString().equals("Female")) && (statusinputmain.getSelectedItem().toString().equals("Single"))){
                    honorifics = "Miss.";
                }
                else if((genderinputmain.getSelectedItem().toString().equals("Female")) && (statusinputmain.getSelectedItem().toString().equals("Married"))){
                    honorifics = "Mrs.";
                }
                else if((genderinputmain.getSelectedItem().toString().equals("Female")) && (statusinputmain.getSelectedItem().toString().equals("Widowed"))){
                    honorifics = "Mrs.";
                }
                else if((genderinputmain.getSelectedItem().toString().equals("Female")) && (statusinputmain.getSelectedItem().toString().equals("Divorced"))){
                    honorifics = "Mrs.";
                }


                Toast.makeText(getBaseContext(), "Good Day! "+honorifics+nameinputmain.getText().toString()+".",Toast.LENGTH_LONG).show();

            }
        });


    }
}