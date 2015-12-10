package com.project.AirQuality;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by Jawmie on 24/10/2015.
 */
public class temperature_activity extends Activity {
    private static SeekBar tempTest;
    private static TextView resultTest;
    final String DEGREE  = "\u00b0";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperature);
        seekbarTemp();
    }

    public void seekbarTemp(){
        tempTest = (SeekBar)findViewById(R.id.seekBar);
        resultTest = (TextView)findViewById(R.id.resultView);
        resultTest.setText(tempTest.getProgress() + DEGREE + "C");

        tempTest.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int temp_value;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                temp_value = progress;
                resultTest.setText(progress + DEGREE + "C");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                resultTest.setText(temp_value + DEGREE + "C");
            }
        });
    }
}