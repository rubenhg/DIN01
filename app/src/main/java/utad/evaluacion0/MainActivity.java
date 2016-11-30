package utad.evaluacion0;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     Button btnCIbtn,btnCCbtn,btnOcultarbtn,btnEliminarbtn,btnCbtn,btnCambiarTextobtn,btnMostrarDialogobtn,btnFinbtn;
     TextView heading;
     RelativeLayout bc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCCbtn=(Button)findViewById(R.id.btnCC);
        bc=(RelativeLayout)findViewById(R.id.backgroundColorchange);
        btnCCbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bc.setBackgroundColor(Color.GREEN);
            }
        });

        btnCIbtn = (Button) findViewById(R.id.btnCI);
        btnCIbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView1);
                image.setImageResource(R.drawable.wow);
            }
        });

        btnOcultarbtn = (Button) findViewById(R.id.btnOcultar);
        btnOcultarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image = (ImageView)findViewById(R.id.imageView1);
                image .setVisibility(View.INVISIBLE);
            }
        });

        btnEliminarbtn = (Button) findViewById(R.id.btnEliminar);
        btnEliminarbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView1);
                image .setVisibility(View.GONE);
            }
        });

        btnCambiarTextobtn=(Button)findViewById(R.id.btnCambiarTexto);
        btnCambiarTextobtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView txt = (TextView)findViewById(R.id.lblHeading);
                txt.setText("Cabecera Cambiada");           }
        });
        btnFinbtn=(Button)findViewById(R.id.btnFin);
        btnFinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

}
