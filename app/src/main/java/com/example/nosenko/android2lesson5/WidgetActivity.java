package com.example.nosenko.android2lesson5;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.util.Log;

import java.util.Arrays;

public class WidgetActivity extends AppWidgetProvider {

    private final String LT = "WidgetProvider";

    @Override
    public void onDisabled(Context context) {
        Log.d(LT, "onDisabled");
        super.onDisabled(context);
    }

    @Override
    public void onEnabled(Context context) {
        Log.d(LT, "onEnabled");
        super.onEnabled(context);
    }

    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        Log.d(LT, "onDeleted " + Arrays.toString(appWidgetIds));
        super.onDeleted(context, appWidgetIds);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        Log.d(LT, "onUpdate " + Arrays.toString(appWidgetIds));
        super.onUpdate(context, appWidgetManager, appWidgetIds);
    }
}
