package id.ac.uin.suska.recyclermobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView ivDefault = findViewById(R.id.iv_default);
        TextView  tvDefault = findViewById(R.id.tv_default);

        Intent intent = getIntent();

        int logoAplikasi = intent.getIntExtra("Gambar Default",0);
        String namaAplikasi = intent.getStringExtra("Text Default");

        ivDefault.setImageResource(logoAplikasi);
        tvDefault.setText(namaAplikasi);
    }
}