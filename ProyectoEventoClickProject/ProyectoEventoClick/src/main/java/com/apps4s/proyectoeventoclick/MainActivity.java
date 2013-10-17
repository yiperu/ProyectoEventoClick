package com.apps4s.proyectoeventoclick;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
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
                TextView ing = (TextView)findViewById(R.id.lblTitulo);
                TextView sal = (TextView)findViewById(R.id.txtRespuesta);

                sal.setText(ing.getText());
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
