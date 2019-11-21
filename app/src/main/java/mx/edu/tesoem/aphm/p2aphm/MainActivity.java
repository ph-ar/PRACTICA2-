package mx.edu.tesoem.aphm.p2aphm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton isc, itics, ambiental, gastro;
    CheckBox casa, escuela, trabajo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isc = (RadioButton) findViewById(R.id.radioButton);
        itics =(RadioButton) findViewById(R.id.radioButton2);
        ambiental = (RadioButton) findViewById(R.id.radioButton3);
        gastro = (RadioButton) findViewById(R.id.radioButton4);

    }
    public void  seleccion (View view ){
        if(isc.isChecked()) Toast.makeText(this,"Ingenieria en Sistemas Computacionales", Toast.LENGTH_SHORT).show();
        if(itics.isChecked()) Toast.makeText(this,"Ingenieria en Tecnologias de la Informacion y Comunicacion", Toast.LENGTH_SHORT).show();
        if(ambiental.isChecked()) Toast.makeText(this,"Ingenieria Ambiental", Toast.LENGTH_SHORT).show();
        if(gastro.isChecked()) Toast.makeText(this,"Licenciatura en Gastronimia", Toast.LENGTH_SHORT).show();
        if(casa.isChecked()) Toast.makeText(this,"Seleccionaste Casa", Toast.LENGTH_SHORT).show();
        if(escuela.isChecked()) Toast.makeText(this,"Seleccionaste Escuela", Toast.LENGTH_SHORT).show();
        if(trabajo.isChecked()) Toast.makeText(this,"Seleccionaste Trabajo", Toast.LENGTH_SHORT).show();
    }

}
