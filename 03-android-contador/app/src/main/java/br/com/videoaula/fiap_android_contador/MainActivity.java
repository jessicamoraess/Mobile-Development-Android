package br.com.videoaula.fiap_android_contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtNumero;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumero.findViewById(R.id.txtNumero);

        contador = 0;
    }

    public void subtrair(View view) {
        contador--;
        contador = Integer.parseInt(txtNumero.getText().toString());
    }

    public void somar(View view) {
        contador++;
        contador = Integer.parseInt(txtNumero.getText().toString());
    }
}
