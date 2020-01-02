package com.example.databindingjavaexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.TextView;

import com.example.databindingjavaexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        /*
        TextView text = findViewById(R.id.idDaTextView);
        text.setText("DEVIL MAY CRY!!!");
         */

        binding.idDaTextView.setText("DEVIL MAY CRY!!!");
    }
}
