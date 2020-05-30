package com.fox.furryqrcode.ui.register;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.fox.furryqrcode.R;
import com.fox.furryqrcode.ui.login.LoginActivity;

import java.util.Objects;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(com.fox.furryqrcode.ui.register.RegisterActivity.this,com.fox.furryqrcode.ui.login.LoginActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
