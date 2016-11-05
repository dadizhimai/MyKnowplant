package com.yunkang.search;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.emiteam.my.R;

/**
 * @author 云康IT-大神技术
 *         Created by ${Tiger} on 2016/10/24.
 */

public class SearchDialog extends Dialog implements android.view.View.OnClickListener {
	private Context context;
	private LinearLayout linearLayouttop, linearLayoutbottom;
	private LeaveMyDialogListener listener;

	@Override
	public void onClick(View v) {
		listener.onClick( v );
	}

	public interface LeaveMyDialogListener {
		public void onClick(View view);
	}

	public SearchDialog(Context context) {
		super( context );
		this.context = context;
	}

	public SearchDialog(Context context, int theme, LeaveMyDialogListener listener) {
		super( context, theme );
		this.context = context;
		this.listener = listener;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate( savedInstanceState );
		this.setContentView( R.layout.search_main );
		//获得searchdialog的搜索的布局ID
		linearLayouttop = (LinearLayout) findViewById( R.id.search_top );
		//获得searchdialog的扫一扫的布局ID
		linearLayoutbottom = (LinearLayout) findViewById( R.id.serach_bottom );
		//实现搜索的监听
		linearLayouttop.setOnClickListener( new View.OnClickListener() {
			@Override
			public void onClick(View v) {

			}
		} );
		linearLayoutbottom.setOnClickListener( new View.OnClickListener() {
			@Override
			public void onClick(View v) {

			}
		} );

	}

}
