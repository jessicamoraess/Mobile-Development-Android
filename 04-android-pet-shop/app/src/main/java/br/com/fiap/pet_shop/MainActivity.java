package br.com.fiap.pet_shop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdgRacas;
    RadioButton rdbBorder;
    RadioButton rdbPitBull;
    RadioButton rdbPastorAlemao;
    RadioButton rdbPastorCanadense;

    CheckBox chkFemea;
    CheckBox chkAdestrado;
    CheckBox chkVacina;

    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdgRacas = findViewById(R.id.rdgRacas);

        rdbBorder = findViewById(R.id.rdbBorder800);
        rdbPitBull = findViewById(R.id.rdbPitBull750);
        rdbPastorAlemao = findViewById(R.id.rdbPastorAlemao700);
        rdbPastorCanadense = findViewById(R.id.rdbPastorCanadense800);

        chkFemea = findViewById(R.id.chkFemea);
        chkAdestrado = findViewById(R.id.chkAdestrado);
        chkVacina = findViewById(R.id.chkVacina);

        txtResultado = findViewById(R.id.txtResultado);

    }

    public void calcular(View view) {

        double resultado = 0;

        int selecionado = rdgRacas.getCheckedRadioButtonId();

        switch (selecionado) {
            case R.id.rdbBorder800:
                resultado += 800;
                break;
            case R.id.rdbPitBull750:
                resultado += 750;
                break;
            case R.id.rdbPastorAlemao700:
                resultado += 700;
                break;
            case R.id.rdbPastorCanadense800:
                resultado += 800;
                break;
        }

        if (chkFemea.isChecked())
            resultado += 180;
        if (chkAdestrado.isChecked())
            resultado += 400;
        if (chkVacina.isChecked())
            resultado += 200;

        txtResultado.setText("R$ " + String.valueOf(resultado));
    }
}
