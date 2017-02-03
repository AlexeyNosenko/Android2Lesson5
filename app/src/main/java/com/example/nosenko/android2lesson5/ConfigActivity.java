package com.example.nosenko.android2lesson5;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ConfigActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String PREF_TYPE = "widget_type";
    public static final String PREF_PREF = "widget_pref";
    private int widgetTypeID;
    private int widgetID;

    private Button btnViewButton = null;
    private Button btnViewList = null;

    Intent intentReceiver = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
//        Intent intent = getIntent();
//        Bundle extras = intent.getExtras();
//        if (extras != null) {
//            widgetID = extras.getInt(AppWidgetManager.EXTRA_APPWIDGET_ID,
//                    AppWidgetManager.INVALID_APPWIDGET_ID);
//            Log.d("ConfigActivity", "Find widget - " + widgetID);
//        }
//
        intentReceiver = new Intent();
        intentReceiver.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, widgetID);
        setResult(RESULT_CANCELED, intentReceiver);


        btnViewButton = (Button) findViewById(R.id.btnSetButton);
        btnViewButton.setOnClickListener(this);
        btnViewList = (Button) findViewById(R.id.btnSetList);
        btnViewList.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSetButton:
                widgetTypeID = 1;
                break;

            case R.id.btnSetList:
                widgetTypeID = 2;
                break;
        }

//        SharedPreferences sp = getSharedPreferences(PREF_PREF, MODE_PRIVATE);
//        SharedPreferences.Editor editor = sp.edit();
//        editor.putInt(PREF_TYPE + widgetID, widgetTypeID);
//        editor.commit();

        setResult(RESULT_OK, intentReceiver);

        Log.d("ConfigActivity", "finish config " + widgetID);
        finish();
    }
}
