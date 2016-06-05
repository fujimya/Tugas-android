package com.example.gin.komponenelektronika;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class Isi extends AppCompatActivity {

    int gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi);

        TextView textView = (TextView) findViewById(R.id.isitulisan);
        TextView textView1 = (TextView) findViewById(R.id.judulatas);
        ImageView imageView = (ImageView) findViewById(R.id.gambar);

        Intent i = getIntent();
        String isi = i.getStringExtra("isi");
        textView.setText(Html.fromHtml(isi));


        String judul = i.getStringExtra("judul");
        textView1.setText(Html.fromHtml(judul));

        gambar = i.getIntExtra("gambar",gambar);
        imageView.setImageResource(gambar);

    }
}
