package com.example.pruebachango;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Activity_02 extends AppCompatActivity {

    public EditText nombres;
    public EditText apellidos;
    public EditText dividendo;
    public EditText divisor;
    public EditText numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_02);
    }
}