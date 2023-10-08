package com.studylink.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import com.studylink.databinding.LayoutSplashScreenBinding;
import com.studylink.R;

public class SplashScreen extends AppCompatActivity {
    
    private LayoutSplashScreenBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = LayoutSplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                //start the main activity
                Intent intent = new Intent(SplashScreen.this, CreateAccountActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        }, 2000); //(2 seconds) delay
    }
}
