package com.example.practica7;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.practica7.Models.Celcius;
import com.example.practica7.Models.Fahreinheit;
import com.example.practica7.Models.Kelvin;

public class MainActivity extends AppCompatActivity {

    private EditText editTextTemperature;
    private Button buttonConvert;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTemperature = findViewById(R.id.editTextTemperature);
        buttonConvert = findViewById(R.id.buttonConvert);
        textViewResult = findViewById(R.id.textViewResult);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertTemperature();
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void convertTemperature() {
        try {
            double inputValue = Double.parseDouble(editTextTemperature.getText().toString());

            Celcius celcius = new Celcius();
            celcius.setValor(inputValue);

            Fahreinheit fahrenheit = new Fahreinheit();
            fahrenheit.setValor(inputValue);

            Kelvin kelvin = new Kelvin();
            kelvin.setValor(inputValue);

            fahrenheit = fahrenheit.parse(celcius);
            kelvin = kelvin.parse(celcius);

            textViewResult.setText("Celsius a Fahrenheit: " + fahrenheit.getValor() +
                    "\nCelsius a Kelvin: " + kelvin.getValor());
        } catch (NumberFormatException e) {
            textViewResult.setText("Entrada no válida");
        }
    }
}
