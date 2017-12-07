package asus.example.com.tubes_android_semester5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class putar_media extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_putar_media);
    }
    public void btn_putar_audio(View view){
        Intent intent = new Intent(this,putar_audio.class);
        startActivity(intent);
        finish();
    }
}
