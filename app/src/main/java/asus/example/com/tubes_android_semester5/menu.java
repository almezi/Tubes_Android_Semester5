package asus.example.com.tubes_android_semester5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void btn_lapor(View view){
        Intent intent = new Intent(this,lapor.class);
        startActivity(intent);
        finish();
    }
    public void btn_nda(View view){
        Intent intent = new Intent(this,Notif_dialog_alert.class);
        startActivity(intent);
        finish();
    }
    public void btn_putar_media(View view){
        Intent intent = new Intent(this,putar_media.class);
        startActivity(intent);
        finish();
    }
}
