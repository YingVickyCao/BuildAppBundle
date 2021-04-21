package com.hades.example.android.buildappbundle;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hades.example.android.android_library.AndroidBean;
import com.hades.example.android.java_library.JavaBean;
import com.hades.example.android.kotlin_library.KotlinBean;

public class MainActivity extends AppCompatActivity {
    TextView app_tv1;
    ImageView app_img1;

    TextView java_lib_tv1;

    TextView android_lib_tv1;
    ImageView android_lib_img1;

    TextView kotlin_tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app_tv1 = findViewById(R.id.app_tv1);
        app_tv1.setText(new AppBean().getDesc());
        app_img1 = findViewById(R.id.app_img1);
        app_img1.setImageResource(R.drawable.outline_flag_black_24);

        java_lib_tv1 = findViewById(R.id.java_lib_tv1);
        java_lib_tv1.setText(new JavaBean().getDesc());

        android_lib_tv1 = findViewById(R.id.android_lib_tv1);
        android_lib_tv1.setText(new AndroidBean().getDesc());
        android_lib_img1 = findViewById(R.id.android_lib_img1);
        android_lib_img1.setImageResource(R.drawable.round_add_alert_black_24);

        kotlin_tv1 = findViewById(R.id.kotlin_tv1);
        kotlin_tv1.setText(new KotlinBean().getDesc());
    }
}