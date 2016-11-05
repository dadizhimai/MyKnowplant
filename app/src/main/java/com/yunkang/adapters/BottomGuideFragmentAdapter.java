package com.yunkang.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.yunkang.fragments.Datebase;
import com.yunkang.fragments.Myself;
import com.yunkang.fragments.Plantlists;
import com.yunkang.fragments.Retrievial;

/**
 * @author 云康IT-大神技术
 *         Created by ${Tiger} on 2016/10/20.
 */

public class BottomGuideFragmentAdapter extends FragmentPagerAdapter {
	Datebase datebase =new Datebase();
	Plantlists plantlists = new Plantlists();
	Retrievial retrievial = new Retrievial();
	Myself myself = new Myself();
	private Fragment[] fragments = new Fragment[]
			{datebase,plantlists,retrievial,myself};

	public BottomGuideFragmentAdapter(FragmentManager fm) {
		super( fm );
	}

	@Override
	public Fragment getItem(int position) {
		return fragments[position];
	}

	@Override
	public int getCount() {
		return fragments.length;
	}
}
