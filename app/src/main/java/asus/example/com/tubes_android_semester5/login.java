package asus.example.com.tubes_android_semester5;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor spEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sharedPreferences = this.getSharedPreferences("data login", Context.MODE_PRIVATE);
        spEditor = sharedPreferences.edit();

        String uname = sharedPreferences.getString("uname", "");
        String pass = sharedPreferences.getString("pass", "");

        if (uname.equals("yuliastrini") && pass.equals("123456")) {
            //lakukan pindah activity
            Intent intent = new Intent(this, menu.class);
            startActivity(intent);
            finish();
        }
    }

    public void btn_login(View view) {
        EditText et_username = (EditText) findViewById(R.id.et_user);
        EditText et_password = (EditText) findViewById(R.id.et_pass);
        String uname = et_username.getText().toString();
        String pass = et_password.getText().toString();
        if (uname.equals("yuliastrini") && pass.equals("123456")) {
            //simpan nilai uname & pass ke memory
            spEditor.putString("uname", uname);
            spEditor.putString("pass", pass);
            spEditor.commit();
            //pindah activity
            Intent intent = new Intent(this, menu.class);
            startActivity(intent);
            finish();
        } else {
            //menampilkan kesalahan
            Toast.makeText(this, "Login Gagal", Toast.LENGTH_SHORT).show();
        }
    }
}