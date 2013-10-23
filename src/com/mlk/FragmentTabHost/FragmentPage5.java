package com.mlk.FragmentTabHost;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentPage5 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment, null);
		TextView textView = (TextView) view.findViewById(R.id.text);
		textView.setText("E");
		textView.setTextColor(Color.parseColor("#E98B2A"));
		return view;
	}
}