package com.pijupiju.blaringsun;

import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.pijupiju.blaringsun.databinding.ActivityMainBinding;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.pijupiju.blaringsun.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ConstraintLayout constraintLayout = findViewById(R.id.constraint_layout);
        constraintLayout.setOnClickListener(v -> vibe());
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void vibe() {
        Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        int hour = Calendar.getInstance().get(Calendar.HOUR);
        if (hour < 5 || hour > 7) {
            vibrator.vibrate(VibrationEffect.createOneShot(5, VibrationEffect.DEFAULT_AMPLITUDE));
        } else if (hour == 5) {
            vibrator.vibrate(VibrationEffect.createOneShot(300, VibrationEffect.DEFAULT_AMPLITUDE));
        } else if (hour == 6) {
            vibrator.vibrate(VibrationEffect.createWaveform(new long[]{0, 300, 100, 250}, -1));
        } else {
            vibrator.vibrate(VibrationEffect.createWaveform(new long[]{0, 300, 100, 250, 100, 200}, -1));
        }
    }
}