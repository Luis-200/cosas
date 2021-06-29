package wicho.escaner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class vistaPDF extends AppCompatActivity {
ImageView button;
ImageView button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_pdf);

        button = findViewById(R.id.btn_save);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), inicio.class);
                startActivity(intent);
                // Do something in response to button click
            }
        });

        //
        button1 = findViewById(R.id.btncamara);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Camara.class);
                startActivity(intent);
                // Do something in response to button click
            }
        });
    }
}