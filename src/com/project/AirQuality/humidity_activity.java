package com.project.AirQuality;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by Jawmie on 24/10/2015.
 */
public class humidity_activity extends Activity {
    private static SeekBar humTest;
    private static TextView resultTest;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.humidity);
        seekbarHum();
    }

    public void seekbarHum(){
        humTest = (SeekBar)findViewById(R.id.seekBar);
        resultTest = (TextView)findViewById(R.id.humResult);
        resultTest.setText(humTest.getProgress() + "%RH");

        humTest.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int temp_value;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                temp_value = progress;
                resultTest.setText(progress + "%RH");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                resultTest.setText(temp_value + "%RH");
            }
        });
    }
}