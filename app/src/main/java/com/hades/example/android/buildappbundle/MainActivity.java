package com.hades.example.android.buildappbundle;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hades.example.android.android_library.AndroidBean;
import com.hades.example.android.java_library.JavaBean;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        imageView1 = findViewById(R.id.image1);

        textView1.setText(new JavaBean().getDesc());
        textView2.setText(new AndroidBean().getDesc());
        imageView1.setImageResource(R.drawable.round_add_alert_black_24);
    }
}