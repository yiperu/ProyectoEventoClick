package com.apps4s.proyectoeventoclick;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Codificar el Boton
        Button boton1 = (Button)findViewById(R.id.btnBoton);
        boton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText ing = (EditText)findViewById(R.id.editText);
                TextView sal = (TextView)findViewById(R.id.txtRespuesta);

                sal.setText(ing.getText());

                quitarTeclado(sal);
            }

            private void quitarTeclado(View view) {
                InputMethodManager teclado = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                teclado.hideSoftInputFromWindow(view.getWindowToken(),0);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
