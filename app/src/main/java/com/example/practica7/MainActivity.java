package com.example.practica7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.practica7.models.Celcius;
import com.example.practica7.models.Kelvin;
import com.example.practica7.models.Fahrenheit;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextValor;
    private Button buttonConvertir;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextValor = findViewById(R.id.editTextValor);
        buttonConvertir = findViewById(R.id.buttonConvertir);
        textViewResultado = findViewById(R.id.textViewResultado);

        buttonConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valorStr = editTextValor.getText().toString();
                if (!valorStr.isEmpty()) {
                    double valor = Double.parseDouble(valorStr);


                    Celcius celsius = new Celcius(valor);
                    Kelvin kelvin = new Kelvin(valor);
                    Fahrenheit fahrenheit = new Fahrenheit(valor);

                    String resultado = "Celsius: " + celsius.convertirACelsius() + "\n"
                            + "Kelvin: " + kelvin.convertirAKelvin() + "\n"
                            + "Fahrenheit: " + fahrenheit.convertirAFahrenheit();

                    textViewResultado.setText(resultado);
                }
            }
        });
    }
}
