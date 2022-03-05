package com.example.areaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ladoUno, ladoDos, altura, base;
    TextView resultado;
    RadioButton rectangulo,triangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ladoUno= (EditText) findViewById(R.id.valorLadoUno);
        ladoDos= (EditText) findViewById(R.id.valorLadoDos);
        altura= (EditText) findViewById(R.id.valorAltura);
        base= (EditText) findViewById(R.id.valorbase);
        rectangulo = (RadioButton) findViewById(R.id.radioAreaRectangulo);
        triangulo = (RadioButton) findViewById(R.id.radioAreaTriangulo);
        resultado = (TextView) findViewById(R.id.resultado);
    }

    public void calcularAreas(View view){
        if (rectangulo.isChecked()){
            float sideOne = Float.parseFloat(ladoUno.getText().toString());
            float sideTwo = Float.parseFloat(ladoDos.getText().toString());
            resultado.setText(String.valueOf(sideOne*sideTwo));

        }
        if(triangulo.isChecked()){
            float alturaOne = Float.parseFloat(altura.getText().toString());
            float baseOne = Float.parseFloat(base.getText().toString());
            resultado.setText(String.valueOf(alturaOne*baseOne/2)); }
    }
}