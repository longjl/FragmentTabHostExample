package com.mlk.FragmentTabHost;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.TextView;

public class SinaWeiBoActivity extends FragmentActivity {

	private FragmentTabHost mTabHost;

	// ������������Ű�ťͼƬ
	private int imageIds[] = { R.drawable.tab_home_btn,
			R.drawable.tab_message_btn, R.drawable.tab_selfinfo_btn,
			R.drawable.tab_square_btn, R.drawable.tab_more_btn };

	// Tabѡ�������
	private String tabLabels[] = { "��ҳ", "��Ϣ", "����", "�㳡", "����" };

	private Class<?> fragments[] = { FragmentPage1.class, FragmentPage2.class,
			FragmentPage3.class, FragmentPage4.class, FragmentPage5.class };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sina_weibo);
		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
		for (int i = 0; i < 5; i++) {
			mTabHost.addTab(
					mTabHost.newTabSpec(tabLabels[i]).setIndicator(
							getIndicator(i)), fragments[i], null);
		}

	}

	/**
	 * ��ȡָʾ��
	 * 
	 * @param index
	 * @return
	 */
	private View getIndicator(int index) {
		TextView textView = (TextView) View.inflate(this,
				R.layout.indicator_view_sina_weibo, null);
		textView.setCompoundDrawablesWithIntrinsicBounds(null, getResources()
				.getDrawable(imageIds[index]), null, null);
		textView.setText(tabLabels[index]);
		return textView;
	}

}
