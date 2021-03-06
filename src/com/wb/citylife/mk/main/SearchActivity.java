package com.wb.citylife.mk.main;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;

import com.wb.citylife.R;
import com.wb.citylife.activity.base.BaseActivity;
import com.wb.citylife.config.IntentExtraConfig;

public class SearchActivity extends BaseActivity{
	
	private FragmentManager mFragmentManager;
	private int searchType;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
		
		getIntentData();
		initView();
		
	}
	
	public void getIntentData() {
		searchType = getIntent().getIntExtra(IntentExtraConfig.SEARCH_TYPE, 0);
	}
	
	public void initView() {
		mFragmentManager = getSupportFragmentManager();
		FragmentTransaction transaction = mFragmentManager.beginTransaction();
		SearchFragment searchFragment = new SearchFragment();
		Bundle bundle = new Bundle();
		bundle.putInt(IntentExtraConfig.SEARCH_TYPE, searchType);
		searchFragment.setArguments(bundle);
		transaction.replace(R.id.search_fragment, searchFragment);
		transaction.commit();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//此处设置菜单		
		setDisplayHomeAsUpEnabled(true);
		setDisplayShowHomeEnabled(false);
		
		return super.onCreateOptionsMenu(menu);
	}
}
