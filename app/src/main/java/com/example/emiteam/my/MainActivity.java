package com.example.emiteam.my;


import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.yunkang.about.About;
import com.yunkang.adapters.BottomGuideFragmentAdapter;
import com.yunkang.constants.Conttant;
import com.yunkang.search.SearchDialog;

/**
 * 主要界面
 */
public class  MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Context context;
    private LinearLayout linearLayout;

    private ViewPager main_viewPager;
    private LinearLayout main_datebase,main_plantlists,main_retrievial,main_myslf,main_about,main_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);
	    Log.d( "<<<-----","aaaa" );
        initViews();//获取各个组件的id
	    Log.d( "<<<-----","abbb" );
        setListener();//为各个组件设置监听事件
	    Log.d( "<<<-----","accc" );
        setViewPagerChangeListener();//设置界面滑动的监听
	    Log.d( "<<<-----","adddd" );
    }


    private void initViews(){
	    Log.d( "<<<-----","a1" );
        //顶部搜索的id获取
        main_search=(LinearLayout)findViewById( R.id.main_search );
        //顶部的关于的id的获取
        main_about=(LinearLayout)findViewById( R.id.main_about );
        //获取底部的四个linearLayout的ID
        main_datebase = (LinearLayout)findViewById(R.id.main_datebaselists );
        main_plantlists = (LinearLayout)findViewById( R.id.main_plantlists );
        main_retrievial = (LinearLayout)findViewById( R.id.main_retrivallists );
        main_myslf = (LinearLayout)findViewById( R.id.main_myself );
        //获取fragment在main_activity的界面
        main_viewPager=(ViewPager)findViewById( R.id.main_viewPager );

        BottomGuideFragmentAdapter adapter = new BottomGuideFragmentAdapter( getSupportFragmentManager() );
        main_viewPager.setAdapter(adapter );

    }
    private void setListener(){
	    Log.d( "<<<-----","a2" );
	    //顶部的两个按钮的监听事件
        main_about.setOnClickListener(this);
	    main_search.setOnClickListener( this );
	    //底部的四个fragment的监听事件
        main_datebase.setOnClickListener(this);
        main_plantlists.setOnClickListener(this);
        main_retrievial.setOnClickListener(this);
        main_myslf.setOnClickListener(this);

    }
    //设置ViewPager的页面滑动监听
    private void setViewPagerChangeListener(){
	    Log.d( "<<<-----","a3" );
        main_viewPager.addOnPageChangeListener( new ViewPager.OnPageChangeListener(){

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case Conttant.TAB_DATEBASE:{
                        //linearLayout.setBackgroundColor(R.color.red);///这样不行
                        linearLayout.setBackgroundColor(getResources().getColor(R.color.red));//这样才可以
                        break;
                    }
                    case Conttant.TAB_PLANTLISTS:{
                        linearLayout.setBackgroundColor(getResources().getColor(R.color.red));
                        break;
                    }
                    case Conttant.TAB_RETRIEVIAL:{
                        linearLayout.setBackgroundColor(getResources().getColor(R.color.red));
                        break;
                    }
                    case Conttant.TAB_MYSELF:{
                        linearLayout.setBackgroundColor(getResources().getColor(R.color.red));
                        break;
                    }
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        } );

    }
    @Override
    public void onClick(View v) {
	    Log.d( "<<<-----","a4" );
        switch (v.getId()){
            case R.id.main_about:{
                Intent intent =new Intent(  );
                intent.setClass( MainActivity.this, About.class );
                startActivity( intent );
               break;
            }
            case R.id.main_search:{
               /* dialog.show();*/
                break;
            }
            case R.id.main_datebaselists:{
	            Log.d( "<<--->>", "aaaa " );
	            break;
            }
            case R.id.main_plantlists:{
	            Log.d( "<<--->>", "bbbb " );
                break;
            }
            case R.id.main_retrivallists:{
	            Log.d( "<<--->>", "cccc " );
                break;
            }
            case R.id.main_myself:{
	            Log.d( "<<--->>", "dddd " );
                break;
            }
            default:
                break;
        }
    }
/*
   SearchDialog dialog = new SearchDialog( context,
            R.style.MyDialog, new SearchDialog.LeaveMyDialogListener (){

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.search_top://监听search的搜索
	                Log.d( "<<--->>", "ffff " );
                    break;
                case R.id.serach_bottom://监听search的扫一扫
	                Log.d( "<<--->>", "gggg " );
                    break;
                default:
                    break;
            }
        }
    } );*/

}
