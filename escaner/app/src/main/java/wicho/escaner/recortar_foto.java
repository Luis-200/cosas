package wicho.escaner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class recortar_foto extends AppCompatActivity {
ImageView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recortar_foto);

        button = findViewById(R.id.btncamara);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Camara.class);
                startActivity(intent);
                // Do something in response to button click
            }
        });
    }
}