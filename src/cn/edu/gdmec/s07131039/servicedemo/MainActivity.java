package cn.edu.gdmec.s07131039.servicedemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
    Button Mybtn,otherbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mybtn = (Button) findViewById(R.id.button1);
        otherbtn = (Button) findViewById(R.id.button2);
        Mybtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myit = new Intent("cn.edu.gdmec.s07131039.servicedemo");
                startService(myit);
			}
        	
        });
        
        otherbtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myit = new Intent("cn.edu.gdmec.s07131039.servicedemo");
                stopService(myit);
			}
        	
        });
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
