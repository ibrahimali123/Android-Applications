package com.examples.carsstore;

import android.app.Activity; 
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class BentlyActivity extends Activity {

	String companyInfo = "بنتلى هى شركة بريطانية الاصل تختص بأنتاج السيارات الرياضية وقد سبق أن تملكتها شركة رولز رويس قبل ان تشتريها مجموعة فولكس عام 1998 ويمثلها فى مصر شركة ام ام جروب";
	String []ser ={"{مراكز الخدمة و الصيانة}","العاشر من رمضان","العنوان : المنطقة الصناعية","4125234-015 : تيليفون"}; 
	int []imgid={R.drawable.car_bentley1,R.drawable.car_bentley2,R.drawable.car_bentley3,R.drawable.car_bentley4};
	Button []btn = new Button[5];
	Button show;
	int i = 0;
	TextView txtView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		// for hiding the title bar
		
	    this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.audi_activity);
		
		txtView = (TextView) findViewById(R.id.textview1);
		show = (Button) findViewById(R.id.button6);
		btn[0] = (Button) findViewById(R.id.button1);
	    btn[1] = (Button) findViewById(R.id.button2);
	    btn[3] = (Button) findViewById(R.id.button4);
	    btn[4] = (Button) findViewById(R.id.button5);
	     
	    
        btn[0].setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				txtView.setText(companyInfo.toString());
				return false;
			}
		});
        btn[1].setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				txtView.setText(""); 
				for(int i=0;i<4;i++){
					txtView.append(ser[i]);
					txtView.append("\n");
				} 
				return false;
			}
		});
         btn[3].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				txtView.setText(companyInfo.toString());
				show.setText("");
				show.setBackgroundResource(imgid[i]);
				i++;
			    if(i==4){
			    	i=0;
			    }
			}
		});
         
        btn[4].setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse("http://www.bentleymotors.com"));				
				startActivity(i);

				return false;
			}
		});
	}

}
