package com.mark.main.screens;

import com.mark.main.R;

import android.os.Bundle;
import android.util.Log;

public class AboutScreen extends ScreenManager{
	
	private static String logID = AboutScreen.class.getName();

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);      
		Log.d(logID, "Activity Created");
		super.shouldContinueMusic = false;
    }
	
	

	

	
}
