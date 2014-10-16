package asl.example.lab1mc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
	TextView textView1;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.two);
		textView1=(TextView)findViewById(R.id.textView1);
		Intent intent = getIntent();
		String s=intent.getStringExtra("search");
		textView1.setText(s);
	}
}
