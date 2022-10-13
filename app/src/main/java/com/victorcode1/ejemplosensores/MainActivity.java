package com.victorcode1.ejemplosensores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.liasta_de_sensores);
        textView = (TextView) findViewById(R.id.text_codigo);

        textView.setText(new ListandoSensoresJava(this).getCodigo());

        listView.setAdapter(new ListandoSensoresJava(this).listaSensores());





    }
}