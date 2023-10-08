package com.studylink.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.studylink.databinding.ActivityCreateAccountBinding;

public class CreateAccountActivity extends AppCompatActivity {
    
    private ActivityCreateAccountBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreateAccountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
