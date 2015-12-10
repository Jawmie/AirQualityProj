package com.project.AirQuality;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Jawmie on 24/10/2015.
 */
public class mainActivity extends Activity {
    private static TextView results;
    private static Button carbon;
    private static Button occupancy;
    private static ImageButton temButt;
    private static ImageButton humButt;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temButt = (ImageButton)findViewById(R.id.temperature);
        humButt = (ImageButton)findViewById(R.id.hum);
        occupancy = (Button)findViewById(R.id.occ);
        carbon = (Button)findViewById(R.id.co);
        results = (TextView)findViewById(R.id.resultsView);

        temButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tempAct = new Intent(mainActivity.this, temperature_activity.class);

                startActivity(tempAct);
            }
        });

        humButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent humAct = new Intent(mainActivity.this, humidity_activity.class);

                startActivity(humAct);
            }
        });

        //Test for Carbon Monoxide Trigger
        carbon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText("");
                results.setText("Carbon Monoxide Detected!");
            }
        });

        //Test for Occupancy Trigger
        occupancy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText("");
                results.setText("Movement Detected!");
            }
        });
    }
}