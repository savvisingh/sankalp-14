package co.sdslabs.mdg.sankalp_14;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreateEvent extends Activity{
	EditText eTittle,eDiscription,eTags,eDate,eTime;
	Button submit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.create_event);
	    eTittle=(EditText) findViewById(R.id.eTittle);
	    eDiscription=(EditText) findViewById(R.id.eCenter);
	    eTags=(EditText) findViewById(R.id.eTags);
	    eDate=(EditText) findViewById(R.id.eDate);
	    eTime=(EditText) findViewById(R.id.eTime);
	    submit=(Button)  findViewById(R.id.submit);
	    
	    
	    
		  
	  
	   
	}
	
	

}
