package com.example.skeloton;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import java.*;
import java.text.*;

import java.util.Date;
import java.lang.System;
import static java.lang.System.out;



      
      public class SkelotonActivity extends Activity {
    	   Button button ;
	       EditText text ;
	       RadioButton rb2;
	       RadioButton rb1;
    	     protected void onCreate(Bundle icicle) {
    	         super.onCreate(icicle);
    	         
    	        

    	         setContentView(R.layout.skeleton);

    	         button = (Button) findViewById(R.id.button1);
    	         text = (EditText) findViewById(R.id.editText1);
    	         rb2=(RadioButton)findViewById(R.id.radioButton2);
    	         rb1=(RadioButton)findViewById(R.id.radioButton1);
    	         
    	        
    	     
    	     
    	     }
	             public void onClick(View v) {
	            	 int a,b=0;
	            	 String s=text.getText().toString();
	            	 
	            	 
	            	if( s.length() ==0){
	            		
	            	 Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
	            		
	            		 
	            	 }
	             
	            	else{ 
	            		a=Integer.parseInt(s);
	            		if(rb2.isChecked()){
	            		// faren
    	            	 b=a-4;
	            	 }
	            	 else  if(rb1.isChecked()){
	            		 // cels
    	            	 b=a-3;
	            	 }
	            	
	            	 text.setText(new Integer(b).toString());
	            	}
	            	 
	            	
	            	 
	            	
	            	
	                
	                 
	             }
	         
	         
	         
	       
    	 }

   
    
      
