package com.yunkang.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.emiteam.my.R;


/**
 * @author 云康IT-大神技术
 *         Created by ${Tiger} on 2016/10/16.
 */

public class Plantlists extends Fragment {
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		//加载datebase的对应的布局文件
		View rootView =inflater.inflate( R.layout.plantlist_main ,container,false);
		return rootView;
	}
}
