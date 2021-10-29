package com.example.buenosmodales;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_gracias;
    private Button btn_estornudar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_gracias = (Button)findViewById(R.id.btn_gracias);
        btn_estornudar = (Button)findViewById(R.id.btn_estornudar);

        btn_gracias.setOnClickListener(graciasListener);
        btn_estornudar.setOnClickListener(estornudarListener);
    }


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

    //Listener para el boton Gracias
    private View.OnClickListener graciasListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            //Muestra el mensaje "De Nada"
            Toast.makeText(MainActivity.this, "De nada!", Toast.LENGTH_LONG).show();
        }
    };

    //Listener para el boton Estornudar
    private View.OnClickListener estornudarListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Muestro el mensaje "Salud!"
            Toast.makeText(MainActivity.this, "Salud!", Toast.LENGTH_LONG).show();
        }
    };

}