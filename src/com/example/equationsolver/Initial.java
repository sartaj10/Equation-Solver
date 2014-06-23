package com.example.equationsolver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Initial extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.initial);
		Thread timer = new Thread() {
			@Override
			public void run() {
				try{
					sleep(3000);
					startActivity(new Intent("com.example.equationsolver.MAINACTIVITY"));
					finish();
				} catch(InterruptedException e){
					e.printStackTrace();
				} 
			}
		};
		timer.start();
	
	}
	

}
