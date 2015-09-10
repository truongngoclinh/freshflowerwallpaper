package com.smapps.sgbg.adapter;

import java.util.ArrayList;

import com.smapps.sgbg.activity.ViewPagerFragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

	ViewPagerFragment mFragment;
	ArrayList<String> mData;
	Context mContext;

	public ViewPagerAdapter(FragmentManager fm, ArrayList<String> data,
			Context context) {
		super(fm);
		this.mData = data;
		this.mContext = context;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int pos) {
		mFragment = new ViewPagerFragment(mContext);
		Bundle info = new Bundle();
		info.putString("link", mData.get(pos));
		mFragment.setArguments(info);
		return mFragment;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mData.size();
	}

}