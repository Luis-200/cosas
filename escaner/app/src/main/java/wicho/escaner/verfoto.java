package wicho.escaner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class verfoto extends AppCompatActivity {
ImageView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verfoto);

        button = findViewById(R.id.btn_check);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), vistaPDF.class);
                startActivity(intent);
                // Do something in response to button click
            }
        });
    }
}