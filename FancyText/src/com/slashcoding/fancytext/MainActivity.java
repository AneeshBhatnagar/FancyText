package com.slashcoding.fancytext;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Stylize implements OnClickListener,
		OnCheckedChangeListener {

	Button submit;
	RadioGroup rg;
	String input, ans;
	int select;
	EditText text;
	TextView tV;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initialize();

	}

	private void initialize() {
		// TODO Auto-generated method stub
		submit = (Button) findViewById(R.id.create);
		rg = (RadioGroup) findViewById(R.id.rGSelect);
		text = (EditText) findViewById(R.id.eTtext);
		rg.setOnCheckedChangeListener(this);
		select = 0;
		submit.setOnClickListener(this);
		tV = (TextView) findViewById(R.id.tVAns);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		input = text.getText().toString();
		InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);

		inputManager.hideSoftInputFromWindow(
				getCurrentFocus().getWindowToken(),
				InputMethodManager.HIDE_NOT_ALWAYS);
		if (input.length() == 0) {
			Toast.makeText(getApplicationContext(), "You must Enter a String!",
					Toast.LENGTH_LONG).show();
		} else {
			switch (select) {
			case 0:
				ans = mixedstyle(input);
				break;
			case 1:
				ans = style1(input);
				break;
			case 2:
				ans = style2(input);
				break;
			case 3:
				ans = style3(input);
				break;
			case 4:
				ans = numberstyle(input);
				break;
			}
			tV.setText(ans);
			ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
			ClipData clip = ClipData.newPlainText("simple text", ans);
			clipboard.setPrimaryClip(clip);
			Toast.makeText(getApplicationContext(), "Text Copied to Clipboard",
					Toast.LENGTH_LONG).show();
		}
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		switch (checkedId) {
		case R.id.rBmix:
			select = 0;
			break;
		case R.id.rB1:
			select = 1;
			break;
		case R.id.rB2:
			select = 2;
			break;
		case R.id.rB3:
			select = 3;
			break;

		case R.id.rBnum:
			select = 4;
			break;
		}
	}
}
