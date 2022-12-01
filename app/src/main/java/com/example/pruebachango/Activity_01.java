package com.example.pruebachango;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Activity_01 extends AppCompatActivity {
    public EditText nombres;
    public EditText apellidos;
    public EditText dividendo;
    public EditText divisor;
    public EditText partEntera;
    public EditText residuo;
    public EditText numeroInvertido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01);
    }
}