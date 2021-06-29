package wicho.escaner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class Camara extends AppCompatActivity {

    CardView button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camara);

        /*
        static final int REQUEST_IMAGE_CAPTURE = 1;

        private void dispatchTakePictureIntent() {
            Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
            }
        }

        private void startActivityForResult(Intent takePictureIntent, int requestImageCapture) {

        }

        private PackageManager getPackageManager() {
            return null;
        }
    }
        */
        button1 = findViewById(R.id.btn_back);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), inicio.class);
                startActivity(intent);
                // Do something in response to button click
            }
        });
    }
}