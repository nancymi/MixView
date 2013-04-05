package com.example.mixview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	//定义一个访问数组
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
		//获取LinearOut布局容器
		LinearLayout main = (LinearLayout)findViewById(R.id.root);
		//程序创建ImageView文件
		final ImageView image = new ImageView(this);
		//将ImageView组件添加到LinearLayout布局容器中
		main.addView(image);
		//初始化时显示第一张照片
		image.setImageResource(image[0]);
		image.setOnClickListener(new OnClickListener){
			@override
			public void onClick(View v){
				if(currentImg>=4){
					currentImg = -1;
				}
				//改变ImageView里面显示的照片
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
