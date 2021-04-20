package com.hades.example.android.buildappbundle;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private final String KEY_INSTALL = "KEY_INSTALL";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        findViewById(R.id.loginIn).setOnClickListener(v -> loginIn());
    }

    private void loginIn() {
        SharedPreferences sharedPreferences = getSharedPreferences("sf", Context.MODE_PRIVATE);
        if (!isFirstOpenAfterInstall(sharedPreferences)) {
            saveInstallFlag(sharedPreferences);
            startActivity(new Intent(this, GuideActivity.class));
        } else {
            startActivity(new Intent(this, MainActivity.class));
        }
        finish();
    }

    private boolean isFirstOpenAfterInstall(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(KEY_INSTALL, false);
    }

    private void saveInstallFlag(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(KEY_INSTALL, true);
        editor.apply();
    }
}
