package com.example.mixview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	//����һ����������
	int[] images = new int[]{
			R.drawable.java,
			R.drawable.ee,
			R.drawable.classic,
			R.drawable.ajax,
			R.drawable.xml,
	};
	int currentImg = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//��ȡLinearOut��������
		LinearLayout main = (LinearLayout)findViewById(R.id.root);
		//���򴴽�ImageView�ļ�
		final ImageView image = new ImageView(this);
		//��ImageView�����ӵ�LinearLayout����������
		main.addView(image);
		//��ʼ��ʱ��ʾ��һ����Ƭ
		image.setImageResource(image[0]);
		image.setOnClickListener(new OnClickListener){
			@override
			public void onClick(View v){
				if(currentImg>=4){
					currentImg = -1;
				}
				//�ı�ImageView������ʾ����Ƭ
				image.setImageResource(images(++currentImg));
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
