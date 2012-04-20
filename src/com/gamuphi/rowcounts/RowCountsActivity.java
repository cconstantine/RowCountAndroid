package com.gamuphi.rowcounts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RowCountsActivity extends Activity {
	int count = 0;
	private EditText CountText;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        CountText = (EditText)this.findViewById(R.id.editText);
        
        CountText.setText(String.format("%d",count));
    }
    
    public void onCount(View v) {
    	count = Integer.parseInt(CountText.getText().toString());
    	count++;
        CountText.setText(String.format("%d",count));    	
    }
    
    
    public void onReset(View v) {
    	count = 0;
        CountText.setText(String.format("%d",count)); 
    }
}