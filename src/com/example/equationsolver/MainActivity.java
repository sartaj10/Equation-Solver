package com.example.equationsolver;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	float a11,b11,c11,d11,a22,b22,c22,d22,a33,b33,c33,d33;
	float x,y,z;
	public TextView t1,t2,t3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.equation);
		
		final EditText a1 = (EditText) findViewById(R.id.editText1);
		final EditText b1 = (EditText) findViewById(R.id.editText2);
		final EditText c1 = (EditText) findViewById(R.id.editText3);		
		final EditText d1 = (EditText) findViewById(R.id.editText4);
		
		
		final EditText a2 = (EditText) findViewById(R.id.editText5);
		final EditText b2 = (EditText) findViewById(R.id.editText6);
		final EditText c2 = (EditText) findViewById(R.id.editText7);
		final EditText d2 = (EditText) findViewById(R.id.editText8);
		
		
		final EditText a3 = (EditText) findViewById(R.id.editText9);
		final EditText b3 = (EditText) findViewById(R.id.editText10);
		final EditText c3 = (EditText) findViewById(R.id.editText11);
		final EditText d3 = (EditText) findViewById(R.id.editText12);
		 
		final TextView t1 = (TextView) findViewById(R.id.textView11);
		final TextView t2 = (TextView) findViewById(R.id.textView12);
		final TextView t3 = (TextView) findViewById(R.id.textView13);
		
		final Button get_answer = (Button) findViewById(R.id.button1);
		get_answer.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					a11 = Float.parseFloat(a1.getText().toString());
					b11 = Float.parseFloat(b1.getText().toString());
					c11 = Float.parseFloat(c1.getText().toString());
					d11 = Float.parseFloat(d1.getText().toString());

					a22 = Float.parseFloat(a2.getText().toString());
					b22 = Float.parseFloat(b2.getText().toString());
					c22 = Float.parseFloat(c2.getText().toString());
					d22 = Float.parseFloat(d2.getText().toString());

					a33 = Float.parseFloat(a3.getText().toString());
					b33 = Float.parseFloat(b3.getText().toString());
					c33 = Float.parseFloat(c3.getText().toString());
					d33 = Float.parseFloat(d3.getText().toString());
				} catch(NumberFormatException nfe) {
					   System.out.println("Could not parse " + nfe);
				}
				
				x = getdelta(d11,b11,c11,d22,b22,c22,d33,b33,c33) / getdelta(a11,b11,c11,a22,b22,c22,a33,b33,c33);
				
			}
		});
		{
			
		}
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
