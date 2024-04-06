/*package com.example.proyecto01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn01,btn02,btn03,btn04,btn05,btn06,btn07,btn08,btn09,btn00,btnBorrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //BOTONES
        btn01=findViewById(R.id.btn01);
        btn02=findViewById(R.id.btn02);
        btn03=findViewById(R.id.btn03);
        btn04=findViewById(R.id.btn04);
        btn05=findViewById(R.id.btn05);
        btn06=findViewById(R.id.btn06);
        btn07=findViewById(R.id.btn07);
        btn08=findViewById(R.id.btn08);
        btn09=findViewById(R.id.btn09);
        btn00=findViewById(R.id.btn00);
        btnBorrar = findViewById(R.id.btnBorrar);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // mensajeAlert("1");
                mensajeToast("1");

            }
        });

    }

    //Mensajes en Alert
    public void mensajeAlert(String msg){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setMessage(msg);
        alertDialog.setCancelable(true);
        alertDialog.show();
    }

//Mensajes tipo Toast
    void mensajeToast(String mensaje){
        Toast toast1 =  Toast.makeText(getApplicationContext(),mensaje, Toast.LENGTH_LONG);
        toast1.show();
    }
}*/



/* ejercicio 1
package com.example.proyecto01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn01, btn02, btn03, btn04, btn05, btn06, btn07, btn08, btn09, btn00, btnBorrar;

    //EJERCICIO2
    RadioButton rbt01,rbt02,rbt03,rbt04,rbt05,rbt06;
    //-------------------------------
    StringBuilder clave;
    int contador;
    //--------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//------------
        clave = new StringBuilder();
        contador = 0;

        //EJERCICIO 2
        /* Asignar RadioButtons
        rbt01 = findViewById(R.id.rbt01);
        rbt02 = findViewById(R.id.rbt02);
        rbt03 = findViewById(R.id.rbt03);
        rbt04 = findViewById(R.id.rbt04);
        rbt05 = findViewById(R.id.rbt05);
        rbt06 = findViewById(R.id.rbt06);

//-------------------
        btn01 = findViewById(R.id.btn01);
        btn02 = findViewById(R.id.btn02);
        btn03 = findViewById(R.id.btn03);
        btn04 = findViewById(R.id.btn04);
        btn05 = findViewById(R.id.btn05);
        btn06 = findViewById(R.id.btn06);
        btn07 = findViewById(R.id.btn07);
        btn08 = findViewById(R.id.btn08);
        btn09 = findViewById(R.id.btn09);
        btn00 = findViewById(R.id.btn00);
        btnBorrar = findViewById(R.id.btnBorrar);
//---------------
        // Asignar un OnClickListener para cada botón
        btn01.setOnClickListener(onClickListener);
        btn02.setOnClickListener(onClickListener);
        btn03.setOnClickListener(onClickListener);
        btn04.setOnClickListener(onClickListener);
        btn05.setOnClickListener(onClickListener);
        btn06.setOnClickListener(onClickListener);
        btn07.setOnClickListener(onClickListener);
        btn08.setOnClickListener(onClickListener);
        btn09.setOnClickListener(onClickListener);
        btn00.setOnClickListener(onClickListener);

        //EJERCCIO2


    }

    // OnClickListener común para todos los botones
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button btn = (Button) v;
            String numero = btn.getText().toString();
            clave.append(numero); // Agregar el número pulsado a la variable
            contador++;
            if (contador == 6) { // Si se han pulsado seis números
                mostrarClave();
                clave.setLength(0); // Limpiar la clave
                contador = 0; // Reiniciar contador
            }
        }
    };

    // Método para mostrar la clave con un Toast
    private void mostrarClave() {
        Toast.makeText(getApplicationContext(), "La clave es: " + clave.toString(), Toast.LENGTH_LONG).show();
    }
}
*/

package com.example.proyecto01;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn01, btn02, btn03, btn04, btn05, btn06, btn07, btn08, btn09, btn00, btnBorrar;
    //EJERCICIO CLAVE
    RadioButton rbt01, rbt02, rbt03, rbt04, rbt05, rbt06;

    StringBuilder clave;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        clave = new StringBuilder();
        contador = 0;

        //EJERCICIO CLAVE//
        rbt01 = findViewById(R.id.rbt01);
        rbt02 = findViewById(R.id.rbt02);
        rbt03 = findViewById(R.id.rbt03);
        rbt04 = findViewById(R.id.rbt04);
        rbt05 = findViewById(R.id.rbt05);
        rbt06 = findViewById(R.id.rbt06);
//
        btn01 = findViewById(R.id.btn01);
        btn02 = findViewById(R.id.btn02);
        btn03 = findViewById(R.id.btn03);
        btn04 = findViewById(R.id.btn04);
        btn05 = findViewById(R.id.btn05);
        btn06 = findViewById(R.id.btn06);
        btn07 = findViewById(R.id.btn07);
        btn08 = findViewById(R.id.btn08);
        btn09 = findViewById(R.id.btn09);
        btn00 = findViewById(R.id.btn00);
        btnBorrar = findViewById(R.id.btnBorrar);

        btn01.setOnClickListener(onClickListener);
        btn02.setOnClickListener(onClickListener);
        btn03.setOnClickListener(onClickListener);
        btn04.setOnClickListener(onClickListener);
        btn05.setOnClickListener(onClickListener);
        btn06.setOnClickListener(onClickListener);
        btn07.setOnClickListener(onClickListener);
        btn08.setOnClickListener(onClickListener);
        btn09.setOnClickListener(onClickListener);
        btn00.setOnClickListener(onClickListener);


    }

    //PARA LOS NUMEROS
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button btn = (Button) v;
            String numero = btn.getText().toString();
            clave.append(numero);
            contador++;

            if (contador == 1) {
                rbt01.setChecked(true);
                rbt01.setTextColor(Color.RED);
            } else if (contador == 2) {
                rbt02.setChecked(true);
                rbt02.setTextColor(Color.RED);
            } else if (contador == 3) {
                rbt03.setChecked(true);
                rbt03.setTextColor(Color.RED);
            } else if (contador == 4) {
                rbt04.setChecked(true);
                rbt04.setTextColor(Color.RED);
            } else if (contador == 5) {
                rbt05.setChecked(true);
                rbt05.setTextColor(Color.RED);
            } else if (contador == 6) {
                rbt06.setChecked(true);
                rbt06.setTextColor(Color.RED);
                mostrarClave();
                borrarClave();
            }
        }
    };

    //
    private void mostrarClave() {
        Toast.makeText(getApplicationContext(), "La clave es: " + clave.toString(), Toast.LENGTH_LONG).show();
    }

    //LIMPIAR
    private void borrarClave() {
        clave.setLength(0);
        contador = 0;
        rbt01.setChecked(false);
        rbt02.setChecked(false);
        rbt03.setChecked(false);
        rbt04.setChecked(false);
        rbt05.setChecked(false);
        rbt06.setChecked(false);
        rbt01.setTextColor(Color.BLACK);
        rbt02.setTextColor(Color.BLACK);
        rbt03.setTextColor(Color.BLACK);
        rbt04.setTextColor(Color.BLACK);
        rbt05.setTextColor(Color.BLACK);
        rbt06.setTextColor(Color.BLACK);
    }
}
